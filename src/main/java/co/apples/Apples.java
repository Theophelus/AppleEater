package co.apples;

import java.util.Arrays;
import java.util.List;

public class Apples {
     private static List<Apple> apples = Arrays.asList(
            new Apple(Origin.China, Color.Red, 117),
            new Apple(Origin.Chile, Color.Red, 114),
            new Apple(Origin.Argentina, Color.Yellow, 110),
            new Apple(Origin.Chile, Color.Green, 90),
            new Apple(Origin.SouthAfrica, Color.Red, 67),
            new Apple(Origin.Chile, Color.Green, 116),
            new Apple(Origin.China, Color.Red, 74),
            new Apple(Origin.China, Color.Yellow, 117),
            new Apple(Origin.Chile, Color.Green, 84),
            new Apple(Origin.Argentina, Color.Yellow, 111),
            new Apple(Origin.California, Color.Green, 90),
            new Apple(Origin.SouthAfrica, Color.Red, 67),
            new Apple(Origin.Chile, Color.Green, 116),
            new Apple(Origin.China, Color.Red, 74),
            new Apple(Origin.SouthAfrica, Color.Red, 104),
            new Apple(Origin.China, Color.Yellow, 101),
            new Apple(Origin.Chile, Color.Green, 93),
            new Apple(Origin.SouthAfrica, Color.Red, 75),
            new Apple(Origin.Argentina, Color.Green, 55),
            new Apple(Origin.China, Color.Red, 87),
            new Apple(Origin.Chile, Color.Green, 113),
            new Apple(Origin.California, Color.Red, 111),
            new Apple(Origin.California, Color.Green, 97),
            new Apple(Origin.SouthAfrica, Color.Red, 85),
            new Apple(Origin.Chile, Color.Green, 105));

    public static List<Apple> listOfApples() {
        return apples;
    }
}
