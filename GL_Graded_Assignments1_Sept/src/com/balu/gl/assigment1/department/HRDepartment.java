package com.balu.gl.assigment1.department;

/**
 * 
 * @author baluk
 *
 */
public class HRDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return " HR Department ";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	@Override
		public String getWorkDeadline() {
			return "Complete by EOD ";
	}
	
	public String doActivity() {
		return "team Lunch";
}

}
