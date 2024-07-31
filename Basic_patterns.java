import java.util.Scanner;

public class Basic_patterns {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
      //   int num=scanner.nextInt();

        //square hollow patterns

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num;j++){
        //         if(i==0 || i==num-1 || j==0 || j==num-1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //number triangular

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num;j++){
        //           if(j>=num-i-1){
        //              System.out.print((i+1)+" ");
        //           }
        //           else{
        //             System.out.print(" ");
        //           }
        //     }
        //     System.out.println();
        // }

        //number increasing pattern

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }

        //number increasing reversed pattern

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num-i;j++){
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }

        //number changing pattern

        // int k=1;
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print((k++)+" ");
        //     }
        //     System.out.println();
        // }

        //zero-one triangle

        // int k=1;
        //  for(int i=0;i<num;i++){
        //     if(i%2==0){
        //         k=1;
        //     }
        //     if(i%2!=0){
        //         k=0;
        //     }
        //     for(int j=0;j<=i;j++){
        //         System.out.print(k+" ");
        //         if(k==1){
        //             k=0;
        //         }
        //         else{
        //             k=1;
        //         }
        //     }
        //     System.out.println();
        // }


        //palindrome triangular

        // for(int i=0;i<num;i++){
        //     int a=i+1;
        //     for(int j=0;j<num;j++){
        //         if(j>=num-i-1){
        //             System.out.print((a--)+" ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     a=2;
        //     for(int k=0;k<i;k++){
        //             System.out.print((a++)+" ");
        //     }

        //     System.out.println();
        // }

        //rhombus pattern

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=0;k<num;k++){
        //         System.out.print("*"+" ");
        //     }

        //     System.out.println();
        // }


        //square fill patterns

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num;j++){
        //             System.out.print("* ");
        //     }
        //     System.out.println();
        // }

       //right half pattern

    //    for(int i=0;i<num;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }

       //right half reverse pattern

    //    for(int i=0;i<num;i++){
    //     for(int j=0;j<=num-i-1;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }

    //left half pattern

    //    for(int i=0;i<num;i++){
    //     for(int j=0;j<num;j++){
    //            if(j>=num-i-1){
    //         System.out.print("* ");
    //            }
    //            else{
    //             System.out.print("  ");
    //            }
    //     }
    //     System.out.println();
    //    }

    // left half reverse pattern

      //  for(int i=0;i<num;i++){
      //   for(int j=0;j<num;j++){
      //          if(j>=i){
      //       System.out.print("* ");
      //          }
      //          else{
      //           System.out.print("  ");
      //          }
      //   }
      //   System.out.println();
      //  }

      //triangular star pattern

   //  for(int i=0;i<num;i++){
   //          for(int j=0;j<num;j++){
   //                if(j>=num-i-1){
   //                   System.out.print("*"+" ");
   //                }
   //                else{
   //                  System.out.print(" ");
   //                }
   //          }
   //          System.out.println();
   //      }

   //reverse triangular number pattern

   //  for(int i=0;i<num;i++){
   //          for(int j=0;j<num;j++){
   //                if(j>=i){
   //                   System.out.print(j+1+" ");
   //                }
   //                else{
   //                  System.out.print(" ");
   //                }
   //          }
   //          System.out.println();
   //      }

   //hollow triangular pattern


   // for(int i=0;i<num;i++){
   //    for(int j=0;j<num+i;j++){
   //      if(i==num-1){
   //       System.out.print("* ");
   //       if(j==num-1){
   //          break;
   //       }
   //      }
   //      else if(j==num-1-i || j==num+i-1){
   //       System.out.print("*");
   //      }
   //      else{
   //       System.out.print(" ");
   //      }
   //    }
   //    System.out.println();
   // }



    scanner.close();
    }

    
}
