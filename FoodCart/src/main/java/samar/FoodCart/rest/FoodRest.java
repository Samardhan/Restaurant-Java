package samar.FoodCart.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import samar.FoodCart.bind.FoodBind;
import samar.FoodCart.bind.UserBind;
import samar.FoodCart.entity.FoodEntity;
import samar.FoodCart.repo.FoodRepo;
import samar.FoodCart.service.FoodService;
import samar.FoodCart.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class FoodRest {

	@Autowired
	private FoodRepo fr;

	@Autowired
	private FoodService fs;
	
	@Autowired
	private UserService us;

	@GetMapping(value = "/getFood", produces = "application/json")
	public List<FoodEntity> getFoodcart() {

		return fr.findAll();
	}

	@PostMapping(value = "/addFood", consumes = "application/json", produces = "application/json")
	public String addFood(@RequestBody FoodBind fb) {
		String ret="";
		if(fb.getFId()==null||fb.getFName()==""||fb.getFPrice()==null||fb.getFQuantity()==null) {
			ret="Enter All Details";
		}
		else {
		ret = fs.addFood(fb);
		}
		System.out.println(fb);

		return ret;
	}
	
	@PostMapping(value = "/adduser", consumes = "application/json", produces = "application/json")
	public String addUser(@RequestBody UserBind ub) {
		
		String resp=us.addUser(ub);
		
		return resp;
	}

}
