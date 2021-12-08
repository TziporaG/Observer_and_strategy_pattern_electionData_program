package assignment5_electionStats_GutmannNierman;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	/**
	 * Properties Choose 'Java Build Path' Click on 'Sources' tab on top Click on
	 * 'Add Folder' on the right panel Select your folders and apply
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ElectionData electionData = new ElectionData();

		Observer_5_Honest honest = new Observer_5_Honest(electionData);
		Observer_4_RaisingDemocraticPopular raisingDemocraticPopular = new Observer_4_RaisingDemocraticPopular(
				electionData);
		Observer_3_Skewed skewedPopularAndElectoral = new Observer_3_Skewed(electionData);
		Observer_2_FavoringDemocratic democraticFavoringObserver = new Observer_2_FavoringDemocratic(electionData);
		Observer_1_FavoringRepublican republicanFavoringObserver = new Observer_1_FavoringRepublican(electionData);

		ArrayList<State> states = new ArrayList<State>();
		states.add(new State("NJ", 1523, 8966, 7));
		states.add(new State("NY", 1400, 1500, 9));
		states.add(new State("NH", 1000, 789, 4));
		states.add(new State("NC", 900, 932, 2));
		states.add(new State("ND", 7520, 845, 3));

		electionData.setElectionStats(states);

		Random randVoteCount = new Random();

		for (int i = 0; i < 4; i++) {

			System.out.println("\n****************DATA CHANGED********************");
			for (int j = 0; j < states.size(); j++) {

				states.get(j).setDemocraticVoteCount(randVoteCount.nextInt(10000));
				states.get(j).setRepublicanVoteCount(randVoteCount.nextInt(10000));
			}

			electionData.electionStatsChanged();
		}
	}
}
