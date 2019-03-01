import java.util.*;
import java.util.List;

public class Array_VS_List {




    public static void main(String[] args) {
        // write your code here


        System.out.println("Enter the value for Array Or List");
        System.out.println("Enter 1 for Array");
        System.out.println("Enter 2 for List");

        System.out.println("Enter the value ?");
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();

        if (value == 1) {

            double[] myList = {1.9, 2.9, 3.4, 3.5};

            // Print all the array elements
            for (int i = 0; i < myList.length; i++) {
                System.out.println(myList[i] + " ");
            }

            // Summing all elements
            double total = 0;
            for (int i = 0; i < myList.length; i++) {
                total += myList[i];
            }
            System.out.println("Total is " + total);

            // Finding the largest element
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > max) max = myList[i];
            }
            System.out.println("Max is " + max);


        } else if (value == 2) {

            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Husnain");//Adding object in arraylist
            list.add("Adil");
            list.add("Hamza");
            list.add("Awais");

            System.out.println("Traversing list through List Iterator:");
            //Here, element iterates in reverse order
            ListIterator<String> list1=list.listIterator(list.size());
            while(list1.hasPrevious())
            {
                String str=list1.previous();
                System.out.println(str);
            }
            System.out.println("Traversing list through for loop:");
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }

            System.out.println("Traversing list through forEach() method:");
            //The forEach() method is a new feature, introduced in Java 8.
            list.forEach(a->{ //Here, we are using lambda expression
                System.out.println(a);
            });

            System.out.println("Traversing list through forEachRemaining() method:");
            Iterator<String> itr=list.iterator();
            itr.forEachRemaining(a-> //Here, we are using lambda expression
            {
                System.out.println(a);
            });




        }
    }
}
