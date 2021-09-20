package com.balu.algorithm.currency;

import java.util.Scanner;

import com.balu.gl.sorting.MergeSortImpl;

/**
 * Bill braker breaks amount in to multiple denaminations
 * @author baluk
 *
 */
public class BillBreaker {

	private int noOfCurrencyDenominations;
	private int[] denominationArray;
	private int amount;
	private int[] notesArray;
	Scanner sc = new Scanner(System.in);

	public void breakTheBill() {
		System.out.println("please enter the  no of denominations");
		noOfCurrencyDenominations = sc.nextInt();

		denominationArray = new int[noOfCurrencyDenominations];
		notesArray = new int[noOfCurrencyDenominations];

		System.out.println("Please enter the Note Denominations");
		for (int i = 0; i < denominationArray.length; i++) {
			denominationArray[i] = sc.nextInt();
		}

		System.out.println("Please enter the Amount to be Breaked");
		amount = sc.nextInt();
		MergeSortImpl sortImpl = new MergeSortImpl();
		sortImpl.sort(denominationArray, 0, denominationArray.length-1);


		for (int i = 0; i < denominationArray.length; i++) {
			if (amount >= denominationArray[i]) {
				notesArray[i] = amount / denominationArray[i];
				amount = amount - (notesArray[i]*denominationArray[i]);
			}
		}
		
		if (amount > 0 ) {
			System.out.println("Exact Amount can not be dispensed");
		}
		else {
			System.out.println("Amount is dispensed in following Denominations");			
		}
		for (int i=0; i< denominationArray.length; i++) {
			if(0 != notesArray[i]) {
				System.out.println("Denomination " + denominationArray[i]  + " :  "  + notesArray[i]);
			}
		}
	}
}
