package com.smartquote.automation.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class GetQuoteUtilities {
	
public static void GetDeailsforQuote(String quoteinput) throws Exception {
		
	Map<String, String> map = new HashMap<String, String>();
	
	try {
        //String str = "SomeMoreTextIsHere";
        File newTextFile = new File("src\\test\\resources\\config\\sqfile.txt");
        FileWriter fw = new FileWriter(newTextFile);
        fw.write(quoteinput);
        fw.close();
    } catch (IOException iox) {
        //do stuff with exception
        iox.printStackTrace();
    }
	BufferedReader in = new BufferedReader(new FileReader("src\\test\\resources\\config\\sqfile.txt"));
	String line = "";
	int de = 1;
	while ((line = in.readLine()) != null) {

		String str = new String(line);

		if ((str.indexOf(':')) > 0) {
			  de = ++de;
			String parts[] = line.split(":");
			map.put(parts[0], parts[1]);

			if (de == 7) {
				break;
			}
			//System.out.println(de);
		}

	}
	in.close();
	System.out.println(map.toString());
		
}
public static  String[] checkString(String quoteID){
    
    String string = quoteID;
   
    String[] textid = string.split("-");
    String textvalue1 = textid[0]; // 
    String textvalue2 = textid[1]; // 
       
    if (string.contains("-")) {
    	
        // Split it.
    	//System.out.println(quoteID);
    	
    } else {
        throw new IllegalArgumentException("String " + string + " does not contain -");
    }
	return textid;
    }

    public static  String[] checkStringurl(String s){
	    
	    String string = s;
	   
	    String[] textid = string.split("&");
	    String textvalue1 = textid[0]; // 
	    String textvalue2 = textid[1]; // 
	       
	    if (string.contains("&")) {
	    	
	        // Split it.
	    	//System.out.println(quoteID);
	    	
	    } else {
	        throw new IllegalArgumentException("String " + string + " does not contain -");
	    }
		return textid;
	    }
    
  
	
}
