package assignment5_electionStats_GutmannNierman;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
	
	IDisplayStandings displayStandings;
	private ArrayList<State> states;
	
	public Display(Observable electionData) {
		
		electionData.addObserver(this);
	}
	
	public String displayLegalMessage() {
		
		return "Legal Disclaimer: All reports are purely "
				+ "observational and not legally binding in any way, as well as the current time.";
	}
	
	
	public void update(Observable electionData, Object object)
	{
		if (object instanceof ElectionData.ElectionStats)
		{
			ElectionData.ElectionStats electionStats = (ElectionData.ElectionStats) object;
			this.states = electionStats.getElectionStats();
			displayStandings(states);
		}
	}
	/**
	public int getDemocraticCount(ArrayList<State> states) {
		
		int dem = 0;
		for(State s: states) {
			dem += s.getDemocraticVoteCount();	
		}
		
		return dem;
		
	}
	
	public int getRepublicanCount(ArrayList<State> states) {
		
		int rep = 0;
		for(State s: states) {
			rep += s.getRepublicanVoteCount();	
		}
		
		return rep;
	}

	public int getElectoralCount(ArrayList<State> states) {
		
		int electoral = 0;
		for(State s: states) {
			 electoral += s.getRepublicanVoteCount();	
		}
		
		return electoral;
	}
	*/
	//built in thing to calculate total votes- same for everyone
	//calculating and displaying will the interfaced out
	public void displayStandings(ArrayList<State> states) {
		
		displayStandings.displayStandings(states);
		
		
		
		
	}
	
	

}
