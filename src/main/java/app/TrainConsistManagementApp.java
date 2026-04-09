package app;

import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String type, cargo;

        Bogie(String t, String c) {
            type = t;
            cargo = c;
        }
    }

    public static boolean isSafe(List<Bogie> list) {
        return list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical")
                        || b.cargo.equals("Petroleum"));
    }

    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Box", "Coal")
        );

        System.out.println("Safe: " + isSafe(list));
    }
}