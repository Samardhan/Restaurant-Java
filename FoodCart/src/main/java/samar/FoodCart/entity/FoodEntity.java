package samar.FoodCart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class FoodEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fId;
	private String fName;
	private Double fPrice;
	private Integer fQuantity;

}
