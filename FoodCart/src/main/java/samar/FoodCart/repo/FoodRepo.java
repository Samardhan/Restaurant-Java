package samar.FoodCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import samar.FoodCart.entity.FoodEntity;


public interface FoodRepo extends JpaRepository<FoodEntity, Integer>{

}
