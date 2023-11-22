package ng.edu.binghamuni.depot.controller.api;

import ng.edu.binghamuni.depot.Repository.DrinkRepository;
import ng.edu.binghamuni.depot.Services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;
    @RequestMapping("/drinks")
    @GetMapping("/drinks")

}
