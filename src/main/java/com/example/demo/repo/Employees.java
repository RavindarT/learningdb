package com.example.demo.repo;




import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Entity 
@Table(name="employees")
public class Employees implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "empid", nullable = false, updatable = false)
	private int empid;
	
	@Column(name = "empname", nullable = false, updatable = false)
	private String empname;
	
	public Employees(  ) {
       
    }
	
	public Employees( int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	
}
