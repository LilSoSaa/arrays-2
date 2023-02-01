package it.develhope.arraysandlists;

import java.util.Arrays;

public class Start{

    public static void main(String[] args) {


        String aliceToDos[] = {"Coding", "Reading" , "Learning"};
        String bobToDos [] = {"Reading" , "Coding" , "Learning" , "Sleeping"};
        String timToDos [] = {"Reading" , "Learning" , "Coding"};

        // here we compare if the arrays (the objects) are equal
        System.out.println("Is Alice's array equal to Bob array?" + Arrays.equals(aliceToDos, timToDos ));
        System.out.println("Is Alice's array equal to Tim array?" + Arrays.equals(aliceToDos, timToDos ));


        // here we compare the length
        System.out.println("Is Alice's array having the same length of Bob's array?" + (aliceToDos.length== bobToDos.length ));
        System.out.println("Is Alice's array having the same length of Tim's array?" + (aliceToDos.length== timToDos.length ));



        //prova casuale
        System.out.println("Le azioni svolte durante la giornata sono n°" +aliceToDos.length+ " e sono codeste: " + Arrays.toString(aliceToDos));


        // first we sort the arrays, so that we can compare them later and understand if the arrays have the same tasks
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        System.out.println("Is Alice having the same tasks of Bob?"  + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice having the same tasks of Tim?" + Arrays.equals(aliceToDos , timToDos));

        //non riesco a mettere Arrays.sort direttamente nel system.out
    }








}



        




    


      
