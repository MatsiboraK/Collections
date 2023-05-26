package ru.netology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class List {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[2] = "Kolya";

        ArrayList<String> namesList = new ArrayList<>(); //Создание коллекции
        namesList.add("Petya"); //Добавление элементов в коллецию
        namesList.add("Anya");
        namesList.add("Olya");
        System.out.println(namesList);
        namesList.set(2, "Kolya"); // Замена элемента с указанием индекса и новым значением
        System.out.println(namesList);
        namesList.remove("Anya"); //удаление элемента по наименованию
        namesList.remove(1); //Удаление элемента по по индексу
        namesList.clear(); //Очистка списка
        namesList.size(); //Узнать размер списка
        namesList.isEmpty(); //Проверка на пустоту
        Collections.sort(namesList); //Сортировка списка по алфавиту

        //ArrayList // Класс, который реализует нужные функции списка

        //List<String> namesList2 = new ArrayList<>(); // Можно использовать любой
        // список и только потом указать какой именно вид
        //это работает по правилу полиморфизма

        HashSet<String> namesList3 = new HashSet<>(); //Создание множества
        namesList.add("Petya"); //Добавление элементов в множество
        namesList.add("Anya");
        namesList.add("Olya");

        namesList3.contains("Olya"); //Метод, который провереят если ли какой-то элемент в множестве
        boolean has = namesList3.contains("Olya"); //Сохранение ответа на метод contains

        ArrayList<Integer> intList = new ArrayList<>(); // Использование списка для чисел
    }
}