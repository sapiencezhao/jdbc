package com.lh.dao;

import java.util.List;

import com.lh.model.Employee;
public class Test {
	
	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getInstance().selectEmployee();
		for(Employee emp:empList){
			System.out.println("----------------------------");
			System.out.print("姓名"+emp.getEmpName());
			System.out.print("性别"+emp.getEmpSex());
			System.out.print("年龄"+emp.getEmpAge());
			System.out.println("职务"+emp.getEmpDuty());
		}
	}

}
