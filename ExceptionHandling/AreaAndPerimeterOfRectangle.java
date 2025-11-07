import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) throws NegativeNumberException {
     Scanner sc= new Scanner(System.in);
    try{
    System.out.println("Enter length");
     int length = sc.nextInt();
     System.out.println("Enter breadth");
     int breadth = sc.nextInt();
     if(length<0 || breadth<0){
        throw new NegativeNumberException();   
     }
     else{
        System.out.println("Perimeter = "+ 2*(length+breadth));
        System.out.println("Area = "+ length*breadth);
        
     }
    }
     finally{
        sc.close();
     }
     
    }
}
class NegativeNumberException extends Exception{
    NegativeNumberException(){
        System.out.println("Measurement can't be negative");
    }   
}
