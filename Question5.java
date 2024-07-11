import java.util.Scanner; //java statement

public class Question5 {
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);
  
        String [] name = new String [11];
        
        for(int i = 1; i<11; i++){ 
            System.out.print("PLEASE ENTER NAME: ");
            name [i] = s.nextLine();
        }
        
        System.out.print(name);
        
    }}