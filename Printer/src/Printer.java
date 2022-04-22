import java.util.Scanner;
/**
 * @author Nsambu Emmanuel Namenda  2019040093
 * 
 	Note: Ink level drops by one for every 5 pages printed
 */

public class Printer {
	
	Scanner input = new Scanner(System.in);
	//How much ink is in the toner catridge
	private int inkLevel = 100;
	//number of pages printed
	private int pagesPrinted = 0;
	//Duplex means can print on two sides of a piece of paper
	private boolean isDuplex = false;
	//Check if printer is on
	private boolean on = false;
	//Answers the question of printing on both sides
	private String answer;
	
	//Turn on the printer
	public void turnOn() {
		on = true;
		System.out.println("On");
	}
	
	//Turn off the printer
	public void turnOff() {
		on = false;
		System.out.println("Off");
	}
	
	//Fill up the toner
	public void setTonerLevel() {
		if(inkLevel >= 0 && inkLevel < 100 ) {
			this.inkLevel = 100;
		}
		else {
			System.out.println("The toner is at 100% capacity");
		}
	}
	
	//Get ink level
	public void getTonerLevel() {
		System.out.println("Ink level remaining: "+ inkLevel + "%");
	}
	
	//method to emulate printing a page the user indicates how many pages to print.
	public void print(int pages) {
		
		//Condition to print
		if(on == true && inkLevel > 0) {
			printBothSides();
			if(!this.isDuplex && inkLevel > 0) {
			//The number of pages being printed
			this.pagesPrinted = pages;
			
			System.out.println("Number of pages printed: " + getPagesPrinted());
			//reduce toner level
			this.inkLevel = this.inkLevel - (pages/5);
		}
			//Double the number of pages printed
			else if(this.isDuplex && inkLevel > 0) {
				this.pagesPrinted = 2*pages;
				
				System.out.println("Number of pages printed: "+ getPagesPrinted() + ". " + pages + " pages printed on both sides.");
				//reduce toner level
				this.inkLevel = this.inkLevel - (pagesPrinted/5);
				}
			 if(inkLevel == 0) {
					System.out.println("To continue printing, fill up ink toner");
				}
			}
			else {
			System.out.println("Printer is off, can't print");
			}
	}
	public void printBothSides() {
		System.out.println("Print on both sides of the paper? Y/N");
		answer = input.next();
		if(answer.equals("Y")) {
			this.isDuplex = true;
		}
		else {
			this.isDuplex = false;
		}
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
