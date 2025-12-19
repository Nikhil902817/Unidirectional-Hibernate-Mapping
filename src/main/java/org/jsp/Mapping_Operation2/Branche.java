package org.jsp.Mapping_Operation2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Branch_table")
public class Branche {
	@Id
	private int id;
	private String name;
	private int code;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private BranchHead branchHead; 
	
	
	public Branche() {
		// TODO Auto-generated constructor stub
	}


	public Branche(int id, String name, int code, BranchHead branchHead) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.branchHead = branchHead;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public BranchHead getBranchHead() {
		return branchHead;
	}


	public void setBranchHead(BranchHead branchHead) {
		this.branchHead = branchHead;
	}


	@Override
	public String toString() {
		return "Branche [id=" + id + ", name=" + name + ", code=" + code + ", branchHead=" + branchHead + "]";
	}
	 
	
	
	

}
