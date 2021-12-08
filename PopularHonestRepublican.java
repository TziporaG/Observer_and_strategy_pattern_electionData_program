package assignment5_electionStats_GutmannNierman;

public class PopularHonestRepublican implements IPopularRepublican {
	
	public int countVotes(State state) {
		
		//simple implementation, returns the Republican vote count
		return state.getRepublicanPopular();


	}

}
