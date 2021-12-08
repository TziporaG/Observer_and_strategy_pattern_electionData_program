package assignment5_electionStats_GutmannNierman;

public class PopularHonestRepublican implements IPopularRepublican {
	
	public int countVotes(State state) {
		
		return state.getRepublicanPopular();


	}

}
