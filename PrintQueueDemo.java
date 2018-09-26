import java.util.Scanner;
public class PrintQueueDemo {
    public static void main(String args[]){
       PrintQueue pq1=new PrintQueue();
       Scanner input=new Scanner(System.in);
       pq1.lpr("Swilliams",309);
        pq1.lpr("ronaldiniho",300);
        pq1.lpr("marionjones",312);
        pq1.lpr("Swilliams",267);
        pq1.lpr("davidh",135);
        pq1.lpr("ronaldiniho",301);
        pq1.lpq();
        System.out.println("Which job do you want to delete?");
        pq1.lprm(input.nextInt());
        System.out.println("Whose job do you want to delete?");
        pq1.lprmAll(input.next());
        pq1.lpq();
    }
}
