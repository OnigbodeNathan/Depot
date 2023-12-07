package ng.edu.binghamuni.depot.controller;

import ng.edu.binghamuni.depot.Services.DrinkService;
import ng.edu.binghamuni.depot.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DrinkController {
    @Autowired
    DrinkService drinkService;

    @GetMapping("/")
    public String homepage(Model model){
        Drink drink = new Drink();
        model.addAttribute("drink", drink);
        return "new drink";
    }
    @GetMapping("/showNewDrinkForm")
    public String showNewDrinkForm(Model model){

        return null;
    }

}
