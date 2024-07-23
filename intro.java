import java.util.*;
public class intro{

    // public static void fibb(int num,int a,int b,int sum,int i){
    //     if(i==num){
    //         return ;
    //     }
    //     System.out.print(sum);
    //     sum=a+b;
    //     b=a;
    //     a=sum;
    //     i++;
    //     fibb(num,a,b,sum,i);
    // }
    public static void main(String [] args){
        // System.out.println("hello");

        // System.out.print("Enter your name: ");



        Scanner scanner = new Scanner(System.in);//creating object of Scanner class important
        // to take input 



        // String str= scanner.nextLine();
        //taking input using scanner for string

        // int num= scanner.nextInt();
        //taking input using scanner for int

        // float marks= scanner.nextFloat();
        //taking input using scanner for float

        


        // String name="Welcome to vs code";
        // System.out.println(name+" "+str);

        //write a java program to implement fibbonaci series and display the series without using recurwiion
        // int a=0;
        // int b=1;
        // int c=1;
        // for(int i=0;i<5;i++){
        //     c=a+b;
        //     System.out.print(c);
        //     b=a;
        //     a=c;
        // }

        // fibb(5,1,1,1,0);

        //write a program to check the given number is palindrome or not

        // int n=151;
        // int sum=0;
        // while(n!=0){
        //     int rem=n%10;

        //     sum=sum*10+rem;
        //     n=n/10;
        // }
        

        // System.out.println(sum);

        // for(int i=1;i<=255;i++){
        // System.out.println((char)i);
        // }



        // 1)java program print the prime number between the range given by the user
        // 2)write a java program to print random number in the range given by user
       
        //1)
        // int start = scanner.nextInt();
        // int end = scanner.nextInt();
        // for(int i=start;i<end;i++){
        //     boolean flag=true;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //              flag=false;
        //         }
        //     }
        //     if(flag){
        //         System.out.println(i+" ");
        //     }
        // }

        //2)
        // Random rand = new Random();
        // int min=50;int max=100;
        // int a=rand.nextInt(max-min-1)+min;

        // System.out.println(a);


        
        scanner.close();
    }
}

