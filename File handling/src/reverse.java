
	import java.io.BufferedReader;
	
	import java.io.DataInputStream;
	
	import java.io.FileInputStream;
	
	import java.io.InputStreamReader;
	
	public class reverse 
	
	{
	
	   public static void main(String[] args)
	
	  {
	
	      try{
	
	
	    FileInputStream fstream = new
	
	    FileInputStream("D:\\hj//yy");
	
	  
	
	    DataInputStream in = new DataInputStream(fstream);
	
	    BufferedReader br = new BufferedReader(new InputStreamReader(in));

	    String strLine;
	
	    while ((strLine = br.readLine()) != null)   {
	
	        System.out.println (strLine);	
	    }
	
	    in.close();
	
	    }catch (Exception e){//Catch exception if any
	
	      System.err.println("Error: " + e.getMessage());
	
	    }
	
	  }


}
