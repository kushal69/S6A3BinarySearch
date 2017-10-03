package com;

import java.util.Scanner;

//	Main Class implementing the Binary Search
public class BinarySearch {
	//	Main Method
	public static void main(String args[]) {
		int size, i, search, first, last, middle;
		int arr[] = new int[50];								//	Declaring the Array
		
		Scanner userInput = new Scanner(System.in);				//	Scanner object class to get the user input

		System.out.print("Enter Total Number of Elements  below 50 : ");	
		size = userInput.nextInt();								//	Gets the size of the array from the user

		System.out.println("Enter " + size + " Elements in the ascending order : ");
		for (i = 0; i < size; i++) {							//	Initializing the Array with the user input values from the scanner in an ascending order
			arr[i] = userInput.nextInt();						//	Because Binary Search works on only sorted elements.
		}

		System.out.print("Enter a Number to Search : ");
		search = userInput.nextInt();							//	Getting the number to be searched from the user

		first = 0;												//	Assigning the initial values
		last = size - 1;
		middle = (first + last) / 2;

		while (first <= last) {									//	While loop until the array parsing to the last of the array
			if (arr[middle] < search) {							//	Checking if the middle number is less than the entered number for search 
				first = middle + 1;								//	If so the search will happen on the right part of the array
			} else if (arr[middle] == search) {					//	Checking if the middle number is equal to the entered number for search
				System.out.print("Entered number to Search - " + search + " is at Location " + middle);		//	If so printing the location of the number in the 
				break;																						//	array
			} else {
				last = middle - 1;								//	If the middle number is greater than the entered number for search 
																//	then search will happen on the left part of the array
			}
			middle = (first + last) / 2;						//	Calculating the middle of the array after recalculating the first and last values
		}
		if (first > last) {										//	After parsing of the array for the entered search element first will be greater than the last
			System.out.print("Entered number to " + search + " is not Present in the Array");	//	resulting in entered element not found in the array.
		}
		userInput.close();										//	Closing the Scanner input.
	}
}
