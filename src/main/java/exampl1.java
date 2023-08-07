// /**
//  * ja
//  */
//public class exampl1 {
//
//      public static void main(String[] args) {
//         System.out.println("good123");
//     }
//}


// 1. Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;
// public class ja {
//     public static void main(String[] args) {
//         int k = 2; // заданная степень многочлена
//         List<Integer> coefficients = generateCoefficients(k);
//         String polynomial = createPolynomial(coefficients, k);
//         System.out.println(polynomial);
//     }
//     // метод для генерации случайных коэффициентов
//     public static List<Integer> generateCoefficients(int k) {
//         List<Integer> coefficients = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i <= k; i++) {
//             coefficients.add(random.nextInt(101)); // генерация случайного значения от 0 до 100
//         }
//         return coefficients;
//     }
//     // метод для создания строки многочлена
//     public static String createPolynomial(List<Integer> coefficients, int k) {
//         StringBuilder polynomial = new StringBuilder();
//         for (int i = k; i >= 0; i--) {
//             int coefficient = coefficients.get(i);
//             if (coefficient != 0) {
//                 polynomial.append(coefficient);
//                 if (i > 0) {
//                     polynomial.append("*x^").append(i).append(" + ");
//                 }
//             }
//         }
//         return polynomial.toString();
//     }
// }





// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов


// 1. Напишите программу, которая выводит на экран "Hello, World!".
/**
 * ja
 */
// public class ja {

//     public static void main(String[] args) {
//         System.out.println("hello wordld");
//     }
// }

// 2. Напишите программу, которая находит сумму двух чисел и выводит результат.
// public class ja {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;
//         int c = a + b;
//         System.out.println("сумма " + a + " + " + b + " = " + c);
//     }
// }


// 3. Напишите программу, которая находит среднее арифметическое трех чисел и выводит результат.

// import java.util.Random;
// public class ja {
//     public static void main(String[] args) {
//         // Создание объекта класса Random
//         Random random = new Random();
//         // Генерация двух случайных чисел
//         int a = random.nextInt(11);
//         int b = random.nextInt(11);
//         int c = random.nextInt(11);

//         double avg = (a + b + c)/3.0;

//         // Вывод результатов
//        System.out.println("ср ареф между " + a + " , " + b + " , " + c + " равно "+ avg);
//     }
// }

// 4. Напишите программу, которая находит максимальное число из трех заданных и выводит его.

//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class ja {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите длину массива: ");
//        int length = scanner.nextInt();
//
//        // Создаем массив указанной пользователем длины
//        int[] array = new int[length];
//
//        // Заполняем массив случайными числами от 0 до 10
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(11); // Генерируем случайное число от 0 до 10
//        }
//
//        // Выводим полученный массив
//        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
//
//        int max = array[0]; // Предполагаем, что первое число самое большое
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное значение в массиве: " + max);
//    }
//}

// 5. Напишите программу, которая проверяет, является ли заданное число четным или нечетным.

/*
public class exampl1 {

    public static void main(String[] args) {
        int a = 2;
        if (a%2 == 0){
            System.out.println("четное");

        }else{
            System.out.println("нечетное");
        }
    }
}
*/

// 6. Напишите программу, которая проверяет, является ли заданная строка палиндромом.

//public class exampl1 {
//    public static void main(String[] args) {
//        String a = "asdfasdf";
//        char[] charArray = a.toCharArray();
//
//        int left = 0;
//        int right = a.length() - 1;
//        boolean isPalindrome = true;
//
//        while (left < right) {
//            if (charArray[left] != charArray[right]) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//
//        if (isPalindrome) {
//            System.out.println("палиндром");
//        } else {
//            System.out.println("не палиндром");
//        }
//    }
//}

// 7. Напишите программу, которая находит факториал заданного числа.

//public class exampl1 {
//    public static void main(String[] args) {
//        int a = 5;
//        int f = 1;
//        for (int i = 1; i <= a; i++) {
//            f = f * i;
//        }
//        System.out.println(f);
//    }
//}

// 8. Напишите программу, которая выводит на экран все простые числа от 1 до 100.

//public class exampl1 {
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        for (int num = 1; num <= 100; num++) {
//            if (isPrime(num)) {
//                System.out.println(num);
//            }
//        }
//    }
//}

// 9. Напишите программу, которая находит сумму всех чисел от 1 до 100.//
/*
public class exampl1 {
    public static void main(String[] args) {
        int a = 100;
        int count = 0;
        for (int i = 1; i < a; i++) {
            count += i;
        }
        System.out.println(count);
    }

}
*/

//
// 10. Напишите программу, которая находит сумму цифр заданного числа.


/*
import java.util.Arrays;
public class exampl1 {
    public static void main(String[] args) {
        int a = 456;

// Преобразуем число в строку
        String aString = String.valueOf(a);

// Создаем массив для цифр
        int[] aArray = new int[aString.length()];

// Заполняем массив цифрами числа
        for (int i = 0; i < aString.length(); i++) {
            char digit = aString.charAt(i);
            aArray[i] = Character.getNumericValue(digit);
        }
        System.out.println(Arrays.toString(aArray));
        int sum = 0;
        for (int i = 0; i < aArray.length; i++) {
            sum += aArray[i];
        }
        System.out.println("sum = " + sum);
    }
}
*/
//
//Реализовать метод, принимающий 2 символа c1 и c2 и четное
//        число n, который возвращает строку,
//        состоящую из символов c1c2 длины n.
//        Пример: (c1 = 'a', c2 = 'b', n = 6 => "ababab")

//public class Example1 {
//        public static void main(String[] args) {
//                char c1 = 'a';
//                char c2 = 'b';
//                int n = 6;
//                String result = repeatCharacters(c1, c2, n);
//                System.out.println(result); // Вывод: ababab
//        }
//
//        public static String repeatCharacters(char c1, char c2, int n) {
//                StringBuilder sb = new StringBuilder();
//                for (int i = 0; i < n / 2; i++) {
//                        sb.append(c1);
//                        sb.append(c2);
//                }
//                return sb.toString();
//        }
//}

//Реализовать метод,
//        принимающий строку и проверяющий,
//        является ли она палиндромом
//public class exampl1 {
//
//        public static void main(String[] args) {
//
//        }
//        }



//1. Напишите программу, которая переворачивает строку без использования встроенных функций.
//
//        2. Реализуйте класс "Стек", который поддерживает операции добавления элемента, у
//        даления элемента и получения последнего элемента без его удаления.
//
//        3. Напишите программу, которая находит все простые числа до заданного числа N.
//
//        4. Реализуйте класс "Очередь", который поддерживает операции добавления элемента,
//        удаления элемента и получения первого элемента без его удаления.
//
//        5. Напишите программу, которая сортирует массив целых чисел методом пузырька.
//
//        6. Реализуйте класс "Бинарное дерево" и методы для добавления элемента,
//        удаления элемента и поиска элемента в дереве.
//
//        7. Напишите программу, которая определяет,
//        является ли заданное число N палиндромом.
//
//        8. Реализуйте программу, которая преобразует заданную строку
//        в шестнадцатеричное представление.



