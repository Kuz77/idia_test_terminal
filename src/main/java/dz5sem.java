
//* Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
//        * Регистр слова не имеет значения. Формат вывода произвольный.
//        * Программа-минимум:
//        * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
//        * 2. Точки и запятые не должны входить в статистику.

import java.util.*;

public class dz5sem {

    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStats(text);
    }

    static void printStats(String text) {

        String[] words = text.toLowerCase().replaceAll("[.,]", "").split("\\s+");


        Map<Integer, List<String>> stats = new TreeMap<>();
        for (String word : words) {
            int length = word.length();
            List<String> wordList = stats.getOrDefault(length, new ArrayList<>());
            wordList.add(word);
            stats.put(length, wordList);
        }


        for (Map.Entry<Integer, List<String>> entry : stats.entrySet()) {
            int length = entry.getKey();
            List<String> wordList = entry.getValue();
            System.out.println(length + " -> " + wordList);
        }
    }
}