package assignment5_electionStats_GutmannNierman;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
	
	
	protected ArrayList<State> states;
	
	IDemocraticVoteCounter democraticVoteCounter;
	IRepublicanVoteCounter republicanVoteCounter;
	IDetermineElectoral determineElectoral;
	
	public Display(Observable electionData) {
		
		electionData.addObserver(this);
	}
	
	
	public void update(Observable electionData, Object object)
	{
		if (object instanceof ElectionData.ElectionStats)
		{
			ElectionData.ElectionStats electionStats = (ElectionData.ElectionStats) object;
			this.states = electionStats.getElectionStats();
			
			//where we need each display to do something different...
			displayStandings();
		}
	}
	
	public void displayLegalMessage() {
		
		System.out.println("Legal Disclaimer: All reports are purely "
				+ "observational and not legally binding in any way, as well as the current time.");
	}
	
	
	public int performDemocarticVoteCount(State state) {

		return democraticVoteCounter.countVotes(state);
	}

	public int performRepublicanVoteCount(State state) {

		return republicanVoteCounter.countVotes(state);
	}

	public int performDetermineElectoral(State state, int dem, int rep) {

		return determineElectoral.determineElectoral(state, dem, rep);
	}
	
	public void displayStandings() {
		
		printStrategyName();
		int demTotal = 0, repTotal = 0, demElectoral = 0, repElectoral = 0, dem = 0, rep = 0, detElectoral;
		
		for(int i = 0; i < states.size(); i++) {
			
			dem = performDemocarticVoteCount(states.get(i));
			rep = performRepublicanVoteCount(states.get(i));
			
			demTotal += dem;
			repTotal += rep;
			
			detElectoral = performDetermineElectoral(states.get(i), dem, rep);
			
			if(detElectoral == -1) {
				demElectoral += states.get(i).getElectoralVoteCount();
			}
			
			else if(detElectoral == 1) {
				repElectoral += states.get(i).getElectoralVoteCount();
			}
			
			else if(detElectoral == -2) {
				
				repElectoral+= states.get(i-1).getElectoralVoteCount();
				demElectoral-= states.get(i-1).getElectoralVoteCount();
				
				demElectoral+= states.get(i).getElectoralVoteCount();
			}
			
			else if(detElectoral == -3) {
				
				demElectoral -= Math.floor(states.get(i-1).getElectoralVoteCount()/2);
				repElectoral -= Math.ceil(states.get(i-1).getElectoralVoteCount()/2);
				
				demElectoral += states.get(i-1).getElectoralVoteCount();
				
				demElectoral += Math.floor(states.get(i).getElectoralVoteCount()/2);
				repElectoral += Math.ceil(states.get(i).getElectoralVoteCount()/2);
				
			}
			
			else {
				demElectoral += Math.floor(states.get(i).getElectoralVoteCount()/2);
				repElectoral += Math.ceil(states.get(i).getElectoralVoteCount()/2);
				
			}
		}
		
			System.out.println("Current Standings:");
			System.out.println("------------------");
			
			System.out.println("Popular Vote: Democratic = " + demTotal + " Republican = " + repTotal);
			System.out.println("Electoral Vote: Democratic = " + demElectoral + " Republican = " + repElectoral);
			
			if(demElectoral > repElectoral) {
				System.out.println("Projected: Democratic");
			}
			
			else if(demElectoral == repElectoral){
				System.out.println("Projected: Undetermined");
			}
			
			else {
				System.out.println("Projected: Republican");
			}
			
			displayLegalMessage();
		}


	public void printStrategyName() {
	
	}
			
		}
	
	


