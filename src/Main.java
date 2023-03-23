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
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        var weightDifference2 = secondBoxer % firstBoxer;
        System.out.println(weightDifference2);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var countHours = 640;
        var hoursForOneWorker = 8;
        var countWorkers = countHours / hoursForOneWorker;
        System.out.println("Всего работников в компании — " + countWorkers + " человек");
        var countWorkers2 = countWorkers + 94;
        var countHours2 = countWorkers2 * hoursForOneWorker;
        System.out.println("Если в компании работает " + countWorkers2 + " человек, то всего " + countHours2 + " часов работы может быть поделено между сотрудниками");




    }
}