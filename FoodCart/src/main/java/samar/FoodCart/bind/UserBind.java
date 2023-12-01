package samar.FoodCart.bind;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class UserBind {

	@Id
	private Integer uId;
	private String uName;
	private Long uNum;
	private String uEmail;
	private Date uCreated;
	

}
