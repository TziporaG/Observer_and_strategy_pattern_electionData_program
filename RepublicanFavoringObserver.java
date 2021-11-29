package assignment5_electionStats_GutmannNierman;


	import java.util.ArrayList;
	import java.util.Observable;
	import java.util.Observer;

	@SuppressWarnings("deprecation")
	public class RepublicanFavoringObserver extends Display{
		
		private ArrayList<State> states;
		
		
		public RepublicanFavoringObserver(Observable electionData) {
				
				super(electionData);
				//electionData.addObserver(this);
				displayStandings = new RepublicanFavoringDisplay();
		}
				

}
