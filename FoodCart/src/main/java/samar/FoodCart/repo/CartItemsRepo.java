package samar.FoodCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import samar.FoodCart.entity.CartItemsEntity;

public interface CartItemsRepo extends JpaRepository<CartItemsEntity,Integer>{

}
