public class SymptomRecord
{
     protected int ownerID;
     public int[] symptom;
 

     // default constructor
     public SymptomRecord ()
     {
		 ownerID=0;
		 for(int i=0; i< symptom.length; i++)
		   symptom[i]=-1;
	 }

     // other constructor
     public SymptomRecord(int id, int[] cur)
	 {
	     this.ownerID=id;
	     this.symptom = new int[22];
	     for(int i=0; i< cur.length; i++) {
		   this.symptom[i]=cur[i];
	     }
     }
     
    public int getTotalNumberofSymptoms() {
        int total = 0;
        for(int i=0; i < symptom.length; i++) {
            if(symptom[i] != -1 && symptom[i] != 0 ) {
                total++;
            }
        }
        return total;
    }
    
    public int getSymptomSeverityScore() {
        int score = 0;
    	
      for(int i=0; i < symptom.length; i++ ) {
    	score+=symptom[i];
      }
      
      return score;
    }
    
    public String compareSymptomRecord(SymptomRecord t) {
        String overallRating = "Unknown";
        int symptomDiff = Math.abs( this.getSymptomSeverityScore() - t.getSymptomSeverityScore() );
        if(symptomDiff < 3 && t.getSymptomSeverityScore() < 10){
            overallRating = "No Difference";
        }else if(symptomDiff < 3 && t.getSymptomSeverityScore() >=10){
            overallRating = "Unsure";
        }else if(symptomDiff >= 3 && t.getSymptomSeverityScore() >= 15){
            overallRating = "Very Different";
        }
        
        return overallRating;
    }
    

     public String toString()
	  {
	 		return "Symptom Record of Athlete " + ownerID + "  \n" + "   Total Symptom :" + this.getTotalNumberofSymptoms() + "   Severity score : " + this.getSymptomSeverityScore() ;
	 		
	  }


}