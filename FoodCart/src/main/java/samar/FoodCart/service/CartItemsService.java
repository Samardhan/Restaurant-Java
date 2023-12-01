package samar.FoodCart.service;

import org.springframework.stereotype.Service;

import samar.FoodCart.bind.CartItemsBind;

@Service
public interface CartItemsService {

	public String addItems(CartItemsBind cib);
}
