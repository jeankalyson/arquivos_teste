public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Metrics Example!");

        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(5, 3));
        System.out.println("Difference: " + calculator.subtract(5, 3));
        System.out.println("Product: " + calculator.multiply(5, 3));
        System.out.println("Quotient: " + calculator.divide(5, 3));
        
        Employee emp = new Employee("John Doe", 30, "Developer");
        System.out.println(emp);
    }
}
