package samar.FoodCart.bind;

import javax.persistence.Id;

import lombok.Data;

@Data
public class CartItemsBind {
	
	@Id
	private Integer iId;
	private String iName;
	private Double iPrice;
	private Integer iQuantity;
	


}
