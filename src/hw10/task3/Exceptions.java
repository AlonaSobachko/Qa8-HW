package hw10.task3;

public class Exceptions {
    public static class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    public static class ProhibitedItemException extends Exception {
        public ProhibitedItemException(String message) {
            super(message);
        }
    }

    public static class QuantityNotDivisibleByThreeException extends Exception {
        public QuantityNotDivisibleByThreeException(String message) {
            super(message);
        }
    }

    public static class InvalidProductTypeException extends Exception {
        public InvalidProductTypeException(String message) {
            super(message);
        }
    }

    public class InvalidPurchaseException extends Exception {
        public InvalidPurchaseException(String message) {
            super(message);
        }
    }
}
