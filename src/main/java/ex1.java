//public class ex1 {
//    public static void main(String[] args) {
//    }
//}


//public class ex1 {
//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex-startIndex];
//        stringBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer);
//    }
//}

//public class ex1 {
//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("hello");
//        stringBuffer.append(" world");
//        System.out.println(stringBuffer.toString());
//    }
//}

//public class ex1 {
//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("hello");
//        stringBuffer.reverse();
//        System.out.println(stringBuffer.toString());
//    }
//}

//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
//        над двумя числами и возвращать результат.
//        В классе должен быть метод calculate,
//        который принимает оператор и значения
//        аргументов и возвращает результат вычислений.
//
//        При неверно переданном операторе,
//        программа должна вывести сообщение
//        об ошибке "Некорректный оператор: 'оператор'".



//Реализовать метод, принимающий 2 символа c1 и c2 и четное число n,
//        который возвращает строку, состоящую из символов c1c2 длины n.
//        Пример: (c1 = 'a', c2 = 'b', n = 6 => "ababab")
//public class ex1 {
//    public static void main(String[] args) {
//        var c1 = "a";
//        var c2 = "b";
//        int n = 6;
//        StringBuffer stringBuffer = new StringBuffer();
//
//        for (int i = 0; i < n; i++) {
//            stringBuffer.append(c1).append(c2);
//        }
//        System.out.println(stringBuffer.toString());
//    }
//}



//
//public class ex1 {
//    public static void main(String[] args) {
//
//        float p1 = per(5,4);
//        System.out.println(p1);
//    }
//
//        static float per(float a, float b){
//            float res = 2*(a+b);
//            return res;
//        }
//}

//public class ex1 {
//    public static void main(String[] args) {
//        int n = power(2, 5);
//        System.out.println(n);
//
//    }
//
//    static int power(int a, int b) {
//        if (b == 0) {
//            return 1;
//        } else {
//            return a * power(a, b- 1);
//        }
//    }
//}

//public class ex1 {
//    public static void main(String[] args) {
//        int n = 45;
//        for (int i = 0; i < n; i++) {
//            System.out.println(fib(i));
//        }
//    }
//
//    static int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//}

//1. Создайте программу,
//        которая позволяет пользователю вводить два числа и выводит их сумму.

//import java.util.Scanner;
//
//public class ex1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("введи а");
//        int a = in.nextInt();
//
//        System.out.println("введи b");
//        int b = in.nextInt();
//
//        int c = a + b;
//
//        System.out.println("сумма = " + c);
//
//    }
//}



//2. Напишите программу,
//        которая находит и выводит
//        наименьший элемент в массиве чисел.
//import java.util.Random;
//import java.util.Scanner;
//
//public class ex1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите размер массива:");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            int randomNumber = random.nextInt(100); // генерация случайного числа от 0 до 99
//            arr[i] = randomNumber;
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int min = arr[0];
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println();
//        System.out.println("min = " + min);
//    }
//}


//3. Создайте программу, которая
//        реализует простой калькулятор со следующими
//        функциями: сложение, вычитание, умножение и деление.

//import java.util.Scanner;
//public class ex1 {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        double number1 = scanner.nextDouble();
//
//        System.out.print("Введите второе число: ");
//        double number2 = scanner.nextDouble();
//
//        System.out.println("--- Результаты ---");
//        System.out.println("плюс: " + add(number1, number2));
//        System.out.println("минус: " + subtract(number1, number2));
//        System.out.println("умножение: " + multiply(number1, number2));
//        System.out.println("Деление: " + divide(number1, number2));
//
//        scanner.close();
//    }
//
//    public static double add(double number1, double number2) {
//        return number1 + number2;
//    }
//
//    public static double subtract(double number1, double number2) {
//        return number1 - number2;
//    }
//
//    public static double multiply(double number1, double number2) {
//        return number1 * number2;
//    }
//
//    public static double divide(double number1, double number2) {
//        if (number2 == 0) {
//            throw new ArithmeticException("Деление на ноль запрещено");
//        }
//        return number1 / number2;
//    }
//}

//4. Напишите программу, которая проверяет,
//        является ли заданное число простым. Простое число - это число,
//        которое делится без остатка только на 1 и само на себя.

//public class ex1 {
//    public static void main(String[] args) {
//
//    }
//}


//5. Разработайте программу, которая генерирует случайное число от 1 до 100
//        и позволяет пользователю попытаться угадать
//        это число. Программа должна давать подсказки (
//                например, "Загаданное число больше вашего" +
//        " предположения" или "Загаданное число меньше вашего " +
//        "предположения") до тех пор, пока пользователь не угадает число.

//import java.util.Scanner;
//import java.util.Random;
//
//public class ex1 {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int a = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Предположение: ");
//        int n = scanner.nextInt();
//
//        while (a != n) {
//            if (a > n) {
//                System.out.println("Бери больше");
//            } else if (a < n) {
//                System.out.println("Бери меньше");
//            }
//
//            System.out.println("Предположение: ");
//            n = scanner.nextInt();
//        }
//
//        System.out.println("Да, правильно!");
//    }
//}

//6. Напишите программу, которая переворачивает строку.
//        Например, если входная строка "Hello, World!",
//        программа должна вернуть "!dlroW ,olleH".
//public class ex1 {
//    public static void main(String[] args) {
//    }
//}

//        7. Создайте программу, которая определяет,
//        является ли заданный год високосным.
//        Високосный год - это год, который делится на 4 без остатка,
//        но не делится на 100, за исключением годов, которые делятся на 400 без остатка.

//public class ex1 {
//    public static void main(String[] args) {
//    }
//}


