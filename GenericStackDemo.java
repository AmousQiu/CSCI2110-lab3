import java.util.Scanner;
import java.util.ArrayList;

public class GenericStackDemo {
    public static void main(String args[]) {
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Integer> stack2 = new GenericStack<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("String Stack:");
        while (true) {
            System.out.print("Enter a word (quit to end): ");
            String name = input.next();
            if (name.equals("quit")) {
                break;
            }
            stack1.push(name);
        }
        System.out.println();
        System.out.println("Integer Stack:");
        while (true) {
            System.out.print("Enter a positive integer (-1 to end): ");
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            stack2.push(number);
        }
        System.out.println();
        System.out.println("String Stack Contents:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
        System.out.println();
        System.out.println("Integer Stack Contents:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

    }
}
