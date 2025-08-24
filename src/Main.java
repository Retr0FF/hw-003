//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
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

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + "листов");
    }
}