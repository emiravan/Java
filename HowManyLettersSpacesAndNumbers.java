package Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    
        int letter=0,space=0,number=0,other=0;
        
        System.out.print("Enter string: ");
        String sentence = scanner.nextLine();
        
        for(int i=0;i<sentence.length();i++)
        {
        	if((int) sentence.charAt(i)>=48&&(int) sentence.charAt(i)<=57)
	        	number++;
        	if((int) sentence.charAt(i)>=65&&(int) sentence.charAt(i)<=90||(int) sentence.charAt(i)>=97&&(int) sentence.charAt(i)<=122)
        		letter++;
        	if((int) sentence.charAt(i)==32)
        		space++;
        	else
	        	other++;
        		
        }
        
        System.out.println("The string is : "+sentence+"\nletter: "+letter+"\nspace: "+space+"\nnumber: "+number+"\nother: "+other);
        
        
    }
}
