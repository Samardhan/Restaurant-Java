package samar.FoodCart.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import samar.FoodCart.bind.UserBind;
import samar.FoodCart.entity.UserEntity;
import samar.FoodCart.repo.UserRepo;
import samar.FoodCart.service.UserService;

@Service
public class UserServImpl implements UserService {

	@Autowired
	private UserRepo ur;

	public String addUser(UserBind ub) {
		

		UserEntity ue = new UserEntity();
		BeanUtils.copyProperties(ub, ue);

		ur.save(ue);

		return "added";
	}

}
