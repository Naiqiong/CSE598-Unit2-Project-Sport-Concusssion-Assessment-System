import java.util.ArrayList;
import java.util.Scanner;
public class SCAS
{
       Scanner scan = new Scanner(System.in);
       // list of athletes 
       ArrayList<Athlete> athletes = new ArrayList<Athlete>();
       ArrayList<SymptomRecord> symptomRecords = new ArrayList<SymptomRecord>();

     // add a new Athlete to the system

	   public  void addAthlete(Athlete a)
	   {
	      athletes.add(a);
	   }

      // this method returns a reference to the athlete object from the list based on the athlete ID given
      // if no athlete found, return null.
       public  Athlete getAthlete(int id)
       {
		   Athlete c = null;
           for(int i=0; i < athletes.size() ; i++){

           if(athletes.get(i).id == id)
		    c = athletes.get(i);
           // System.out.println("Found Athlete " + id);
	       }

	       return c;

	   }


}