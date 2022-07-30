package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("5 Cow");
        Cow cow = new Cow(400, 11, "female", "№ 10");
        Cow cow2 = new Cow(300, 9, "female", "№ 11");
        Cow cow3 = new Cow(500, 13, "female", "№ 12");
        Cow cow4 = new Cow(250, 8, "female", "№ 13");
        Cow cow5 = new Cow(500, 14, "female", "№ 14");


        System.out.println(" 2 Horse");
        Horse horse = new Horse(500, 10, "male", "Kaneki");
        Horse horse1 = new Horse(460, 5, "female", "Kashka");

        System.out.println("3 Sheep");
        Sheep sheep = new Sheep(80, 5, "female", "№ 556 ");
        Sheep sheep2 = new Sheep(110, 7, "female", "№  767");
        Sheep sheep3 = new Sheep(90, 6, "female", "№ 888");

        Farm1 farm1 = new Farm1("Moscow", "Nurmuhanbet",
                new Cow[]{cow, cow2, cow3, cow4, cow5}, new Horse[]{horse, horse1},
                new Sheep[]{sheep, sheep2, sheep3});
        System.out.println(farm1);
        System.out.println("_____________");


        Farm2 farm2 = new Farm2("Kara Suu", "Marat Alymov",
                new Cow[]{cow}, new Horse[]{horse}, new Sheep[]{sheep});
        System.out.println(farm2);
    }
}
