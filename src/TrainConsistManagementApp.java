import java.util.*;

public class TrainConsistManagementApp {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===== UC7: Sort Bogies by Capacity =====\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // Sorting using Comparator
        bogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nAfter Sorting (Descending by Capacity):");
        System.out.println(bogies);
    }
}