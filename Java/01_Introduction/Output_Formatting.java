
/**
 * https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
 * 
 * @author (Md Adnan Abir) 
 * @version (04032024)
 */
import java.util.Scanner;
public class Output_Formatting {
    
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n",s1,x);
                
            }
            System.out.println("================================");

    }
}
