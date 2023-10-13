package samar.FoodCart.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import samar.FoodCart.bind.FoodBind;
import samar.FoodCart.entity.FoodEntity;
import samar.FoodCart.repo.FoodRepo;
import samar.FoodCart.service.FoodService;

@RestController
@CrossOrigin(origins = "*")
public class FoodRest {

	@Autowired
	private FoodRepo fr;

	@Autowired
	private FoodService fs;

	@GetMapping(value = "/getFood", produces = "application/json")
	public List<FoodEntity> getFoodcart() {

		return fr.findAll();
	}

	@PostMapping(value = "/addFood", consumes = "application/json", produces = "application/json")
	public String addFood(@RequestBody FoodBind fb) {
		String ret = fs.addFood(fb);

		return ret;
	}

}