package co.apples;

import java.util.function.Predicate;

public interface IHowManyApples {
    int areFromArgentina();

    int areRed();

    int howManyAppleFromChinaHeavier110g();

    int areFrom(Origin origin);

    int howManyApplesFromHeavier(Origin origin, int weight);

    int howManyApples(Predicate<Apple> applePredicate);
}
