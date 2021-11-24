package assignment5_electionStats_GutmannNierman;
import java.util.ArrayList;

public class Display {
	
	IDemocraticDisplay democraticDisplay;
	IRepublicanDisplay republicanDisplay;
	IElectoralDisplay electoralDisplay;
	
	public String displayLegalMessage() {
		
		return "Legal Disclaimer: All reports are purely "
				+ "observational and not legally binding in any way, as well as the current time.";
	}
	
	public void performDemocarticDisplay(State state) {
		
		democraticDisplay.displayVotes(state);
	}
	
	public void performRepublicanDisplay(State state) {
		
		republicanDisplay.displayVotes(state);
	}

	public void performElectoralDisplay(State state) {
	
		electoralDisplay.displayVotes(state);
	}
	
	public void display() {
		
	}
	
	

}
