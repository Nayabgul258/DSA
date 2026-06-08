package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // list or collection --> interface(cant create object for this )
        // arraylist --> concrete class

        // collection<Interger> List = new ArrayList<>();--> type of write List
        // List<Integer> List = new ArrayList<>();

        ArrayList<Integer> A = new ArrayList<>();
        // add
        A.add(10);
        A.add(20);
        A.add(30);
        System.out.println("Insert element  A = " + A);

        // size
        System.out.println("Size Of A element  =" + A.size());

        // remove
        A.remove(1);
        System.out.println("Remove element A = " + A);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(40);
        B.add(50);
        System.out.println("Insert element B =" + B);

        // addAll
        A.addAll(B);
        System.out.println("Print All  element A + B =  " + A);

        // clear
        B.clear();
        System.out.println("clear B element =  " + B.size());

        // iterator
        Iterator<Integer> iterator = A.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }

        // get
        System.out.println(A.get(2));
        // set
        A.set(3, 50);
        // System.out.println(A);

        // toArray
        A.toArray();
        System.out.println(A);

        // contains;
        System.out.println(A.contains(30));

        A.add(5);
        A.add(20);
        System.out.println(A);
        Collections.sort(A);
        System.out.println(A);

    }
}