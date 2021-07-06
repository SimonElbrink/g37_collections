package se.lexion.simon;

import se.lexion.simon.model.Person;

import java.util.*;

public class ArrayListExample {

        /*
        1. ArrayList can contains duplicate elements
        2. ArrayList maintains insertion order
        3. ArrayList in non synchronized
        4. AArrayList allows random access because it works at the index base
     */

    public static void main(String[] args) {
        ex5();
    }

    public static void ex1(){

        // How we create and Array.
        int[] numbersArray = new int[0];

        /*
         How we can create an ArrayList of numbers.
         (Note the "Integer" in the Angle Brackets.
         It's using the Wrapper Class of int)
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(400);
        numbers.add(200);
        numbers.add(300);

        //One way of adding multiple objects using addAll() method.
        numbers.addAll(Arrays.asList(900,1000,2000));

        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.get(4) = " + numbers.get(4));


        // Traversing list through Iterator
        // when we want to remove elements we should use Iterator
        // iterator is more efficient when we want to try to modify a collection
        //http://tutorials.jenkov.com/java-collections/iterable.html
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            System.out.println("num = " + num);
            if (num == 400){
                iterator.remove();
            }
        }

        System.out.println("numbers = " + numbers);
        
        
        for (Integer i : numbers) {
            System.out.println(i);
            
//            //Not to use when removing. Throws and concurrent modification exception.
//            if (i == 100){
//                numbers.remove(i);
//            }
            
        }

    }


    public static void ex2(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        System.out.println("numbers.size() = " + numbers.size());
//        numbers.remove(1);
        Integer n200 = 200;
        numbers.remove(n200);
        System.out.println("numbers.size() = " + numbers.size());
    }

    public static void ex3(){
        List<String> names = new ArrayList<>();

        names.add("Simon");
        names.add("Erik");
        names.add("Ulf");

        Object[] objects = names.toArray();
        System.out.println("objects.length = " + objects.length);

        //Checking the type at runtime
        // (Tells JVM "Trust me the Object will be a String when the program is accessing the variable").
        // It will Throw an class Cast exception otherwise.
        String name2 = (String) objects[1];
        System.out.println("name2 = " + name2);

    }

    public static void ex4(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(10);
        numbers.add(10000);
        numbers.add(20);

        System.out.println(numbers);

        System.out.println("Sorting");
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("A".compareTo("B"));

    }

    public static void ex5(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"Simon","simon@lex.se",24));
        persons.add(new Person(3,"Ulf","ulf@lex.se",39));
        persons.add(new Person(2,"Erik", "eric@lex.se", 35));

        System.out.println("persons = " + persons);

        Collections.sort(persons);

        //By Name
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        //By Email
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        });

        System.out.println("persons = " + persons);
    }



}
