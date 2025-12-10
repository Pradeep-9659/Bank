package com.bank.spring;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String name;
	    private String number;
	    private String headOffice;

	    @OneToMany(mappedBy = "bank")
	    private List<Branch> branches;

	    // Getters and Setters
	    public Long getId(){ 
	        return id; 
	    }
	    public void setId(Long id) { 
	    	this.id = id; 
	    }

	    public String getName() { 
	    	return name; 
	    }
	    public void setName(String name) { 
	    	this.name = name; 
	    }

	    public String getNumber() { 
	    	return number; 
	    }
	    public void setNumber(String number) {
	    	this.number = number; 
	    }

	    public String getHeadOffice() {
	    	return headOffice; 
	    }
	    public void setHeadOffice(String headOffice) { 
	    	this.headOffice = headOffice;
	    }

	    public List<Branch> getBranches() {
	    	return branches; 
	    }
	    public void setBranches(List<Branch> branches) { 
	    	this.branches = branches;
	    }
	

}
