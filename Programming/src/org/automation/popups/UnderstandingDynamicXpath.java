package org.automation.popups;

import java.time.LocalDateTime;

public class UnderstandingDynamicXpath {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		//Extract the day of the month
		int date = ldt.getDayOfMonth();
		
		//Get month name in Uppercase
		String monthTemp = ldt.getMonth().toString();
		
		//Convert month into proper format ex. December,November 
		String month = monthTemp.charAt(0)+monthTemp.substring(1).toLowerCase();
		
		//Template :- div[text()='<MONTH>']/../..//span[text()='<DATE>']
		
		System.out.println("div[text()='"+month+"']/../..//span[text()='"+date+"']");
		
	}

}
