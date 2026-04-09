package app;

import java.util.*;

public class TrainConsistManagementApp {

    public static long streamTime(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().filter(x -> x % 2 == 0).count();
        long end = System.nanoTime();
        return end - start;
    }

    public static long loopTime(List<Integer> list) {
        long start = System.nanoTime();
        int count = 0;
        for (int x : list) {
            if (x % 2 == 0) count++;
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) list.add(i);

        long stream = streamTime(list);
        long loop = loopTime(list);

        System.out.println("Stream Time: " + stream);
        System.out.println("Loop Time: " + loop);
    }
}