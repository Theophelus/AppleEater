package co.apples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HowManyApples implements IHowManyApples {

    private final List<Apple> apples;

    public HowManyApples(List<Apple> apples)
    {
        this.apples = apples;
    }

    @Override
    public int areFromArgentina() {
        final List<Apple> applesFromArg = new ArrayList<>();
        for (Apple a: apples) {
            if (a.getOrigin() == Origin.Argentina) {
                applesFromArg.add(a);
            }
         }
        return applesFromArg.size();
    }

    @Override
    public int areRed() {
        final List<Apple> redApples = new ArrayList<>();

        for (Apple red: apples) {
            if (red.getColor() == Color.Red) {
                redApples.add(red);
            }
        }
        return redApples.size();
    }

    @Override
    public int howManyAppleFromChinaHeavier110g() {

        final List<Apple> applesChina = new ArrayList<>();
        for (Apple a: apples) {
            if (a.getOrigin() == Origin.China && a.getWeight() > 110) {
                applesChina.add(a);
            }
        }
        return applesChina.size();
    }

    @Override
    public int areFrom(Origin origin) {

        return 0;
    }

    @Override
    public int howManyApplesFromHeavier(Origin origin, int weight) {
        return 0;
    }

    @Override
    public int howManyApples(Predicate<Apple> applePredicate){
        return 0;
    }



}
