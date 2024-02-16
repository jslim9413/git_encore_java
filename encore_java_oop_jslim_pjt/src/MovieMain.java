import com.encore.movie.guessgame.MovieServiceImpl;

public class MovieMain {

	public static void main(String[] args) {
		
		MovieServiceImpl service = new MovieServiceImpl() ; 
		
		String selectedSentence  = service.selectSentence() ; 
		System.out.println(" selectedSentence >>>  " + selectedSentence ); 
		
		// String str = service.initGame(selectedSentence) ; 
		// StringBuffer solving = new StringBuffer(str); 
		
		
	}

}





