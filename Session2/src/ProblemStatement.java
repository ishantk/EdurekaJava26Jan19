
public class ProblemStatement {

	public static void main(String[] args) {
		
		// Storing data like below using Single Value Containers is OK for few regions.
		
		// PS: But for all regions its gonna be complex and challenging !!
		
		// Vote Counts from various regions for Democratic Party
		int demArizonaVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;
		
		// Vote Counts from various regions for Republican Party
		int repArizonaVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;
		
		// PS : Adding 5 variables is OK but n number of variables will be a challenge !!
		
		int demVoteCount = demArizonaVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		int repVoteCount = repArizonaVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party won by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println("Republican Party won by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		System.out.println();
		
		// Above Program shall solve problem statement for finding who won
		// But will become messier for programmer/developer when regions increase in number !!
		// Lets say for 100 regions ?? 
		
		// Solution is to use a Multi Value Container i.e. Array !!
		
		// Data Storage and Representation is now Simplified
		int[] demVotes = {126, 32, 230, 21, 200};
						// 0   1    2   3    4
		int[] repVotes = {152, 85, 121, 215, 13};
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		for(int vote : demVotes){
			demVoteCount = demVoteCount + vote;
		}
		
		for(int vote : repVotes){
			repVoteCount = repVoteCount + vote;
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party won by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println("Republican Party won by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		System.out.println();
		
		/*
		int[] a = new int[5]; // 0, 1, 2, 3, 4 indexes with all elements as 0 
		int i=2; 			  //	   |  |
		//a[i++]=10;	      //       10 |
		a[++i]=10;			  //          10

		System.out.println("i is: "+i);
		
		for(int elm : a){
			System.out.print(elm+"  ");
		}
		*/
	}

}
