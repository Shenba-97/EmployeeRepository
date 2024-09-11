package com.Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/Employee")
public class EmployeeController {
  @Autowired
  EmployeeService es;
  @PostMapping(value="/postEmployee")
  public String postThis(@RequestBody Employee e)  {
	  return es.postThis(e);
  
	  
  }
  @GetMapping(value="/getAllEmployee")
  public List<Employee> getAll() {
	  return es.getAll();
	  
  }
  @PostMapping(value="/postEmployees")
  public String post(@RequestBody List<Employee> e) {
	  return es.post(e);
  }

  @GetMapping("/getId/{e}")
		  
  		
  public Object getId(@PathVariable int e) {
	  return es.getId(e);
  }
  @GetMapping("/delId/{b}") 
  public String delId(@PathVariable int b) {
	  return es.delId(b);
  }
  @GetMapping("/max")
  public List<Employee> getMax() {
	  return es.getMax();
	  
  }
}

