package Exercise3;

public class Overload {
    // Overloaded static method with one integer parameter
    public static void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    // Overloaded static method with one string parameter
    public static void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    // Overloaded static method with a double and an integer parameter
    public static void display(double decimal, int number) {
        System.out.println("Displaying double and integer: " + decimal + " and " + number);
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        display(10);
        display("Hello, World!");
        display(3.14, 42);
    }

}
