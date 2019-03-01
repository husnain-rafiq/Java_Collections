package com.company;


import java.io.*;
import java.util.*;

public class ArraylistVsVector {

    public static void main(String[] args) {
	// write your code here


        System.out.println("Enter the value for Execute ArrayList Or Vector");
        System.out.println("Enter 1 for ArrayList");
        System.out.println("Enter 2 for Vector");

        System.out.println("Enter the value ?");
        Scanner s1=new Scanner(System.in);
        int value=s1.nextInt();

        if(value==1) {

            // size of ArrayList
            int n = 5;

            //declaring ArrayList with initial size n
            ArrayList<Integer> intArray = new ArrayList<Integer>(n);

            // Appending the new element at the end of the list
            for (int i = 1; i <= n; i++)
                intArray.add(i);

            // Printing elements
            System.out.println(intArray);

            // Remove element at index 3
            intArray.remove(3);

            // Displaying ArrayList after deletion
            System.out.println(intArray);

            // Printing elements one by one
            for (int i = 0; i < intArray.size(); i++)
                System.out.print(intArray.get(i) + " ");

        }else if (value==2)
        {
            // initial size is 3, increment is 2
            Vector v = new Vector(3, 2);
            System.out.println("Initial size: " + v.size());
            System.out.println("Initial capacity: " + v.capacity());

            v.addElement(new Integer(1));
            v.addElement(new Integer(2));
            v.addElement(new Integer(3));
            v.addElement(new Integer(4));
            System.out.println("Capacity after four additions: " + v.capacity());

            v.addElement(new Double(5.45));
            System.out.println("Current capacity: " + v.capacity());

            v.addElement(new Double(6.08));
            v.addElement(new Integer(7));
            System.out.println("Current capacity: " + v.capacity());


            v.addElement(new Integer(11));
            v.addElement(new Integer(12));
            System.out.println("First element: " + (Integer)v.firstElement());
            System.out.println("Last element: " + (Integer)v.lastElement());



            // enumerate the elements in the vector.
            Enumeration vEnum = v.elements();
            System.out.println("\nElements in vector:");

            while(vEnum.hasMoreElements())
                System.out.print(vEnum.nextElement() + " ");
            System.out.println();

        }



    }
}
