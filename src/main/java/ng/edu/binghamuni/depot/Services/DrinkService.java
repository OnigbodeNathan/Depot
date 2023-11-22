package ng.edu.binghamuni.depot.Services;

import ng.edu.binghamuni.depot.domain.Drink;

import java.util.List;

public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrinks();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);

}
