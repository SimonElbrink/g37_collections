package se.lexion.simon;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {


        String erik = "Erik";
        String simon = "Simon";

        //Preparing VXO office
        Set<String> lexiconOfficeVXO = new HashSet<String>();
        lexiconOfficeVXO.add(erik);
        lexiconOfficeVXO.add(simon);
        lexiconOfficeVXO.add(simon);
        lexiconOfficeVXO.add("Ulf");
        lexiconOfficeVXO.add("Mehrdad");

        //Preparing JKPG office
        HashSet<String> lexiconOfficeJKPG = new HashSet<String>();
        lexiconOfficeJKPG.add("Kent");
        lexiconOfficeJKPG.add("Marcus");


        //You can add a collection to the constructor if you want to start with a copy.
//        Set<String> lexiconOffices = new HashSet<>(lexiconOfficeVXO);
//        lexiconOffices.addAll(lexiconOfficeJKPG);

        //You can also add the names like this without the constructor call.
        Set<String> lexiconOffices = new HashSet<>();
        lexiconOffices.addAll(lexiconOfficeVXO);
        lexiconOffices.addAll(lexiconOfficeJKPG);


        System.out.println("Does VXO office Contain Simon: " + lexiconOfficeVXO.contains(simon));
        //Order not kept
        System.out.println("some of the employees at lexiconOffices = " + lexiconOffices);


        // Removing one-by-one.
//        lexiconOffices.remove(simon);
//        lexiconOffices.remove(erik);

        //Preparing an Collection of elements to remove all at ones.
        Set<String> remove = new HashSet<>();
        remove.add(simon);
        remove.add(erik);
        remove.add("Ulf");

        //Removing all matching elements in lexiconOffice
        lexiconOffices.removeAll(remove);

        System.out.println("lexiconOffices = " + lexiconOffices);



    }
}
