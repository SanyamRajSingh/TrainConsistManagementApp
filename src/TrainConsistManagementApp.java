import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=======================================\n");

        // LinkedHashSet preserves order + removes duplicates
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- ADD DUPLICATE ----
        formation.add("Sleeper"); // duplicate attempt

        // ---- DISPLAY FINAL FORMATION ----
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nUC5 completed successfully...");
    }
}