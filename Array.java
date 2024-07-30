/* array -> collection of similar(dara type) data item/elements */

//need of array

// int[10] roll
//int[] arr= new int[10];

import java.util.Scanner;

public class Array  {
    public static void main(String[] args) {
        // int[] arr=new int[10];
        // int[] arr={1,2,3,4,5};

        // int max=-1;
        // int smax=-1;

        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         smax=max;
        //         max=arr[i];
        //     }
        //     else if(arr[i]<max && arr[i]>smax){
        //         smax=arr[i];
        //     }
        // }

        // System.out.println(max+" "+smax);

        

      /*   write a java program in which all the elements of array should
        be input by the user and display the data input values of an array */

     
      //java program to copy all the elments of an array input by the user to the another array
      //and display the element of the both array;
    //   Scanner scanner = new Scanner(System.in);
    //   int n=scanner.nextInt();
    //   int[] arr= new int[n];
    //   int[] arr1=new int[n];

    //   for(int i=0;i<n;i++){
    //     arr[i]=scanner.nextInt();
    //   }

    //   for(int i=0;i<n;i++){
    //     arr1[i]=arr[i];
    //   }

    //   for(int i=0;i<n;i++){
    //     System.out.println(arr1[i]);
    //   }

      //java program to find the frequency of occurence of all elements of an array input by the user
    
      Scanner scanner = new Scanner(System.in);
      int n=scanner.nextInt();
      int[] arr= new int[n];
      

      for(int i=0;i<n;i++){
        arr[i]=scanner.nextInt();
      }

      for(int i=0;i<n;i++){
         int count=0;
         int val=arr[i];
        if(arr[i]!=-111){
        for(int j=i;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                if(j!=i){
                arr[j]=-111;
                }
            }
        }
        arr[i]=val;
        System.out.println(arr[i]+" "+count);
    
        
      }
    }


      scanner.close();
    
      //java program to print in ascending order

    //   for(int i=0;i<n;i++){
    //     int swap;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[i]>arr[j]){
    //            swap=arr[i];
    //            arr[i]=arr[j];
    //            arr[j]=swap;
    //         }
    //     }
    //   }

    //   for(int i=0;i<n;i++){
    //     System.out.println(arr[i]);
    //   }

      //java program to find the transpose of the matrix 
      // int m=scanner.nextInt();


      // int[] [] array=new int[n][m];

      // for(int i=0;i<n;i++){
      //   for(int j=0;j<n;j++){
      //       array[i][j]=scanner.nextInt();
      //   }
      // }

      // for(int i=0;i<n;i++){
      //   for(int j=0;j<n;j++){
      //       System.out.print(array[i][j]+" ");
      //   }
      //   System.out.println();
      // }
 
      // System.out.println();

      // for(int i=0;i<n;i++){
      //    int val=0;
      //   for(int j=0;j<n;j++){

      //       if(i<j){
      //         val=array[i][j];
      //         array[i][j]=array[j][i];
      //         array[j][i]=val;
      //       }
            
      //   }
      // }

      // for(int i=0;i<n;i++){
      //   for(int j=0;j<n;j++){
      //       System.out.print(array[i][j]+" ");
      //   }
      //   System.out.println();
      // }


      
        
    }
}
