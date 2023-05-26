package ru.netology;

import java.util.ArrayList;
//Общение с коллекциями вида список или множество через циклы
public class Cycle {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // создание пустой коллекции хранящей имена
        names.add("Anya"); //заполнение коллекции
        names.add("Olya");
        names.add("Sveta");

        //Пройтись по всей коллекции циклом For i, по аналогии с массивом
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i); //достаем каждое имя
        }

        //Пройтись по всей коллекции циклом For Each
        //в случае множества подходит только тот способ,
        //потому что у множества нету метода где можно взять элемент по номеру
        for (String name : names) { //Слева объявляется ячейка которая по типу совпадет с ячейкой этой коллеции
            //справа указывается коллекция
            System.out.println(name);
        }
    }
}
