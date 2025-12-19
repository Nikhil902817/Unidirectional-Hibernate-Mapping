package org.jsp.Mapping_Operation2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "University_Table")
public class University {
	@Id
	private int id;
	private String name;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<College> college;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int id, String name, String city, List<College> college) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", city=" + city + ", college=" + college + "]";
	}
	

}
