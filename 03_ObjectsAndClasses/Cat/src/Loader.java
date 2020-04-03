
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        System.out.println("Cat1 weight: " + cat1.getWeight());
        cat1.meow(16272);
        System.out.println("Cat1 weight: " + cat1.getWeight());
        System.out.println("Cat1:        " + cat1.getStatus());
        


        Cat cat2 = new Cat();
        System.out.println("Cat2 weight: " + cat2.getWeight());
        System.out.println("Cat2:        " + cat2.getStatus());


        Cat cat3 = new Cat();
        System.out.println("Cat3 weight: " + cat3.getWeight());
        System.out.println("Cat3:        " + cat3.getStatus());

        Cat cat4 = new Cat();
        cat4.drink(4565.4);
        System.out.println("Cat4:        " + cat4.getStatus());

        Cat cat5 = new Cat();
        cat5.feed(44445.4);
        System.out.println("Cat5:        " + cat5.getStatus());


    }
}