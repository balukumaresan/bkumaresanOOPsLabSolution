package com.balu.gl.assigment1.department;

/**
 * Super class for all Departments.
 * 
 * @author baluk
 *
 */
public class SuperDepartment {

	public SuperDepartment() {
		System.out.print(" Welcome to");
	}

	/**
	 * Returns the Department Name
	 */
	public String departmentName() {
		return " Super Department ";
	}

	/**
	 * Returns the Today's work
	 */
	public String getTodaysWork() {
		return " No Work as of now";
	}

	/**
	 * 
	 * Returns work Deadline
	 */
	public String getWorkDeadline() {
		return " Nil ";
	}

	/**
	 * 
	 * Returns Holiday detail
	 */
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
