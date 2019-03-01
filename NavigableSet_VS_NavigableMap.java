import java.util.*;

public class NavigableSet_VS_NavigableMap {
    public static void main(String[] args) {
        // write your code here


        System.out.println("Enter the value for Navigable Map or Navigable Set");
        System.out.println("Enter 1 for Navigable Map ");
        System.out.println("Enter 2 for Navigable Set");

        System.out.println("Enter the value ?");
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();

        if (value == 1) {

            NavigableMap<Integer, String> mapHttpStatus = new TreeMap<>();

            mapHttpStatus.put(100, "Continue");
            mapHttpStatus.put(200, "OK");

            mapHttpStatus.put(400, "Bad Request");
            mapHttpStatus.put(401, "Unauthorized");

            mapHttpStatus.put(500, "Internal Server Error");
            mapHttpStatus.put(501, "Not Implemented");


            Set<Integer> ascendingKeys = mapHttpStatus.keySet();

            System.out.println("Ascending Keys: " + ascendingKeys);

            Set<Integer> descendingKeys = mapHttpStatus.descendingKeySet();

            System.out.println("Descending Keys: " + descendingKeys);

            Map.Entry<Integer, String> firstEntry = mapHttpStatus.firstEntry();

            System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());

            Map.Entry<Integer, String> lastEntry = mapHttpStatus.lastEntry();

            System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());

            Map.Entry<Integer, String> lowerEntry = mapHttpStatus.lowerEntry(401);
            System.out.println("Lower entry: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());

            Map.Entry<Integer, String> floorEntry = mapHttpStatus.floorEntry(401);
            System.out.println("Floor entry: " + floorEntry.getKey() + " => " + floorEntry.getValue());

            Map.Entry<Integer, String> higherEntry = mapHttpStatus.higherEntry(500);
            System.out.println("Higher entry: " + higherEntry.getKey() + " => " + higherEntry.getValue());

            Map.Entry<Integer, String> ceilingEntry = mapHttpStatus.ceilingEntry(500);
            System.out.println("Ceiling entry: " + ceilingEntry.getKey() + " => " + ceilingEntry.getValue());

            mapHttpStatus.pollFirstEntry();
            mapHttpStatus.pollLastEntry();


            System.out.println("\nMap after first and last entries were polled:");

            for (Integer key : mapHttpStatus.keySet()) {
                System.out.println(key + " => " + mapHttpStatus.get(key));
            }


        } else if (value == 2) {

            NavigableSet<String> setFruits = new TreeSet<>();

            setFruits.add("Banana");
            setFruits.add("Apple");
            setFruits.add("Orange");
            setFruits.add("Grape");
            setFruits.add("Mango");

            System.out.println("Set Fruits: " + setFruits);

            Iterator<String> descIterator = setFruits.descendingIterator();

            System.out.print("Fruits by descending order: ");

            while (descIterator.hasNext()) {
                System.out.print(descIterator.next() + ", ");
            }





        }
    }
}
