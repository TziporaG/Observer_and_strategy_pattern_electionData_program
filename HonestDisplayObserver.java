package assignment5_electionStats_GutmannNierman;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class HonestDisplayObserver extends Display implements Observer {
	
	private ArrayList<State> states;
	
	
	public HonestDisplayObserver(Observable electionData) {
		
			electionData.addObserver(this);
			democraticDisplay = new DemocraticDisplay();
			republicanDisplay = new RepublicanDisplay();
			electoralDisplay = new ElectoralDisplay();
				
		}

	public void update(Observable electionData, Object object)
	{
		if (object instanceof ElectionData.ElectionStats)
		{
			ElectionData.ElectionStats electionStats = (ElectionData.ElectionStats) object;
			this.states = electionStats.getElectionStats();
			display();
		}
	}
	
	public void display()
	{
		for(State s: this.states) {
			System.out.println("State " + s.getName());
			System.out.println(democraticDisplay.displayVotes(s));
			System.out.println(republicanDisplay.displayVotes(s));
			System.out.println(electoralDisplay.displayVotes(s));
		}
		
		int dem = 0, rep = 0, demElectoral = 0, repElectoral = 0;
		for(State s: this.states) {
			dem += s.getDemocraticVoteCount();
			rep += s.getRepublicanVoteCount();
			
			if(s.getDemocraticVoteCount() >= s.getRepublicanVoteCount()) {
				demElectoral += s.getElectoralVoteCount();
			}
			else {
				repElectoral += s.getElectoralVoteCount();
			}
		}
			
			System.out.println("Current Standings:");
			System.out.println("------------------");
			
			System.out.println("Popular Vote: Democratic = " + dem + "Republican = " + rep);
			System.out.println("Electoral Vote: Democratic = " + demElectoral + "Republican = " + repElectoral);
			
			if(demElectoral > repElectoral) {
				System.out.println("Projected: Democratic");
			}
			
			else if(demElectoral == repElectoral){
				System.out.println("Projected: Undetermined");
			}
			
			else {
				System.out.println("Projected: Republican");
			}
			
			
		}
	

}
