package com.balu.gl.assigment1.test;

import com.balu.gl.assigment1.department.AdminDepartment;
import com.balu.gl.assigment1.department.HRDepartment;
import com.balu.gl.assigment1.department.SuperDepartment;
import com.balu.gl.assigment1.department.TechDepartment;
import static java.lang.System.out;

/**
 * Creates instances of required Department and call required methods to produce expected reult.
 * @author baluk
 *
 */
public class DepartmentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperDepartment adminDept = new AdminDepartment();
		out.println(adminDept.departmentName());
		out.println(adminDept.getTodaysWork());
		out.println(adminDept.getWorkDeadline());
		out.println(adminDept.isTodayAHoliday());
		out.println("");

		HRDepartment hrDept = new HRDepartment();
		out.println(hrDept.departmentName());
		out.println(hrDept.doActivity());
		out.println(hrDept.getTodaysWork());
		out.println(hrDept.getWorkDeadline());
		out.println(hrDept.isTodayAHoliday());
		out.println("");

		TechDepartment techDept = new TechDepartment();
		out.println(techDept.departmentName());
		out.println(techDept.getTodaysWork());
		out.println(techDept.getWorkDeadline());
		out.println(" " + techDept.getTechStackInformation());
		out.println(techDept.isTodayAHoliday());
	}

}
