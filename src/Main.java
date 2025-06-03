import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~Task 1~~~~~");
        int age = 19;
        int prohibits = 18;
        if (age >= prohibits) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного " +
                    "подождать»");
        }
        System.out.println("~~~~~Task 2~~~~~");
        int temperature = 20;
        int temperatureAir = 5;
        if (temperature <= temperatureAir) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("~~~~~Task 3~~~~~");
        int speed = 75;
        int limitation = 60;
        if (speed > limitation) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("~~~~~Task 4~~~~~");
        int ages = 25;
        int minThresholdKindergarten = 2;
        int maxThresholdKindergarten = 6;
        int minThresholdSchool = 7;
        int maxThresholdSchool = 17;
        int minThresholdUniversity = 18;
        int maxThresholdUniversity = 24;
        if (ages >= minThresholdKindergarten && ages <= maxThresholdKindergarten) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский садик");
        }

        if (ages >= minThresholdSchool && ages <= maxThresholdSchool) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу");
        }

        if (ages >= minThresholdUniversity && ages <= maxThresholdUniversity) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить на работу");
        }
        System.out.println("~~~~~Task 5~~~~~");
        int attraction = 9;
        int forbidden = 5;
        int accompaniment = 14;
        if (attraction < forbidden) {
            System.out.println("Если возраст ребенка равен " + attraction + ", то ему нельзя кататься на аттракционе");
        }

        if (attraction > forbidden && attraction < accompaniment) {
            System.out.println("Если возраст ребенка равен " + attraction + ", то ему можно кататься на аттракционе " +
                    "в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + attraction + ", то ему можно кататься без сопровождения" +
                    "взрослого");
        }
        System.out.println("~~~~~Task 6~~~~~");
        int capacityOneTrain = 102;
        int sit = 60;
        int passengers = 52;
        if (passengers < sit) {
            System.out.println("Есть сидячие места");
        } else if (passengers > sit && passengers < capacityOneTrain) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Мест нету");
        }
        System.out.println("~~~~~Task 7~~~~~");
        int one = 44;
        int two = 21;
        int three = 92;
        if (one > two && one > three) {
            System.out.println(one + " из трех чисел большее");
        } else if (two > three && two > one) {
            System.out.println(two + " из трех чисел большее");
        } else {
            System.out.println(three + " из трех чисел большее");
        }
    }
}
