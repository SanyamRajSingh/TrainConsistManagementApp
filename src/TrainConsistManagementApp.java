import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC1 - Initialize Train and Display Consist Summary ");
        System.out.println("=======================================\n");

        // Create empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
    }
}