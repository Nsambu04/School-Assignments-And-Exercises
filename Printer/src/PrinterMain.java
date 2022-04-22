
public class PrinterMain {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		myPrinter.turnOn();
		
		myPrinter.print(5);
		myPrinter.getTonerLevel();
	}

}
