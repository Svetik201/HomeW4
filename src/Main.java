public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age == 18 || age > 18) {
            System.out.println(" Если возраст человека равен 18 , то он совершеннолетний ");
        } else {
            System.out.println(" он не достиг совершеннолетия , нужно немного подождать.");
        }


        int temperature = 5;
        if (temperature > 5) {
            System.out.println(" На улице выше 5 градусов , можно идти без шапки .");
        } else {
            System.out.println(" На улице ниже 5 градусов , нужно одеть шапку .");
        }

        int speed = 60;
        if (speed > 60) {
            System.out.println(" Если скорость выше 60 , то придется заплатить штраф .");
        } else {
            System.out.println(" Е сли скорость меньше или ровно 60 , то можно ездить спокойно .");
        }

        int agE = 2;
        agE = 6;
        if (agE >= 2 || agE <= 6) {
            System.out.println(" Если человеку от 2 до 6 лет , то ему нужно ходить в детский сад . ");
        }
        agE = 7;
        agE = 17;
        if (agE >= 7 || agE <= 17) {
            System.out.println(" Если человеку от 7 до 17 лет , то ему нужно ходить в школу .");
        }
        agE = 18;
        agE = 24;
        if (agE >= 18 || agE <= 24) {
            System.out.println(" Если человеку больше или ровно 18 лет , но меньше или ровно 24 , то его место в университете .");
        }
        agE = 24;
        if (agE > 24 || agE == 24) {
            System.out.println(" Если возраст человека больше 24 лет , то ему нужно ходить на работу .");
        }
        int kid = 5;
        if (kid < 5) {
            System.out.println(" Если ребенку больше 5 лет , то он может кататься с сопровождением взрослого .");
        } else {
            System.out.println(" Если ребенку меньше 5 лет , то он не может кататься на атракционе .");
        }
        int kids = 14;
        boolean ageKids;
        if (kids > 5 && kids < 14) ageKids = true;
        else ageKids = false;
            System.out.println(" Если ребенку больше 5 , но меньше 14 лет , то он может кататься только в сопровождении взрослого . Если взрослого нету то кататься нельзя .");


        int kids1 = 14;
        if (kids1 > 14) {
            System.out.println(" Если ребенок младше 14 лет , то он может кататься с сопровождением взрослого .");
        } else {
            System.out.println(" Если ребенок старше 14 лет , то он может кататься без сопровождения взрослых .");
        }

        int totalNumberOfSeats = 102;
        boolean seatingPositions;
        if (60 < 102) seatingPositions = true;
        else seatingPositions = false;
        System.out.println(" всего 60 сидячих мест.");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
        } else if (two > one && two < three) {
            System.out.println(" two ,большее число");
        } else {
            System.out.println(" Three большее число");


        }

    }
}




















