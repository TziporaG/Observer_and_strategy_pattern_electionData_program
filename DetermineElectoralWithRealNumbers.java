package assignment5_electionStats_GutmannNierman;

public class DetermineElectoralWithRealNumbers implements IDetermineElectoral {
	
	
public int determineElectoral(State state, int dem, int rep) {

	dem = state.getDemocraticVoteCount();
	rep = state.getRepublicanVoteCount();
	
	if(dem > rep) {
		return -1;
	}
	
	else if (rep > dem ){
		return 1;
	}
	
	//split the electoral votes in half if there is a tie
	else {
		return 0;
	}

}

}
