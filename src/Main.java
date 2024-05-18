public class Main {
    public static void main(String[] args) {
        System.out.println("Тема ДЗ команда цикла - for");
        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int i = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Значение " + i);
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        // в аккумуляторе "i" уже лежит цифра 10
        for (; i > 0; i--) {
            System.out.println("Значение " +i);
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (; i <= 17; i += 2) {if (i != 0) {
            System.out.println("Четные значения " +i);}
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (i = 10; i >= -10; i -= 1) {
            System.out.println("Значение " +i);
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (i = 1904; i <= 2096; i += 4) {
            System.out.println(i+ " год является високосным");
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (i = 7; i <=98; i += 7) {
            System.out.println("Числовой ряд " +i);
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (i = 1; i <= 512; i *= 2) {
            System.out.println("Числовой ряд " +i);
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        int contribution = 29000;
        float accumulation = 0;
        int month = 0;
        for (month = 1; month <= 12; month++) {
            //accumulation = contribution * month ;
            System.out.println("Месяц " +month+ " сумма накоплений равна " +(accumulation += contribution)+ " рублей.");
        }

        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        //int contribution = 29000;
        accumulation = 0;
        //int month = 0;
        int theInterestRate = 12;
        for (month = 1; month <= 12; month++) {
            //accumulation = contribution * month ;
            System.out.println("Месяц " +month+ " сумма накоплений равна " +(accumulation = (accumulation*(1 + (float)(theInterestRate)/1200) + contribution))+ " рублей.");
        }
        System.out.println();
        System.out.println("Задача № " +(dZ += 1));
        System.out.println();
        for (i = 1; i <= 10; i++) {
            System.out.println("2 * " +i+ " = " +2 * i);
        }
    }
}