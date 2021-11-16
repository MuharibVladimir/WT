package by.bsuir.web.class_and_object;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(5, Color.Blue);
        basket.addBall(7, Color.Yellow);
        basket.addBall(6, Color.Blue);
        basket.addBall(8, Color.Green);
        basket.addBall(2, Color.Red);
        basket.addBall(4, Color.Blue);

        int totalWeight = basket.getWeight();
        System.out.println("Total weight of basket: " + totalWeight);
        int totalBlue = basket.getNumBalls(Color.Blue);
        System.out.println("Number of blue balls: " + totalBlue);
    }
}
