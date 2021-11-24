package assignment5_electionStats_GutmannNierman;
import java.util.Observable;
import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class ElectionData extends Observable {
	
	public class ElectionStats
	
	{
		private ArrayList<State> states;
		
		public ElectionStats(ArrayList<State> states) {
			
			this.states = states;
		}
		
		public ArrayList<State> getElectionStats() {
			
			return this.states;
		}
		
		
	}

	private ArrayList<State> states;
	
	public ElectionData () {
		
	}
	
	public void electionStatsChanged() 
	{
		setChanged();
		notifyObservers(new ElectionStats(states));
	}
	
	
	public void setElectionStats (ArrayList<State> states)
	{
		this.states = states;
		electionStatsChanged();
	}
	
	
}
