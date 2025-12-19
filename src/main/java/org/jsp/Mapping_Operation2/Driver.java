package org.jsp.Mapping_Operation2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Table")
public class Driver {
	@Id
	private int id;
	private String name;
	private long phone;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	

}
