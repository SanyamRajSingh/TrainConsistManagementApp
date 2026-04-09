package app;

import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static boolean validateTrain(String id) {
        return Pattern.matches("TRN-\\d{4}", id);
    }

    public static boolean validateCargo(String code) {
        return Pattern.matches("PET-[A-Z]{2}", code);
    }

    public static void main(String[] args) {
        System.out.println(validateTrain("TRN-1234"));
        System.out.println(validateCargo("PET-AB"));
    }
}