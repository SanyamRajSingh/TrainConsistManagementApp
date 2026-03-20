import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=======================================\n");

        // Create HashSet for unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD bogie IDs ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // ---- ADD DUPLICATES (intentional) ----
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // ---- DISPLAY RESULT ----
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        System.out.println("\nTotal Unique Bogies: " + bogies.size());

        System.out.println("\nUC3 completed successfully...");
    }
}