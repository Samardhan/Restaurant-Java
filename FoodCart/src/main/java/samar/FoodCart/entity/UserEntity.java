package samar.FoodCart.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	private String uName;
	private Long uNum;
	private String uEmail;
	private Date uCreated;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<CartItemsEntity> itemsList;
}
