package day13;

import java.util.function.Predicate;

public class VegePredicate implements Predicate<Dish> {

      @Override
    public boolean test(Dish dish) {
        return dish.isVegeterian(); //채식주의자가 맞으면 true
    }
}
