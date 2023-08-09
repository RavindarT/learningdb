package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Integer> {

	List<Employees> findAllByEmpid(int i);

}
