package org.system;

public class Desktop extends Computer {
   public void desktopSize() {
	   String Size ="15.6 inches ";
	   System.out.println("THE SIZE OF THE DESKTOP IS :"+Size );
   }
   public static void main(String[]args) {
	   Desktop details=new Desktop();
	   details.computerModel();
	   details.desktopSize();
   }
}
