package samar.FoodCart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class CartItemsEntity {
	@Id
	private Integer iId;
	private String iName;
	private Double iPrice;
	private Integer iQuantity;

	@ManyToOne
	@JoinColumn(name="uId")
	private UserEntity user;
}
