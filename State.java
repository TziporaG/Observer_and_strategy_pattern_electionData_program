package assignment5_electionStats_GutmannNierman;

public class State {

	private String name;
	private int popularDemocratic;
	private int popularRepublican;
	private int electoralVoteCount;

	//list of all the valid states
	static final String[] states = { "AL", "AK", "AS", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FM", "FL", "GA", "GU",
			"HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MH", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE",
			"NV", "NH", "NJ", "NM", "NY", "NC", "ND", "MP", "OH", "OK", "OR", "PW", "PA", "PR", "RI", "SC", "SD", "TN",
			"TX", "UT", "VT", "VI", "VA", "WA", "WV", "WI", "WY" };

	public State(String name, int popularDemocratic, int popularRepublican, int electoralVoteCount) {

		//check if a valid state name was entered
		boolean notFound = true;
		for (int i = 0; i < states.length; i++) {
			if (states[i].equalsIgnoreCase(name)) {
				notFound = false;
			}
		}
		if (notFound) {

			throw new InvalidStateException();
		}

		this.name = name;
		
		//if enter a negative vote count number, vote count will eqaul 0
		if (popularDemocratic >= 0) {

			this.popularDemocratic = popularDemocratic;
		}

		if (popularRepublican >= 0) {

			this.popularRepublican = popularRepublican;
		}

		if (electoralVoteCount >= 0) {

			this.electoralVoteCount = electoralVoteCount;
		}
	}

	public int getDemocraticPopular() {
		return popularDemocratic;
	}

	public void setDemocraticVoteCount(int democraticVoteCount) {
		this.popularDemocratic = democraticVoteCount;
	}

	public int getRepublicanPopular() {
		return popularRepublican;
	}

	public void setRepublicanVoteCount(int republicanVoteCount) {
		this.popularRepublican = republicanVoteCount;
	}

	public int getElectoralVoteCount() {
		return electoralVoteCount;
	}

}
