package assignment5_electionStats_GutmannNierman;

import java.util.Observable;
import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class ElectionData extends Observable {

	// This is the internal observable, the data that is being observed
	public class ElectionStats {
		
		private ArrayList<State> states;
		
		// Get the states in the constructor
		public ElectionStats(ArrayList<State> states) {
			this.states = states;
		}

		public ArrayList<State> getElectionStats() {
			return this.states;
		}

	}

	private ArrayList<State> states;

	public ElectionData() {

	}

	// Alert to the observers that the stats have been changed
	public void electionStatsChanged() {
		setChanged();
		notifyObservers(new ElectionStats(states));
	}

	// Change the election stats, and call the method to alert the observers
	public void setElectionStats(ArrayList<State> states) {
		this.states = states;
		electionStatsChanged();
	}

}
