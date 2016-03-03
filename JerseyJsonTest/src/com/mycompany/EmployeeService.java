package com.mycompany;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/employeeService")
public class EmployeeService {

	EmployeeDao empdao = new EmployeeDao();
	
	@GET
	@Path("/getAll")
	@Produces("application/xml")
	public List<Employee> getEmployees()
	{
		return empdao.getEmployees();
	}
	
	@GET
	@Path("/getAllJson")
	@Produces("application/json")
	public List<Employee> getEmployeesJson()
	{
		return empdao.getEmployees();
	}
}
