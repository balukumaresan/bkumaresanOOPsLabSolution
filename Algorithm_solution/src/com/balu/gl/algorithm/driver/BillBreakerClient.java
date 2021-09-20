package com.balu.gl.algorithm.driver;

import com.balu.algorithm.currency.BillBreaker;

/**
 * Bill breaker client app.
 * 
 * @author baluk
 *
 */
public class BillBreakerClient {

	public static void main(String[] args) {
		BillBreaker bp = new BillBreaker();
		bp.breakTheBill();
	}
}
