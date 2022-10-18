/* This class implements Athlete object and functionalities for each Athlete 
   1 Deposit Money
   2 Withdraw Momney
   3 Transfer Money

*/

import java.util.ArrayList;
import java.util.Scanner;
public class Athlete
{
	public int id;
	public int numberOfRecord;
	public ArrayList<SymptomRecord> symptomRecordList = new ArrayList<SymptomRecord>();

	public Athlete(int id)
	{
      this.numberOfRecord = -1;
      this.id = id;
	}
   
   public int getID() 
   {
      return this.id;
   }
   
   public void addSymptom()
   {
	    Scanner scan = new Scanner(System.in);
   	// get input
        int[] cur = new int[22];
            System.out.println("Please enter Symptoms of your recent game: ");
            System.out.println("Please enter your headache score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[0] = scan.nextInt(); 
            System.out.println("Please enter your Pressure in head score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[1] = scan.nextInt(); 
            System.out.println("Please enter your Neck Pain score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[2] = scan.nextInt(); 
            System.out.println("Please enter your Nausea or Vomiting score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[3] = scan.nextInt(); 
            System.out.println("Please enter your Dizziness score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[4] = scan.nextInt(); 
            System.out.println("Please enter your Blurred Vision score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[5] = scan.nextInt();
            System.out.println("Please enter your Balance Problems score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[6] = scan.nextInt(); 
            System.out.println("Please enter your Sensitivity to light score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[7] = scan.nextInt(); 
            System.out.println("Please enter your Sensitivity to noise score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[8] = scan.nextInt(); 
            System.out.println("Please enter your Feeling slowed down score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[9] = scan.nextInt(); 
            System.out.println("Please enter your Feeling like in a fog score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[10] = scan.nextInt(); 
            System.out.println("Please enter your Don't feel right score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[11] = scan.nextInt(); 
            System.out.println("Please enter your Difficulty concentrating score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[12] = scan.nextInt(); 
            System.out.println("Please enter your Difficulty Remembering score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[13] = scan.nextInt();
            System.out.println("Please enter your Fatigue or low energy score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[14] = scan.nextInt(); 
            System.out.println("Please enter your Confusion score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[15] = scan.nextInt(); 
            System.out.println("Please enter your Drowsiness score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[16] = scan.nextInt(); 
            System.out.println("Please enter your Trouble falling asleep score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[17] = scan.nextInt(); 
            System.out.println("Please enter your More Emotional score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[18] = scan.nextInt(); 
            System.out.println("Please enter your Irritability score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[19] = scan.nextInt(); 
            System.out.println("Please enter your Sadness score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[20] = scan.nextInt(); 
            System.out.println("Please enter your Nervous or anxious score (none (0), mild (1-2), moderate (3-4), & severe (5-6)): ");
            cur[21] = scan.nextInt(); 
            System.out.println("Thank you!");  
      SymptomRecord input = new SymptomRecord(this.id, cur);
      if(symptomRecordList.size() < 5) {
         symptomRecordList.add(input);
      } else {
         // keep the most recent 5
          symptomRecordList.add(input);
          symptomRecordList.remove(0);
      }
   }
   
   public void displayRecord () {
      for(int i=0; i< symptomRecordList.size(); i++) 
         System.out.println("Game #" + i + " : " + symptomRecordList.get(i).toString());
   }

}