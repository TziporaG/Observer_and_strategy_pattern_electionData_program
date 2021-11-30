package assignment5_electionStats_GutmannNierman;

public class DemocratFavoringDetermineElectoral implements IDetermineElectoral {
	
	public int determineElectoral(State state, int dem, int rep) {
	
		int swappedVotes = (int) Math.round(rep*.02);
	
		dem += swappedVotes;
		rep -= swappedVotes;
	
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
