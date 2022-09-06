import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Bank{

    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int myNumber=(int)(Math.random()*100);
           int userNumber=0;

           do{
               System.out.println("Guess my number : ");
               userNumber= sc.nextInt();
               if(userNumber == myNumber){
                   System.out.println("Great you win");
                   break;
               }
               else if(userNumber>myNumber){
                   System.out.println("Number is too large try again");
               }
               else{
                   System.out.println("Number is too small try again");
               }

           }while(userNumber>=0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}