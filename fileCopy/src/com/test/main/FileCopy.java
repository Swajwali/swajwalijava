package com.test.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String file1name;
		String file2name;
		
		
		//	file1name = args[0];
		//	file2name = args[1];
			//File 
			 File copied = new File("src/copiedWithIo.txt");
			 //   String original;
			   File original = new File("copiedWithIo.txt");
				try (
			      InputStream in = new BufferedInputStream(
			        new FileInputStream(original));
			      OutputStream out = new BufferedOutputStream(
			        new FileOutputStream(copied))) {
			  
			        byte[] buffer = new byte[1024];
			        int lengthRead;
			        
			        while ((lengthRead = in.read(buffer)) > 0) {
			        	
			            out.write(buffer, 0, lengthRead);
			            out.flush();
			        }
			    }
			
	
	}
}
