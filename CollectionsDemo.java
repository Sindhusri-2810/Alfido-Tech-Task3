import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter 3 student names:");

        for (int i = 0; i < 3; i++) {
            students.add(sc.nextLine());
        }

        System.out.println("\nArrayList: " + students);

        // HashSet
        HashSet<String> departments = new HashSet<>();

        departments.add("CSE");
        departments.add("ECE");
        departments.add("CSE");

        System.out.println("HashSet: " + departments);

        // HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Sindhu");
        studentMap.put(102, "Shivani");

        System.out.println("HashMap: " + studentMap);

        sc.close();
    }
}