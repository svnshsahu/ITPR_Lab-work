import java.util.*;
public class VoteEligible {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
       try{
        System.out.println("Enter your age");

        int x = sc.nextInt();

        if(x<18){
            throw new InvalidAgeException();
        }
        else{
            System.out.println("You are eligible");
        }
       }
       finally{
        sc.close();
       }
        
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(){
        System.out.println("Below 18");
    }   
}
