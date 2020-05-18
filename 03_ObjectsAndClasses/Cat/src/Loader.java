public class Loader {


    private static Cat getKitten() {
        Cat kitten = new Cat(1100.00);
        System.out.println("Родился котенок весом " + kitten.getWeight());
        return kitten;
    }


    public static void main(String[] args) {

        getKitten().getWeight();

        Cat original = new Cat(4, "Jay");
        Cat clone = new Cat(original);
        System.out.println(original);
        System.out.println(clone);
        Cat richard = new Cat();
        richard.setName("Ричард");
        Cat tom = richard;
        tom.setName("Том");
        System.out.println(richard.getName());

        //==================================================

        Cat murka = new Cat("Мурка");
        System.out.println("Создали Мурку ");
        System.out.println("Вес Мурки " + murka.getWeight());
        //цвет кошки
        CatColor color = CatColor.YELLOW;
        switch (color){
            case BLACK:
                System.out.println("Цвет Мурки - черный ");
                break;
            case GREY:
                System.out.println("Цвет Мурки - серый");
                break;
            case YELLOW:
                System.out.println("Цвет Мурки - желтый");
                break;
            case GREEN:
                System.out.println("Цвет Мурки - зелёный");
                break;

        }
        System.out.println("Количество кошек в начале = " + Cat.getCount());

        // ==================================================
        System.out.println("Создали кошку");
        Cat vasya = new Cat();
        System.out.println("Вес Васьки = " + vasya.getWeight());
        System.out.println("Количество кошек = " + Cat.getCount());
        System.out.println("Покормили кошку");
        double feed = vasya.feed(9999.9);
        System.out.println("Вес кошки = " + vasya.getWeight());
        System.out.println("Стало кошек = " + Cat.getCount());
        System.out.println(vasya.isAlive());
        System.out.println();
        // ===================================================
        Cat cat = new Cat();
        System.out.println(cat.getWeight());
        cat.pee(32.3);
        System.out.println(cat.getWeight());

        System.out.println(cat.feed(546.5) * 2);

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