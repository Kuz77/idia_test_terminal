

//задача 1 семинар 3
// Внутри класса MergeSort напишите метод mergeSort, который принимает
//        массив целых чисел a и реализует алгоритм сортировки слиянием.
//        Метод должен возвращать отсортированный массив


//import java.util.Arrays;
//public class main3 {
//    public static void main(String[] args) {
//        int[] a = {5, 1, 6, 2, 3, 4};
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > a[i + 1]) {
//                int temp = a[i];
//                a[i] = a[i + 1];
//                a[i + 1] = temp;
//            }
//
//        }
//        for (int item : a) {
//            System.out.print(item + " ");
//        }
//    }
//}


//import java.util.Arrays;
//public class main3 {
//    public static void main(String[] args) {
//        int[] array = {5, 1, 6, 2, 3, 4};
//
//
//        Arrays.sort(array);
//
//
//        for (int item : array) {
//            System.out.print(item + " ");
//        }
//    }
//}



//       задача 2 семинар 3
//       Напишите функцию removeEvenNumbers, которая принимала бы
//        произвольный список целых чисел, удаляла бы из него четные
//        числа и выводила список без четных чисел.
//
//        Напишите свой код в методе removeEvenNumbers класса Answer.
//        Метод removeEvenNumbers принимает на вход один параметр:
//
//        Integer[] arr - список целых чисел
//
//        Пример
//
//
//        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        removeEvenNumbers(arr);
//
//// [1, 3, 5, 7, 9]
//
//        arr = new Integer[]{2, 4, 6, 8};
//        removeEvenNumbers(arr);
//
//// []


//
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//
//public class main3 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int count = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                count++;
//            }
//        }
//
//
//        int[] newArr = new int[count];
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//
//
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//
//
//            List<Integer> list = newArr List<>();
//        }
//    }
//}




//задача 3 семинар 3
//
//    Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
//
//        Сортирует его по возрастанию и выводит на экран
//        Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//        Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//        Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//        Напишите свой код в методе analyzeNumbers класса Answer.
//        Метод analyzeNumbers принимает на вход один параметр:
//
//        Integer[] arr - список целых чисел

//import java.util.Arrays;
//import java.util.ArrayList;
//public class main3 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 3, 8, 7, 6, 5, 9};
//
//        Arrays.sort(arr);
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//        System.out.println("мин = "+ arr[0]);
//
//        System.out.println("макс = "+arr[arr.length-1]);
//
//        int sum = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            sum = sum + arr[i];
//        }
//        double avg = sum / arr.length;
//        System.out.println("авг = " + avg);
//    }
//}



















//    /**
//     * Вывести статистику повторений внутри списка
//     *  "1", "2", "2", "4", "3", "1", "4", "5", "2"
//     *  "1" -> 2
//     *  "2" -> 3
//     *  "3" -> 1
//     *  "4" -> 2
//     *  "5" -> 1
//     */
//        public static void main(String[] args) {
////        intro();
//            ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "3", "1", "4", "5", "2"));
//            countAndPrint(strings);
//        }
//
//
//
//
//    private static void countAndPrint(ArrayList<String> strings) {
//        // "1" -> 2
//        // "2" -> 3
//
//        ArrayList<String> unique = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) { // [0, size)
//            String element = strings.get(i);
//            if (unique.contains(element)) {
//                continue;
//            }
//
//            int counter = 1;
//            for (int j = i + 1; j < strings.size(); j++) { // [i + 1, size)
//                String another = strings.get(j);
//                if (element.equals(another)) {
//                    counter++;
//                }
//            }
//            System.out.println(element + " - " + counter);
//            unique.add(element);
//        }
//    }