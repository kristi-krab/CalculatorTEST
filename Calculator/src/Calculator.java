public class Calculator {
    public  static double calculator(double num1, double num2, String operation) {
        switch (operation) {
            case "+" -> {
                return (num1 + num2);}
            case "-" -> {
                return (num1 - num2);}
            case "*" -> {
                return (num1 * num2);}
            case "/" -> {
                return (num1 / num2);}
            case "^" -> {
                return Math.pow(num1,num2);}
            default ->  System.out.println("Ну не подходит число");
        }
        return 0;
    }
}
