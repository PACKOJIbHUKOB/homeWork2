public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1() {
        System.out.println("задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);
    }
    private static void task2() {
        System.out.println("задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);
    }
    private static void task3() {
        System.out.println("задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);
    }
    private static void task4() {
        System.out.println("задача 4");
        var friend = 19;
        System.out.println("friend= " + friend);
        friend = friend * 2;
        System.out.println("friend * 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
    }
    private static void task5() {
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog - 4;
        System.out.println("frog - 4: " + frog);
    }
    private static void task6() {
        System.out.println("задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров = " + totalWeightBoxers + " кг! ");
        var differenceWeightBoxers = weightBoxer1 - weightBoxer2;
        System.out.println("Разница в весе боксеров = " + differenceWeightBoxers + " кг! ");
    }
    private static void task7() {
        System.out.println("задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var differenceWeightBoxers1 = weightBoxer2 - weightBoxer1;
        System.out.println("Второй боксер тяжелее на = " + differenceWeightBoxers1 + " кг! ");
        var differenceWeightBoxers2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе боксеров = " + differenceWeightBoxers2 + " кг! ");
    }
    private static void task8() {
        System.out.println("задача 8");
        var totalHoursWork = 640;
        var numberHoursOneWorker = 8;
        var numberWorkers = totalHoursWork / numberHoursOneWorker;
        System.out.println("Всего работников в компании - " + numberWorkers + " человек ");
        numberWorkers += 94;
        var remainingHoursWork = totalHoursWork % numberWorkers;
        System.out.println("Если в компании работает " + numberWorkers + " человек , то всего " + remainingHoursWork + " часов работы может быть поделено между сотрудниками ");
    }
}