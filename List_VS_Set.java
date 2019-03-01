import java.util.*;

public class List_VS_Set {
    public static void main(String[] args) {
        // write your code here


        System.out.println("Enter the value for List Or Set");
        System.out.println("Enter 1 for List");
        System.out.println("Enter 2 for Set");

        System.out.println("Enter the value ?");
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();

        if (value == 1) {

            List<String> al=new ArrayList<String>();
            al.add("husnain");
            al.add("ahmed");
            al.add("hamza");
            al.add(1,"Adil");
            ListIterator<String> itr=al.listIterator();
            System.out.println("Traversing elements in forward direction");
            while(itr.hasNext()){

                System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
            }
            System.out.println("Traversing elements in backward direction");
            while(itr.hasPrevious()){

                System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
            }


        } else if (value == 2) {

            Set<String> names = new HashSet<>();
            names.add("husnain");
            names.add("Adil");
            names.add("Hamza");
            names.add("Alice");


            Iterator<String> iterator = names.iterator();

            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }


            Set<Integer> intg=new HashSet<>();

            intg.add(1);
            intg.add(2);
            intg.add(3);
            intg.add(4);
            intg.add(5);
            intg.add(6);

            Iterator<Integer> iterat = intg.iterator();

            while (iterat.hasNext()) {

                System.out.println( iterat.next());
            }


            System.out.println("After Remove value");
            intg.remove(4);
            iterat = intg.iterator();

            while (iterat.hasNext()) {

                System.out.println( iterat.next());
            }





        }
    }
}
