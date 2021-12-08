package assignment5_electionStats_GutmannNierman;

public class PopularHonestDemocratic implements IPopularDemocratic {
	
	
	//simple implementation, returns the true vote count
	public int countVotes(State state) {

		return state.getDemocraticPopular();

	}

}
