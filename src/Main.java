public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        int vklad = 0;
        int month = 0;
        int summ = 2_459_000;
        while (vklad < summ) {
            month = month + 1;
            vklad = vklad + 15000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + vklad + " рублей.");
        }
    }
    public static void task2() {
        System.out.println("Задача № 2.");
        int b = 0;
        while (b < 10) {
            b = b + 1;
            System.out.print(" " + b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(" " + c + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача № 3.");
        int population = 12_000_000;
        byte birthRate = 17;
        byte mortality = 8;
        int dinamicPopulation = birthRate - mortality; // Динмика численности населения за год.
        int year = 0;
        while (year < 10) {
            year = year + 1;
            //Расчёт динамики населения страны за указанный период.
            population += (population * dinamicPopulation) / 1000; // += оператор добавления эквивалентно Ns = Ns + (Ns * Dns) / 1000  ;
            System.out.println("Год " + year + " численность на селения будет составлять. " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача № 4.");
        int vkladBegin = 15000;
        int month = 0;
        int target = 12_000_000;
        byte prozent = 7;
        while (vkladBegin < target) {
            int VkladProzent = vkladBegin / 100 * prozent;
            vkladBegin = vkladBegin + VkladProzent;
            month = month + 1;
            System.out.println("За " + month + " месяц, сумма накоплений составит " + vkladBegin);
        }
    }
    public static void task5() {
        System.out.println("Задача № 5.");
        int vkladBegin2 = 15000;
        int month = 0;
        int target = 12_000_000;
        byte prozent = 7;
        while (vkladBegin2 < target) {
            int vkladProzent = vkladBegin2 / 100 * prozent;
            vkladBegin2 = vkladBegin2 + vkladProzent;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев, сумма накоплений составит " + vkladBegin2);
            }
        }
    }
    public static void task6() {
        System.out.println("Задаача № 6.");
        int vkladBegin3 = 15000;
        byte month = 0;
        byte year = 9;
        byte prozent = 7;
        while (month <= year * 12) {
            int vkladProzent = vkladBegin3 / 100 * prozent;
            vkladBegin3 = vkladBegin3 + vkladProzent;
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев, сумма накоплений составит " + vkladBegin3);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача № 7.");
        int daysInMonth = 31;
        int firstFriday = 3;
        //Цикл дней месяца, если день месяца равен рсссчитаному дню до следующей пятницы,
        // значит скгодня отчётный день. Cчётчик пятниц в месяце. Рассчитанный день до следующей пятницы встроен в цикл.
        for (; firstFriday <= daysInMonth; firstFriday += 7) {
            System.out.println("Сегодня пятница, отчётный день " + firstFriday + " е число," +
                    "нужно подготовить отчёт.");
        }
    }
    public static void task8() {
        System.out.println("Задача № 8.");
        short year = 2023;
        byte period = 79;
        int timePrileta = 0;
        //Расчёт времнени прилёта кометы за последние 200 летот тнкущего года.
        for(int i = 0; i < year + 100; i += 79 ) {
            timePrileta = period + timePrileta;
            // Расчёт времкни следующего прилёта кометы (2054 год.)
            if (year - 200 < timePrileta) {
                System.out.println("Год прилета кометы -  " + timePrileta);
            }
        }
    }
}
// Вроде ничего не забыл.
// При пуше произошла ошибка, не помню какая. За пушил только со второго раза, пушил как обычно.
//Последние две задачи самые сложные.
// Домашнее задание считаю выполненным.

