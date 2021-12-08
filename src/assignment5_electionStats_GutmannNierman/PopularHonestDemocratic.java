package assignment5_electionStats_GutmannNierman;

public class PopularHonestDemocratic implements IPopularDemocratic {

	public int countVotes(State state) {

		return state.getDemocraticPopular();

	}

}
