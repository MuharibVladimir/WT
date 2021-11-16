package by.bsuir.web.class_and_object;

enum Color{
    Blue,
    Red,
    Green,
    Yellow,
    White
}

public class Ball {

    private final int weight;
    private final Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}