import java.util.Scanner;
public class intro{
    public static void main(String [] args){
        System.out.println("hello");

        System.out.print("Enter your name: ");



        Scanner scanner = new Scanner(System.in);//creating object of Scanner class important
        // to take input 



        String str= scanner.nextLine();
        //taking input using scanner for string

        // int num= scanner.nextInt();
        //taking input using scanner for int

        // float marks= scanner.nextFloat();
        //taking input using scanner for float

        


        String name="Welcome to vs code";
        System.out.println(name+" "+str);

        

    }
}