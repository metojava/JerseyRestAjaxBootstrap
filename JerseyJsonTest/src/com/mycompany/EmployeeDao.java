package com.mycompany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDao {

	List<Employee> employees = null;
	
	public List<Employee> getEmployees()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date bdate = null;
		Date bdate2 = null;
		Date bdate3 = null;
		Date bdate4 = null;
		
		try {
			bdate = sdf.parse("04/01/1976");
			bdate2 = sdf.parse("12/23/1978");
			bdate3 = sdf.parse("11/11/1985");
			bdate4 = sdf.parse("07/21/1986");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Mamuka", 9000.0d, 39, bdate));
		employees.add(new Employee(2, "Ramiro", 10000.0d, 32, bdate2));
		employees.add(new Employee(3, "Ananda", 15000.0d, 33, bdate3));
		employees.add(new Employee(4, "Sumit", 18000.0d, 35, bdate4));
		
		return employees;
	}
	
	
}
