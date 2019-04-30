package co.apples;

public class Apple {

    private Origin origin;
    private Color color;
    private int weight;

    public Apple(Origin origin, Color color, int weight){
        this.origin = origin;
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Origin getOrigin() {
        return origin;
    }

    @Override
    public String toString() {

        return String.format("A %s apple from %s weighing %d", color, origin, weight);


    }
}
