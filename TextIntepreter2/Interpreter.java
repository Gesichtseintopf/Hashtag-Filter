import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

	
public class Interpreter 
{
  public static void main(String[] args) throws Exception
  {

	 
	        // File path is passed as parameter
	        File file = new File(
	            "C:\\Users\\nachn\\OneDrive\\Desktop\\twitter_data.txt");
	 
	        // Note:  Double backquote is to avoid compiler
	        // interpret words
	        // like \test as \t (ie. as a escape sequence)
	 
	        // Creating an object of BufferedReader class
	        BufferedReader br
	            = new BufferedReader(new FileReader(file));
	 
	        
	        //initialisierung vom Schreibeprogramm mit dem #Zielpfad in FileWriter
	        BufferedWriter meinWriter = new BufferedWriter(new FileWriter("C:\\Users\\nachn\\OneDrive\\Desktop\\ausgabe8.txt"));
	        
	        // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null)
	        {
	        		br.
	        	System.out.println();
	        	//Laufzeitvarible die Gesetzt wird wenn ein Match läuft
	            boolean match = false;
	            int zaehler=0;
		        for(int i = 0; i<st.length();i++)
		        {
		        		//Sondert die Zeichen am Ende eines Hashtagsstrings aus
			        	if(st.charAt(i)==' '||
			        			st.charAt(i)==')'||
			        			st.charAt(i)=='('||
			        			st.charAt(i)=='"'||
			        			st.charAt(i)=='-'||
			        			st.charAt(i)=='.'||
			        			st.charAt(i)=='?'||
			        			st.charAt(i)==',') 
			        	{
			        		match=false;        		
			        	}
			        	
		        	if(match==true) 
		        	{
		        		// Print .txt the string
		        		meinWriter.write(st.charAt(i));
			            // Print Console the string
			            System.out.print(st.charAt(i));
		        	}
		        	    //Wenn Hashtag kommt den @match true um den state zu halten beim rausschreiben der Daten
			        	if(st.charAt(i)=='#') 
			        	{
			        		match=true;
			        		//Leerzeichen zur Trennung der Wörter in .txt und Konsole
			        		meinWriter.write(' ');
			        		System.out.print(" ");
			        	}
		        }
	        }
    
  }
}
