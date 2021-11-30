package assignment5_electionStats_GutmannNierman;

public class State {
	
	private String name;
	private int democraticVoteCount;
	private int republicanVoteCount;
	private int electoralVoteCount;
	private boolean specialState = false;
	
	static final String[] states = { "AL", "AK", "AS", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FM", "FL", "GA", 
			"GU", "HI", "ID", 
			"IL", "IN", "IA", "KS", "KY", "LA", "ME", "MH", "MD", 
			"MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "MP", 
			"OH", "OK", "OR", "PW", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VI", "VA", "WA", "WV", "WI", "WY"};
	
	public State(String name, int democraticVoteCount, int republicanVoteCount, int electoralVoteCount) {
		
		boolean notFound = true;
		for(int i = 0; i < states.length; i++) {
				if(states[i].equalsIgnoreCase(name)) {
					notFound = false;
				}	
		}
		if(notFound) {
			
			throw new InvalidStateException();
		}
		
		this.name = name;
		
		if(democraticVoteCount >= 0) {
			
			this.democraticVoteCount = democraticVoteCount;
		}
		
		if(republicanVoteCount >= 0) {
			
			this.republicanVoteCount = republicanVoteCount;
		}
		
		if(electoralVoteCount >= 0) {
			
			this.electoralVoteCount = electoralVoteCount;
		}
	}

	public int getDemocraticVoteCount() {
		return democraticVoteCount;
	}

	public void setDemocraticVoteCount(int democraticVoteCount) {
		this.democraticVoteCount = democraticVoteCount;
	}

	public int getRepublicanVoteCount() {
		return republicanVoteCount;
	}

	public void setRepublicanVoteCount(int republicanVoteCount) {
		this.republicanVoteCount = republicanVoteCount;
	}

	public int getElectoralVoteCount() {
		return electoralVoteCount;
	}

	public void setElectoralVoteCount(int electoralVoteCount) {
		this.electoralVoteCount = electoralVoteCount;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setSpecialState() {
		
		this.specialState  = true;
	}
	
	public boolean getSpecialState() {
		
		return this.specialState;
	}
	
}

