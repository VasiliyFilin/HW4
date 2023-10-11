public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1:");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();

        //Задача 2

        System.out.println("Задача 2:");
        int temperature = -1;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        System.out.println();

        //Задача 3

        System.out.println("Задача 3:");
        int currentSpeed = 65;
        if (currentSpeed > 60) {
            System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф!");
        }
        else {
            System.out.println("Если скорость " + currentSpeed + ", можно ездить спокойно!");
        }
        System.out.println();

        //Задача 4

        System.out.println("Задача 4:");
        int age1 = 18;

        if (2 <= age1 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 +
                    ", то ему нужно ходить в детский сад");
        }
        else if (7 <= age1 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 +
                    ", то ему нужно ходить в школу");
        }
        else if (18 <= age1 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 +
                    ", то его место в университете");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 +
                    ", то ему пора ходить на работу");
        }
        else {
            System.out.println("Возраст указан не корректно!");
        }
        System.out.println();

        //Задача 5

        System.out.println("Задача 5:");
        var age2 = 12;
        boolean adult = true;
        boolean ageWithAdult = 5 <= age2 && age2 < 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 +
                    ", то он не может кататься!");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + 
                    ", то он может кататься без сопровождения взрослого");
        } else if (ageWithAdult && adult) {
            System.out.println("Если возраст ребенка равен " + age2 +
                    ", то он может кататься в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age2 +
                    ", то он не может кататься без сопровождения взрослого!");
        }
        System.out.println();

        //Задача 6

        System.out.println("Задача 6:");
        int capacity = 102;
        int seats = 60;
        int standees =  capacity - seats;
        int seatsOccupied = 50;
        int standeesOccupied = 0;
        boolean freeSeats = seatsOccupied < seats;
        boolean freeStandees = standeesOccupied < standees;
        if (freeSeats && freeStandees) {
            System.out.println("В вагоне свободно сидячих мест: " + (seats - seatsOccupied) +
                    " и стоячих мест: " + (standees - standeesOccupied));
        }
        else if (freeSeats && freeStandees == false) {
            System.out.println("В вагоне свободно " + (seats - seatsOccupied) +
                    " сидячих мест(а)");
        }
        else if (freeStandees && freeSeats == false) {
            System.out.println("В вагоне свободно " + (standees - standeesOccupied) +
                    " стоячих мест(а)");
        }
        else{
            System.out.println("В вагоне все места заняты!");
        }
        System.out.println();

        //Задача 7

        System.out.println("Задача 7:");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else if (three > one && three > two) {
            System.out.println(three);
        }
        else {
            System.out.println("Все значения равны " + one);
        }
    }
}