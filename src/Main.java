public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18 || age < 18) {
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

        age = 2;
        age = 6;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если человеку от 2 до 6 лет , то ему нужно ходить в детский сад . ");
        }
        age = 7;
        age = 17;
        if (age >= 7 && age <= 17) {
            System.out.println(" Если человеку от 7 до 17 лет , то ему нужно ходить в школу .");
        }
        age = 18;
        age = 24;
        if (age >= 18 && age <= 24) {
            System.out.println(" Если человеку больше или ровно 18 лет , но меньше или ровно 24 , то его место в университете .");
        }
        int years = 24;
        if (years > 24){
            System.out.println(" Если возраст человека больше 24 лет , то ему нужно ходить на работу .");
    }
        int kid = 5;
        if (kid < 5) {
            System.out.println(" Если ребенку меньше 5 лет , то он не может кататься на атракционе.");
        }
        kid = 5;
        kid = 14;
        if (kid > 5 && kid < 14) {
            System.out.println(" Если ребенку больше 5 , но меньше 14 лет , то он может кататься только в сопровождении взрослого . Если взрослого нет то кататься нельзя .");
        }
        kid = 14;
        if (kid > 14) {
            System.out.println(" Если ребенок старше 14 лет , то он может кататься без сопровождения взрослого .");
        }

        int totalNumberOfSeats = 102;
        int seatingPositions = 60;
        int standingPlaces = totalNumberOfSeats - seatingPositions;
        if (seatingPositions >= 60) {
            System.out.println(" Сидячих мест всего 60 . ");
        } else {
            System.out.println(" Вагон полностью забит .");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && two < three) {
            System.out.println(" 3 большее число ");
        } else {
            System.out.println(" 1 и 2 меньшие числа .");
        }

  }
}








