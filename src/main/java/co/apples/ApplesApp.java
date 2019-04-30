package co.apples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


interface Greet {
    int sayHello(String name);
}

//class Greeter implements Greet{
//    @Override
//    public String sayHello(String name) {
//        return "Hello, " + name;
//    }
//}

public class ApplesApp {


    public static List<Apple> applesWithColor(List<Apple> apples, Function<Apple, Boolean> appleCheck) {
        List<Apple> yellowApples = new ArrayList<>();
        for(Apple apple : apples) {
            if (appleCheck.apply(apple)) {
                yellowApples.add(apple);
            }
        }
        return yellowApples;
    }

    public static void main(String[] args) {

        final List<Apple> apples = Apples.listOfApples();
        HowManyApples howManyApples = new HowManyApples(apples);
        //from Argentina
        System.out.println(howManyApples.areFromArgentina());
        //how many are red
        System.out.println(howManyApples.areRed());
        //how many from china are heavier than 110g
        System.out.println(howManyApples.howManyAppleFromChinaHeavier110g());

        Function<String, Boolean> isLongerThanFive = (str) -> str.length() > 5;

        System.out.println(isLongerThanFive.apply("Andre"));
        System.out.println(isLongerThanFive.apply("Andrew"));
        System.out.println("------------");

        List<Apple> listOfRedApples = applesWithColor(apples,
                (apple) -> apple.getColor() == Color.Red
                        && apple.getOrigin() == Origin.Argentina );

//      List<Apple> listOfYellowApples = applesWithColor(apples, Color.Yellow);

        System.out.println(listOfRedApples.size());
//        System.out.println(listOfYellowApples.size());

//        Greet greet = (name) -> {
//            return name.length();
//        };

        //System.out.println(greet.sayHello("André"));
    }
}
