import java.util.Scanner;

public class GenericQueueDemo {
    public static void main(String args[]) {
        GenericQueue<String> queue1 = new GenericQueue<>();
        GenericQueue<Integer> queue2 = new GenericQueue<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("String Queue:");
        while (true) {
            System.out.print("Enter a word (quit to end): ");
            String name = input.next();
            if (name.equals("quit")) {
                break;
            }
            queue1.enqueue(name);
        }
        System.out.println();
        System.out.println("Integer Queue:");
        while (true) {
            System.out.print("Enter a positive integer (-1 to end): ");
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            queue2.enqueue(number);
        }
        System.out.println();
        System.out.println("String Stack Contents:");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.dequeue());
        }
        System.out.println();
        System.out.println("Integer Stack Contents:");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.dequeue());
        }

    }
}
