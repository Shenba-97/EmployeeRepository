package com.Crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao ed;
    public String postThis(Employee e) {
    	return ed.postThis(e);
    }
    public List<Employee> getAll() {
    	return ed.getAll();
    }
    public String post(List<Employee> e) {
    	return ed.post(e);
    }
   
   public Object getId(int e) {
	   return ed.getId(e);
   }
   public String delId(int b) {
	   return ed.delId(b);
   }
   public List<Employee> getMax() {
	   List<Employee> z = ed.getMax();
	   Employee v = z.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
	   ArrayList<Employee> al = new ArrayList<>();
	   al.add(v);
	   return al;
	   
   }
    
    
    
    
    
    
}
