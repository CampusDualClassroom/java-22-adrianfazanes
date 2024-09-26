package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {


    public static List<String> createArrayList() {
        List<String> customList = new ArrayList<>();

        customList.add("GKFFD");
        customList.add("TNANA");
        customList.add("MPMSL");
        customList.add("PSWME");
        customList.add("LZMLF");
        customList.add("JYEBV");
        customList.add("YELNT");
        customList.add("JSNKR");
        customList.add("JFESF");
        customList.add("TMJLL");


        return customList;
    }


    public static void printElementsAndIndex(List<String> customList) {

        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Índice: " + i + ", Elemento: " + customList.get(i));
        }
    }


    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {

        List<String> customList = createArrayList();


        boolean isAdded = addElementToList(customList, "AAAAA");
        System.out.println("¿Elemento añadido exitosamente? " + isAdded);

        printElementsAndIndex(customList);
    }
}
