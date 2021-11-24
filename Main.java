package assignment5_electionStats_GutmannNierman;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ElectionData electionData = new ElectionData();
		HonestDisplayObserver honestDisplay = new HonestDisplayObserver(electionData);

		ArrayList<State> states = new ArrayList<State>();
		states.add(new State("NJ", 1523, 8966, 7));
		states.add(new State("NY", 1845, 1500, 9));
		states.add(new State("NH", 1000, 789, 4));
		states.add(new State("NC", 900, 932, 2));
		states.add(new State("ND", 7520, 845, 3));
		
		electionData.setElectionStats(states);
	}

}
