import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        //TODO: Create stack1 to hold StudentRecord objects
        GenericStack<StudentRecord> stack1 = new GenericStack<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        StringTokenizer token;
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            token = new StringTokenizer(line, " ");
            String firstName = token.nextToken();
            String lastName = token.nextToken();
            String IDString = token.nextToken();
            Integer IDNum = Integer.valueOf(IDString);
            //the above statement converts the String IDString
            //into the Integer object IDNum
            //TODO: Create a StudentRecord object with the first name, last
            //name and ID number, push it into stack1
            StudentRecord newStu = new StudentRecord(firstName, lastName, IDNum);
            stack1.push(newStu);
        }
        GenericStack<String> stack2 = new GenericStack<>();

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop().getLastName());
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
        inputFile.close();
        //TODO: Continue with the rest of the steps 5, 6 and 7
    }
}