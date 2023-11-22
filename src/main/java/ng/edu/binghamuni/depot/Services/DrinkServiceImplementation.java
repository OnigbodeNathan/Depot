package ng.edu.binghamuni.depot.Services;

import ng.edu.binghamuni.depot.Repository.DrinkRepository;
import ng.edu.binghamuni.depot.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DrinkServiceImplementation implements DrinkService{
    @Autowired
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        Optional<Drink> drink = drinkRepository.findById(id);
        Drink theDrink = null;
        if (drink.isPresent()) {
            theDrink = drink.get();
            return theDrink;
        } else {
            throw new RuntimeException("Drink not found");
        }
    }

    @Override
    public List<Drink> getAllDrinks() {

        return drinkRepository.findAll();
    }

    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> oldDrink = drinkRepository.findById(drink.getId());
        if (oldDrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink = oldDrink.get();
            updateDrink.setCapacity(oldDrink.get().getCapacity());
            updateDrink.setColor(oldDrink.get().getColor());
            updateDrink.setName(oldDrink.get().getName());
            updateDrink.setCompany(oldDrink.get().getCompany());
            updateDrink.setType(oldDrink.get().getType());
            updateDrink.setIngredientList(oldDrink.get().getIngredientList());

            drinkRepository.save(updateDrink);
            return updateDrink;
        }
        else{
            throw new RuntimeException("Drink not found");
        }

    }

    @Override
    public void deleteDrink(long id) {
    drinkRepository.deleteById(id);
    }
}
