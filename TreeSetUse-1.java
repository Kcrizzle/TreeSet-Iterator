//Kevin Craig

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetUse {

    public static void main(String[] args) {
    	
    	 TreeSet<String> treeSet = new TreeSet<String>(); //declaring TreeSet
         Scanner input = new Scanner(System.in);
         String userInput;
         
         System.out.print("Enter your first word and press enter, \n"); 
         System.out.print("or enter -1 to end input and display TreeSet: \n");
        
         
         treeSet.add(input.next());//receive first input from user
         
         while(!(userInput = input.nextLine()).equals("-1")){ //sentinel control to end loop
        	    treeSet.add(userInput);//add next user input to TreeSet
        	    System.out.print("Enter your next word: ");
        	}
         
    	
       
         Iterator<String> iterator = treeSet.iterator();//declaring iterator
         
         while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
         }
         System.out.println();
    }
}