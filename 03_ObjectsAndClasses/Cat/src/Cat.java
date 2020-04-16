
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public static double count;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double amountFood;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFood = 150.00;


    }


    public boolean isAlive(){
        if (getWeight() >= minWeight && getWeight() <= maxWeight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double getCount()
    {
        return count;
    }


    private void setWeight(Double weight) {
        if (isAlive())
        {
            this.weight = weight;
            if (!isAlive())
            {
                count--;
                System.out.println("");

            }
        }
    }

    private void addWeight(Double weight)
    {
        setWeight(getWeight() + weight);
    }

    public double feed(Double amount)

    {

        if (isAlive())
        {
            addWeight(amount);
        }

        return amountFood;
    }

    public void meow(int amount)
    {
        weight = weight - amount;
        System.out.println("Meow");
    }




    public void pee()
    {
        weight = weight - 1;
        System.out.println("Uuhoo");
    }



    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
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