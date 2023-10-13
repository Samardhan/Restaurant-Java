package samar.FoodCart.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import samar.FoodCart.bind.FoodBind;
import samar.FoodCart.entity.FoodEntity;
import samar.FoodCart.repo.FoodRepo;
import samar.FoodCart.service.FoodService;

@Service
public class FoodServImpl implements FoodService {
	
	@Autowired
	private FoodRepo fr;
	
	public String addFood(FoodBind fb) {
		FoodEntity fe=new FoodEntity();
		
		BeanUtils.copyProperties(fb, fe);
		
		fr.save(fe);
		
		return "Added";
	}

	

}
