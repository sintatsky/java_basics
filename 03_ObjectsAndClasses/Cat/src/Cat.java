
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    private static double count;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double amountFood;
    private double totalEatenFood;

    private String name;



    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 150.00;

    }


    public boolean isAlive(){
         return weight >= minWeight && weight <= maxWeight;

    }


    public static double getCount()
    {
        return count;
    }



    public double feed(Double amount) {

        if (isAlive()) {
            totalEatenFood = totalEatenFood + amount;
            weight = weight + amount;
            decreaseCountIfDead();
        }

        return amountFood;
    }

    public void meow(int amount) {
        weight = weight - amount;
        System.out.println("Meow");
    }

    private void decreaseCountIfDead() {
        if (!isAlive()) {
            count--;
        }
    }


    public void pee() {
        weight = weight - 1;
        System.out.println("Uuhoo");
    }



    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}