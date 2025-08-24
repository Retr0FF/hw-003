//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Задача 1
        System.out.println("Задача 1");
        int myAge = 19;
        byte numberOfStudents = 22;
        short roomNumber = 405;
        long memory = 123456789L;
        float pi = 3.14f;
        double a = 9.80665;

        System.out.println("Значение переменной myAge с типом int равно: " + myAge);
        System.out.println("Значение переменной numberOfStudents с типом byte равно: " + numberOfStudents);
        System.out.println("Значение переменной roomNumber с типом short равно: " + roomNumber);
        System.out.println("Значение переменной memory с типом long равно: " + memory);
        System.out.println("Значение переменной pi с типом float равно: " + pi);
        System.out.println("Значение переменной a с типом double равно: " + a);

        //Задача 2
        System.out.println("\nЗадача 2");
        float value1 = 27.12f;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        int value5 = 27897;
        byte value6 = 67;

        System.out.println("value1 " + value1);
        System.out.println("value2 " + value2);
        System.out.println("value3 " + value3);
        System.out.println("value4 " + value4);
        System.out.println("value5 " + value5);
        System.out.println("value6 " + value6);

        //Задача 3
        System.out.println("\nЗадача 3");
        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;
        short totalSheets = 480;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов");

        //Задача 4
        System.out.println("\nЗадача 4");
        byte bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;

        int bottles20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottles3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottles20Minutes + " шт. бутылок");
        System.out.println("За день машина произвела " + bottlesPerDay + " шт. бутылок");
        System.out.println("За 3 дня машина произвела " + bottles3Days + " шт. бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " шт. бутылок");

        //Задача 5
        System.out.println("\nЗадача 5");
        short totalPaint = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte totalPerClass = (byte) (whitePerClass + brownPerClass);

        int numberOfClasses = totalPaint / totalPerClass;
        int whitePaint = numberOfClasses * whitePerClass;
        int brownPaint = numberOfClasses * brownPerClass;

        System.out.println("В школе где " + numberOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //Задача 6
        System.out.println("\nЗадача 6");
        byte bananaCount = 5;
        short bananaWeight = 80;
        short milkML = 200;
        float milkWeightPer100ML = 105f;
        short iceCreamWeight = 200; // 2 брикета по 100г
        byte eggsCount = 4;
        short eggWeight = 70;

        int totalWeightGrams = (int)
                (
                        (bananaWeight*bananaCount) +
                        (milkML*milkWeightPer100ML / 100) +
                        iceCreamWeight +
                        (eggsCount * eggWeight)
                );
        float totalWeightKg = totalWeightGrams / 1000f;

        System.out.println("Вес спортзавтрака: " + totalWeightGrams + " грамм");
        System.out.println("Вес спортзавтрака: " + totalWeightKg + " килограмм");

        //Задача 7
        System.out.println("\nЗадача 7");
        short weightToLose = 7000; // 7 кг в грамах
        short minLossPerDay = 250;
        short maxLossPerDay = 500;

        int daysMinLoss = weightToLose / minLossPerDay;
        int daysMaxLoss = weightToLose / maxLossPerDay;
        int averageDays = (daysMaxLoss + daysMinLoss) / 2;

        System.out.println("Если терять по 250 грамм в день то потребуется " + daysMinLoss);
        System.out.println("Если терять по 500  грамм в день то потребуется " + daysMaxLoss);
        System.out.println("В среднем потребуется " + averageDays + " дней");

        //Задача 8
        System.out.println("\nЗадача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double prozent = 0.10;

        //Для Маши
        int mashaNewSalary = (int) (mashaSalary * (1 +prozent));
        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Разница за год составляет " + mashaDifference + " рублей");

        //Для Дениса
        int denisNewSalary = (int) (denisSalary * (1 +prozent));
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        System.out.println("Маша теперь получает " + denisNewSalary + " рублей. Разница за год составляет " + denisDifference + " рублей");

        //Для Кристины
        int kristinaNewSalary = (int) (kristinaSalary * (1 +prozent));
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает " + kristinaNewSalary + " рублей. Разница за год составляет " + kristinaDifference + " рублей");


    }
}