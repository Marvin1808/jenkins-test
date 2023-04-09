import java.util.Scanner;

public class Greeting {
    private Scanner scanner;

    public Greeting(){
        scanner = new Scanner(System.in);
    }
    public void greetPerson(){
        System.out.println("What is your Name?");
        String name = scanner.nextLine();
        System.out.println("Hello "+name+", have a nice day!");
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greetPerson();
    }
}
