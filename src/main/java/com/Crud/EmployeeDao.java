package com.Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String postThis(Employee e) {
		er.save(e);
		return "Posted Successfully in second commit";
	}
	public List<Employee> getAll() {
		return er.findAll();
		
		
	}
	public String post(List<Employee> e) {
		er.saveAll(e);
		return "posted successfull";
	}
	public Object getId(int e) {
		return er.findById(e).get();
		
	}
	public String delId(int b) {
		er.deleteById(b);
		return "delete";
	}
	public List<Employee> getMax() {
		return er.findAll();
	}
	

}
