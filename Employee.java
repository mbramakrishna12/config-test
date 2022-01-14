package com.spring.Employee.Module.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employeetab")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "edept")
	private String empDept;
	@Column(name = "esal")
	private Double empSal;
	@Column(name = "ehra")
	private Double empHra;
	@Column(name = "eta")
	private Double empTa;
	@Column(name = "email")
	private String empMail;
	@Column(name = "egen")
	private String empGen;

}
