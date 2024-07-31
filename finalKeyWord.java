//change the class name according to execution i have changed the 
//name of class according my preferences



// public class finalKeyWord{
//      public static void main(String[] args) {
//         final int x=10;//value once assigned later can not be changed.
//         System.out.println(x);
//      }
// }

//static vs public

// static -> does not require to create an object directly class can be called 
// public -> need an object to be created to access the elements of the class

// class Helper {
 
//     // Static method
//     public static int sum(int a, int b)
//     {
//         // Simply returning the sum
//         return a + b;
//     }

//     public void print(){
//         System.out.println("My name is yogesh");
//     }
// }
 
// // Class 2
// class finalKeyWord {
 
//     // Main driver method
//     public static void main(String[] args)
//     {
//         // Custom values for integer
//         // to be summed up
//         int n = 3, m = 6;
 
//         // Calling the static method of above class
//         // and storing sum in integer variable
//         int s = Helper.sum(n, m);

//         Helper obj = new Helper();
 
//         // Print and display the sum
//         System.out.print("sum is = " + s);
//          obj.print();
//     }
// }

// class finalKeyWord {
//     int a=10;
//     public static void main(String[] args) {
//         finalKeyWord Obj = new finalKeyWord();
//         System.out.println(Obj.a);
//     }
// }

class finalKeyWord {
    static int a=9;
    public static void main(String[] args) {
        System.out.println(a);
    }
}

//public private protected final abstract default