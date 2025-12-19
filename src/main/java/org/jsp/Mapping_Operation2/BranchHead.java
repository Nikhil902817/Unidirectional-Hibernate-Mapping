package org.jsp.Mapping_Operation2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BranchHead_Table")
public class BranchHead {
	@Id
	private int id;
	private String name;
	private String loc;
	
	 @OneToMany(mappedBy = "branchHead", cascade = CascadeType.ALL)
	private List<Branche> branch;
	
	
	public List<Branche> getBranch() {
		return branch;
	}

	public void setBranch(List<Branche> branch) {
		this.branch = branch;
	}

	public BranchHead() {
		// TODO Auto-generated constructor stub
	}

	
	public BranchHead(int id, String name, String loc, List<Branche> branch) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.branch = branch;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "BranchHead [id=" + id + ", name=" + name + ", loc=" + loc + ", branch=" + branch + "]";
	}

	
	
	

}
