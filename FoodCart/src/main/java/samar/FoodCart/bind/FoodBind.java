package samar.FoodCart.bind;

import javax.persistence.Id;

import lombok.Data;

@Data
public class FoodBind {

	@Id
	private Integer fId;
	private String fName;
	private Double fPrice;
	private Integer fQuantity;

}
