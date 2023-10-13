package samar.FoodCart.service;

import org.springframework.stereotype.Service;

import samar.FoodCart.bind.FoodBind;

@Service
public interface FoodService {

	public String addFood(FoodBind fb);
}
