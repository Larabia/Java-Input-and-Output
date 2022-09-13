import java.util.Scanner;
import java.io.*;

//Uncomment each section and run the program to see it working, comment back before testing the next section

public class InputAndOutput {
	
	public static void main(String[] args) throws IOException  {
		
		/*------------------System.out------------------*/
		
		
		//print displays in the console in one line
		System.out.print("Hello ");
		System.out.print("world");
		
		//println displays in the console in a different line
		System.out.println(" ");
		System.out.println("Hello World");
		
		//println displays in the console in a different line
		String myString = "Lorena";
		System.out.printf("Hello World my name is %s", myString);
		
		
		/*-------------------Scanner--------------------*/
		
		/*
		//Creating an instance of the Scanner class, System.in listens to the user input in the console
		Scanner input = new Scanner(System.in);
		
		//Saving the input from the console into a variable, .next() checks the next input that is pass on the scanner
		String userInput = input.next();
		
		//Printing the input into the console
		System.out.println(userInput);
		*/
		
		/*--------------FileInputStream ----------------*/
		
		/*
		//Saving path into a variable
	    String path = "createdFiles/mockFile.txt";
		
		//Creating an instance of the FileInputStream class, Passing the file path
		FileInputStream inputFile = new FileInputStream(path);
		
		// Counter variable to loop through the file
		int i = 0;
		// A loop to access each character the i = inputFile.read() sentence keeps the while going until there is no more characters
		while((i = inputFile.read()) != -1) {    
		  // Printing each character as it's reached
		  System.out.print((char)i);   
		}
		
		//Closing the file
		inputFile.close();
		*/
		
		/*--------------FileOutputStream ----------------*/
		
		/*
		//Creating the statement we want to convert into a file
		String statement = "This is a brand new file";
		
		
		//Creating an instance of the FileOutputStream class, Passing the name of the file we want to create into the path
		FileOutputStream output = new FileOutputStream("createdFiles/output.txt");
		
		// Convert statement to bytes.
		byte[] statementBytes = statement.getBytes();
		
		
		// Option 1:
		// Write all contents to file
		output.write(statementBytes);
		
		//Close file
		output.close();
		
		
		//option 2 (save partial)
		FileOutputStream output2 = new FileOutputStream("createdFiles/output2.txt");
		
		output2.write(statementBytes, 0, 4);
		//Close file
		output2.close();
		*/
		
		
		/*-----EXTRA POINTS: COMBINING  System.out/Scanner/FileInputStream/FileOutputStream-----*/
		/*
		//We are going to create a new file of console imput and data from mock2.txt
		
		//First we save the data from mock2.txt into a variable. Use File class this time!
		
		File mock2 = new File("createdFiles/mock2.txt");
		
		String mock2String = "";
		
		FileInputStream inputFile2 = new FileInputStream(mock2);
		
		int j = 0;
		
		while ((j = inputFile2.read()) != -1) {
			mock2String = mock2String + Character.toString((char)j);
		}
		
		inputFile2.close();
		

		//Second we save the data from the user input
		System.out.println("Ingrese su nombre: ");
		
		Scanner scanner2 = new Scanner(System.in);
		String userInput2 = scanner2.next();
		
		
		//Thrid concatenate both strings in one and convert it into a file
		if(userInput2 != "") {
			
		String output2 = mock2String + userInput2;
		
		FileOutputStream output3 = new FileOutputStream("createdFiles/output3.txt");
		
		output3.write(output2.getBytes());
		
		output3.close();
		
		}
		*/
	}

}
