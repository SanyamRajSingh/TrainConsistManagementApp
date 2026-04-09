package app;

import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        int capacity;
        Bogie(int c) { capacity = c; }
    }

    public static int totalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie(72), new Bogie(60), new Bogie(40)
        );

        System.out.println("Total: " + totalCapacity(list));
    }
}