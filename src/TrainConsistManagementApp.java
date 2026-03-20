import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("=======================================\n");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ---- ADD MAPPINGS ----
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // ---- DISPLAY USING entrySet ----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal Bogie Types: " + bogieCapacity.size());

        System.out.println("\nUC6 completed successfully...");
    }
}