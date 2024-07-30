import java.util.*;

public class  Bit{
    public static void main(String [] args){
        //bit -> smallest measuring unit of storage
        Scanner scanner = new Scanner(System.in);
         
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();

        int result = a|b;
        result = result | c;

        System.out.println(result);

        scanner.close();
    }
}
