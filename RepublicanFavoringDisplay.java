package assignment5_electionStats_GutmannNierman;
import java.util.ArrayList;

public class RepublicanFavoringDisplay implements IDisplayStandings {
		
		public void displayStandings(ArrayList<State> states) {
			
			System.out.println("\nFavored towards Republican");
			
			double dem = 0; 
		    int rep = 0, demElectoral = 0, repElectoral = 0;
			for(State s: states) {
				
				dem += s.getDemocraticVoteCount() * .95;
				rep += s.getRepublicanVoteCount();
				
				
				if(s.getDemocraticVoteCount() >= s.getRepublicanVoteCount()) {
					demElectoral += s.getElectoralVoteCount();
				}
				else {
					repElectoral += s.getElectoralVoteCount();
				}
			}
			
			
			System.out.println("Current Standings:");
			System.out.println("------------------");
			
			System.out.println("Popular Vote: Democratic = " + dem + " Republican = " + rep);
			System.out.println("Electoral Vote: Democratic = " + demElectoral + " Republican = " + repElectoral);
			
			if(demElectoral > repElectoral) {
				System.out.println("Projected: Democratic");
			}
			
			else if(demElectoral == repElectoral){
				System.out.println("Projected: Undetermined");
			}
			
			else {
				System.out.println("Projected: Republican");
			}
			
		}

}



