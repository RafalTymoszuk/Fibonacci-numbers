import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome in to Fibonacci numbers generator.");
        System.out.println("How many Fibonacci numbers would you like to generate. Enter an integer: ");

        Fibo fibo = new Fibo();
        fibo.printFibonacci();


    }

    public void printFibonacci() {
        int f = 0;
        boolean done = false;

        while (!done) {
            try {

                f = sc.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("The character entered is not an integer. Try again: ");
                sc.nextLine();
            }
        }


        System.out.println("Fibonacci sequence consisting of " + f + " numbers.");

        int x = 0;
        int v = 1;
        int z = 0;

        System.out.print(x + " " + v);


        for (int i = 2; i < f; i++) {

            z = x + v;
            System.out.print(" " + z);
            x = v;
            v = z;


        }

    }

}


