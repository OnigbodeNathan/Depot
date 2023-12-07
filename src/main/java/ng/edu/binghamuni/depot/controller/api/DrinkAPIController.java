package ng.edu.binghamuni.depot.controller.api;

import ng.edu.binghamuni.depot.Repository.DrinkRepository;
import ng.edu.binghamuni.depot.Services.DrinkService;
import ng.edu.binghamuni.depot.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks/{id}")
    @GetMapping()
    public ResponseEntity<Drink> getDrinkById(@PathVariable long id){
        return ResponseEntity.ok().body(drinkService.getDrinkById(id));
    }
    @GetMapping("/drink")
    public ResponseEntity<List<Drink>> getAllDrinks(){
        return ResponseEntity.ok().body(drinkService.getAllDrinks());
    }
    @PostMapping("/drink")
    public ResponseEntity<Drink> createDrink(@RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.saveDrink(drink));
    }

    @PutMapping("/drink/{id}")
    public ResponseEntity<Drink> updateDrink (@PathVariable long id, @RequestBody Drink drink)
    {
        return ResponseEntity.ok().body(drinkService.updateDrink(drink));
    }

    @DeleteMapping ("/drinks")
    public HttpStatus deleteDrink (@PathVariable long id){
        drinkService.deleteDrink(id);
        return HttpStatus.OK;
    }


}
