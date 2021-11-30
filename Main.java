package assignment5_electionStats_GutmannNierman;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		ElectionData electionData = new ElectionData();
		

		HonestObserver_5 honestObserver = new HonestObserver_5(electionData);
		RaiseDemocraticPopularObserver_4 raisedDemocraticPopular = new RaiseDemocraticPopularObserver_4(electionData);
		SkewedObserver_3 skewedPopularAndElectoral = new SkewedObserver_3(electionData);
		DemocraticFavoringObserver_2 democraticFavoringObserver = new DemocraticFavoringObserver_2(electionData);
		RepublicanFavoringObserver_1 republicanFavoringObserver = new RepublicanFavoringObserver_1(electionData);
		
		ArrayList<State> states = new ArrayList<State>();
		states.add(new State("NJ", 1523, 8966, 7));
		states.add(new State("NY", 1400, 1500, 9));
		states.add(new State("NH", 1000, 789, 4));
		states.add(new State("NC", 900, 932, 2));
		states.add(new State("ND", 7520, 845, 3));
		
		electionData.setElectionStats(states);

		Random randVoteCount = new Random();
	
	for(int i = 0; i < 4; i++) {
		
		System.out.println("\n****************DATA CHANGED********************");
		for(int j = 0; j < states.size(); j++) {
			
			states.get(j).setDemocraticVoteCount(randVoteCount.nextInt(10000));
			states.get(j).setRepublicanVoteCount(randVoteCount.nextInt(10000));	
		}
		
		electionData.electionStatsChanged();
	}
	}
}

