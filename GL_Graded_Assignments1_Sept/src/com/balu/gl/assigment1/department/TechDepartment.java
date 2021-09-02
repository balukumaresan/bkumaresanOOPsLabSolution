package com.balu.gl.assigment1.department;

/**
 * Tech Department class
 * 
 * @author baluk
 *
 */
public class TechDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return " Tech Department ";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "core Java";
	}

}
