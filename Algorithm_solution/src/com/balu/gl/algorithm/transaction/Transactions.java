package com.balu.gl.algorithm.transaction;

import java.util.Scanner;

public class Transactions {

	private int[] transactions;
	private int noOfTransactions;
	private int target;
	private int targetTransactions;

	Scanner sc = new Scanner(System.in);

	public void findStatus() {
		System.out.println("Please enter no of transactions");
		noOfTransactions = sc.nextInt();

		transactions = new int[noOfTransactions];

		for (int i = 0; i < transactions.length; i++) {
			System.out.println("Please enter " + (i + 1) + " transaction");

			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		targetTransactions = sc.nextInt();
		System.out.println("Please enter the Target");
		target = sc.nextInt();

		while (targetTransactions != 0) {
			int sum = 0;
			int trans = 0;
			boolean isAchieved = false;
			for (int i = 0; i < transactions.length; i++) {
				sum += transactions[i];
				targetTransactions --;
				trans = i+1;
				if (sum >= target) {
					System.out.println("Target Achieved after " + trans+ " transactions");

					isAchieved = true;
					break;
				}
			}

			if (isAchieved) {
				
				System.out.println("Target Achieved");
			}
			else {
				System.out.println("Target not Achieved");
			}
			
		}
	}

}
