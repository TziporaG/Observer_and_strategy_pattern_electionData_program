package assignment5_electionStats_GutmannNierman;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {

	protected ArrayList<State> states;

	IPopularDemocratic popularDemocratic;
	IPopularRepublican popularRepublican;
	IElectoral determineElectoral;

	// Display the election data
	public Display(Observable electionData) {

		electionData.addObserver(this);
	}

	// Get the election stats
	public void update(Observable electionData, Object object) {
		if (object instanceof ElectionData.ElectionStats) {
			ElectionData.ElectionStats electionStats = (ElectionData.ElectionStats) object;
			this.states = electionStats.getElectionStats();

			// Each display does something different depending on its slant
			displayStandings();
		}
	}

	// This message will be displayed with every display of the election stats
	public void displayLegalMessage() {

		System.out.println("Legal Disclaimer: All reports are purely "
				+ "observational and not legally binding in any way, as well as the current time.");
	}

	public int performDemocraticVoteCount(State state) {

		return popularDemocratic.countVotes(state);
	}

	public int performRepublicanVoteCount(State state) {

		return popularRepublican.countVotes(state);
	}

	public int performDetermineElectoral(State state, int dem, int rep) {

		return determineElectoral.determineElectoral(state, dem, rep);
	}

	//This method will actually display all the stats
	public void displayStandings() {

		printStrategyName();
		int demTotal = 0, repTotal = 0, demElectoral = 0, repElectoral = 0, 
				dem = 0, rep = 0, detElectoral;

		// Loop through the states and get the stats for each
		for (int i = 0; i < states.size(); i++) {

			dem = performDemocraticVoteCount(states.get(i));
			rep = performRepublicanVoteCount(states.get(i));

			demTotal += dem;
			repTotal += rep;

			detElectoral = performDetermineElectoral(states.get(i), dem, rep);

			// This means that the Democrats won that state
			if (detElectoral == -1) {
				demElectoral += states.get(i).getElectoralVoteCount();
			}

			// This means that the Republicans won that state
			else if (detElectoral == 1) {
				repElectoral += states.get(i).getElectoralVoteCount();
			}

			// This means that the Republicans won that state, but the Democrats skewed it to
			// count as their win
			else if (detElectoral == -2) {

				// Give back the votes the Dems had taken away when they thought the previous state
				// had the highest electoral vote count
				repElectoral += states.get(i - 1).getElectoralVoteCount();
				demElectoral -= states.get(i - 1).getElectoralVoteCount();

				demElectoral += states.get(i).getElectoralVoteCount();
			}

			// This means that the Democrats won that state, but the Republicans skewed it to
			// count as their win
			else if (detElectoral == -3) {

				// Undo the split that happened when the previous state had the smallest margin of
				// Dem win
				demElectoral -= Math.floor(states.get(i - 1).getElectoralVoteCount() / 2);
				repElectoral -= Math.ceil(states.get(i - 1).getElectoralVoteCount() / 2);

				// Give all the votes to the Dems
				demElectoral += states.get(i - 1).getElectoralVoteCount();

				// Perform the split on the current state
				demElectoral += Math.floor(states.get(i).getElectoralVoteCount() / 2);
				repElectoral += Math.ceil(states.get(i).getElectoralVoteCount() / 2);

			}

			// If the vote count is exactly even
			else {
				demElectoral += Math.floor(states.get(i).getElectoralVoteCount() / 2);
				repElectoral += Math.ceil(states.get(i).getElectoralVoteCount() / 2);

			}
		}

		System.out.println("Current Standings:");
		System.out.println("------------------");

		System.out.println("Popular Vote: Democratic = " + demTotal + " Republican = " + repTotal);
		System.out.println("Electoral Vote: Democratic = " + demElectoral + " Republican = " + repElectoral);

		if (demElectoral > repElectoral) {
			System.out.println("Projected: Democratic");
		}

		else if (demElectoral == repElectoral) {
			System.out.println("Projected: Undetermined");
		}

		else {
			System.out.println("Projected: Republican");
		}

		displayLegalMessage();
	}

	public void printStrategyName() {

	}

}
