package app;

import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    // METHOD FOR TESTING
    public static Map<String, List<Bogie>> groupByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));
    }

    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Passenger", 72),
                new Bogie("Passenger", 60),
                new Bogie("Goods", 0)
        );

        Map<String, List<Bogie>> result = groupByType(bogies);
        System.out.println(result);
    }
}