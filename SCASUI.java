import java.util.Scanner;
public class SCASUI
{
   // get a reference to the Bank instance
   public static SCAS platform = new SCAS();

   public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
        int id = 0;
        Athlete cur = new Athlete(id);

     do{
         displayMenu();
         int choice = scan.nextInt();
         

       switch(choice)
       {
		   case 1:
		   // add symptoms
		   if(id == 0) {
		   System.out.println("Do you have an existing Athlete ID? If yes, please enter your ID. Otherwise enter -1");
		   id = scan.nextInt();
		   }
		   
		   if(id == -1) {
		     id = 1000 + (int)(Math.random() * 9999);
             System.out.println("New user. Your ID is : " + id);
             cur = new Athlete(id);
             
           } else {
             cur = platform.getAthlete(id);
             
           }
           platform.addAthlete(cur);
           cur.addSymptom();
           
		   break;

		   case 2:
		 //  System.out.println("Do you have an existing Athlete ID? If yes, please enter your ID. Otherwise go to step 1");
		  // id = scan.nextInt();
		   cur = platform.getAthlete(id);
           cur.displayRecord();
		   break;

      
		   case 3:
		   SymptomChecker x = new SymptomChecker();
		   x.checkSymptom(cur);
		   break;

           
		   case 4:
		   System.out.println("Exciting the program... ");
		   System.exit(0);

		   break;
		   default:
		   System.out.println("Invalid Input ");
         }

	   } while(true);

   }

   static void displayMenu()
   {
	  		   System.out.println("Welcome to Sport Concussion Assessment System");
	           System.out.println("==================================");
	           System.out.println("Please select one of the following options");
	           System.out.println("\t\t  1. Enter Symptoms");
	           System.out.println("\t\t  2. Display Symptoms Summary");
	           System.out.println("\t\t  3. Am I at Risk?");
               System.out.println("\t\t  4. Exit");

   }

     

    
  


   
}
    

    
 