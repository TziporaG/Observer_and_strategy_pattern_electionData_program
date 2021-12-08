package assignment5_electionStats_GutmannNierman;

public class PopularLoweredDemocratic implements IPopularDemocratic {

	public int countVotes(State state) {

		return (int) Math.round(state.getDemocraticPopular() * .95);
	}
}
