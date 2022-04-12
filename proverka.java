import java.util.Scanner;

public class proverka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.print("x=");
        x = scanner.nextInt();

        System.out.print("y=");
        y = scanner.nextInt();

        if(x>0 & y>0){
            System.out.println("I четверть");
        }
        else if(x<0 & y>0){
            System.out.println("II четверть");
        }
        else if(x<0 & y<0){
            System.out.println("III четверть");
        } else System.out.println("IV четверть");
    }
}
