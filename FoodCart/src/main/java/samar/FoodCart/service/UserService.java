package samar.FoodCart.service;

import org.springframework.stereotype.Service;

import samar.FoodCart.bind.UserBind;

@Service
public interface UserService {

	public String addUser(UserBind ub);
	
}
