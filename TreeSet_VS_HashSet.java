import java.util.*;

public class TreeSet_VS_HashSet {


    public static void main(String[] args) {
        // write your code here


        System.out.println("Enter the value for Execute Tree Set Or Hash Set");
        System.out.println("Enter 1 for Tree Set");
        System.out.println("Enter 2 for Hash Set");

        System.out.println("Enter the value ?");
        Scanner s1=new Scanner(System.in);
        int value=s1.nextInt();

        if(value==1) {

            //create one 'TreeSet' object
            SortedSet set = new TreeSet();
            //add elements to the set
            set.add("apple");
            set.add("fox");
            set.add("goat");
            set.add("dog");
            set.add("elephant");
            set.add("ball");
            set.add("hat");
            set.add("cat");
            //iterate over the elements and print out the results
            Iterator iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next().toString()+" ");
            }
            System.out.println();
            //print one subset
            System.out.println(set.subSet("dog","hat"));
            //print one tailset
            System.out.println(set.tailSet("dog"));
            //print one headset
            System.out.println(set.headSet("dog"));
            //print the first element
            System.out.println(set.first());
            //print the last element
            System.out.println(set.last());



        }else if(value==2){

            HashSet<String> h = new HashSet<String>();

            // Adding elements into HashSet usind add()
            h.add("India");
            h.add("Australia");
            h.add("South Africa");
            h.add("India");// adding duplicate elements

            // Displaying the HashSet
            System.out.println(h);
            System.out.println("List contains India or not:" +
                    h.contains("India"));

            // Removing items from HashSet using remove()
            h.remove("Australia");
            System.out.println("List after removing Australia:" + h);

            // Iterating over hash set items
            System.out.println("Iterating over list:");
            Iterator<String> i = h.iterator();
            while (i.hasNext())
                System.out.println(i.next());


        }
    }
}
