package app;

public class TrainConsistManagementApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    static class Bogie {
        int capacity;

        Bogie(int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.capacity = capacity;
        }
    }

    // METHOD FOR TEST
    public static Bogie createBogie(int capacity) throws InvalidCapacityException {
        return new Bogie(capacity);
    }

    public static void main(String[] args) {

        try {
            Bogie b = createBogie(-10);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}