package assignment5_electionStats_GutmannNierman;

public class RepublicanFavoringElectoral implements IDetermineElectoral {
	
	private int currSmallestDifference = Integer.MAX_VALUE;
	private int prevSmallestDifference = Integer.MAX_VALUE;
	
	public int determineElectoral(State state, int dem, int rep) {
			
		if(dem > rep) {
			
			if(dem - rep < currSmallestDifference)  {
				prevSmallestDifference = currSmallestDifference;
				currSmallestDifference = dem - rep;	
				
				if(prevSmallestDifference != Integer.MAX_VALUE) {
					
					return -3;
				}
				
				return 0;
			}
			
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
