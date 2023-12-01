package samar.FoodCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import samar.FoodCart.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Integer>{

}
