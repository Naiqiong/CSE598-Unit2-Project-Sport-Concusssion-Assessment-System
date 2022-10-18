import java.util.ArrayList;
import java.util.Scanner;

public class SymptomChecker
{
   public static void checkSymptom(Athlete a) 
   {
	   // get the athlete
	 
       ArrayList<SymptomRecord> records = a.symptomRecordList;
       
       int size = records.size();
       
       if(size < 2) {
         System.out.println("You have less than 2 records, please go to step 1 and enter more symptom");
       }
      else {
        System.out.println("Comparing the recent 2 records..");
        System.out.println(records.get(size-1).toString());
        System.out.println(records.get(size-2).toString());
        String overallRating =  records.get(size-1).compareSymptomRecord(records.get(size-2));
         //display Risky condition indicator
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";

       
        if(overallRating.equals("Very Different")){
            System.out.println(ANSI_RED_BACKGROUND + overallRating.toString() + ANSI_RESET);
        }else if(overallRating.equals("Unsure")){
            System.out.println(ANSI_YELLOW_BACKGROUND + overallRating.toString() + ANSI_RESET);
        }else if(overallRating.equals("No Difference")){
            System.out.println(ANSI_GREEN_BACKGROUND + overallRating.toString() + ANSI_RESET);
        } else {
            System.out.println(overallRating.toString());
        }
        
      }
   }
   
   
       
    
}
    


