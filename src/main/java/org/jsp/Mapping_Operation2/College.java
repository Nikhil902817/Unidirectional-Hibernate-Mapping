package org.jsp.Mapping_Operation2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "College_Table")
public class College {
	@Id
	private int id;
	private String name;
	private String loc;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	List<Principal> principal;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Bus> bus;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Branche> branch;
	
	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String loc, List<Principal> principal, List<Bus> bus, List<Branche> branch) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.principal = principal;
		this.bus = bus;
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

	public List<Principal> getPrincipal() {
		return principal;
	}

	public void setPrincipal(List<Principal> principal) {
		this.principal = principal;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}

	public List<Branche> getBranch() {
		return branch;
	}

	public void setBranch(List<Branche> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", loc=" + loc + ", principal=" + principal + ", bus=" + bus
				+ ", branch=" + branch + "]";
	}
	
	
	

}
