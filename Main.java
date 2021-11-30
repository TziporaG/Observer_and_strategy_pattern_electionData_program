package assignment5_electionStats_GutmannNierman;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ElectionData electionData = new ElectionData();
		RepublicanFavoringObserver_1 republicanFavoringObserver = new RepublicanFavoringObserver_1(electionData);
		DemocraticFavoringObserver_2 democraticFavoringObserver = new DemocraticFavoringObserver_2(electionData);
		SkewedObserver_3 skewedPopularAndElectoral = new SkewedObserver_3(electionData);
		RaiseDemocraticPopularObserver_4 raisedDemocraticPopular = new RaiseDemocraticPopularObserver_4(electionData);
		HonestObserver_5 honestObserver = new HonestObserver_5(electionData);
		

		ArrayList<State> states = new ArrayList<State>();
		states.add(new State("NJ", 1523, 8966, 7));
		states.add(new State("NY", 1400, 1500, 9));
		states.add(new State("NH", 1000, 789, 4));
		states.add(new State("NC", 900, 932, 2));
		states.add(new State("ND", 7520, 845, 3));
		
		electionData.setElectionStats(states);

	}

}

