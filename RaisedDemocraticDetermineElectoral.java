package assignment5_electionStats_GutmannNierman;

public class RaisedDemocraticDetermineElectoral implements IDetermineElectoral {
	
	private int currHighestElectoral = 0;
	private int currHighestElectoralWinner = 0;
	private int prevHighestElectoral = 0;
	private int prevHighestElectoralWinner = 0;
	
	public int determineElectoral(State state, int dem, int rep) {
		
		if(state.getElectoralVoteCount() > currHighestElectoral) {
			
			prevHighestElectoral = currHighestElectoral;
			prevHighestElectoralWinner = currHighestElectoralWinner;
			
			currHighestElectoralWinner = dem > rep ? -1:1;
			currHighestElectoral = state.getElectoralVoteCount();
			
			if(prevHighestElectoralWinner == 1) {
				return -2;
			}
			
			else {
				return -1;
			}
		}
			
			
		else if(dem > rep) {
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
	
	


