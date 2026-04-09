package app;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testFilter_CapacityGreaterThan60() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC Chair", 60),
                new TrainConsistManagementApp.Bogie("First Class", 40)
        );

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(bogies);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    void testFilter_NoMatchingBogies() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("AC Chair", 60),
                new TrainConsistManagementApp.Bogie("First Class", 40)
        );

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleMatchingBogies() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("Luxury", 80)
        );

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(bogies);

        assertEquals(2, result.size());
    }
}