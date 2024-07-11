import java.util.Scanner; //java statement

public class Grade {
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);
  
        System.out.print("PLEASE ENTER A LETTER GRADE: ");
        String grade = s.nextLine(); // declare grade as string 
        
        double gradeNum=0;
     if (grade == null || !grade.matches("[A-F][+-]?")) // if grade wasn't specified, or
{// if grade is not between A to F *optionally* followed by a + or - sign
    System.out.println("Invalid letter grade");
    
}

String letterGrade = grade.substring(0, 1); // pass 1 to exclude + or -
// to check grade num based on letter grade
if (letterGrade.equalsIgnoreCase("A"))
{
    gradeNum = 4.0;
}
else if(letterGrade.equalsIgnoreCase("B"))
{
    gradeNum = 3.0;
}
else if(letterGrade.equalsIgnoreCase("C"))
{
  gradeNum = 2.0;
}
else if(letterGrade.equalsIgnoreCase("D"))
{
    gradeNum = 1.0;
}
else if(letterGrade.equalsIgnoreCase("F"))
{
    gradeNum = 0.0; 
}

System.out.print("THE NUMERIC VALUE FOR GRADE " +grade+ " IS : " +gradeNum );
         
    }
}      
   