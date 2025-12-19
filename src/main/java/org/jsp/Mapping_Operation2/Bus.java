package org.jsp.Mapping_Operation2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bus_Table")
public class Bus {
	@Id
	private int id;
	private int number;
	private String brand;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Driver driver;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, int number, String brand, Driver driver) {
		super();
		this.id = id;
		this.number = number;
		this.brand = brand;
		this.driver = driver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", number=" + number + ", brand=" + brand + ", driver=" + driver + "]";
	}
	
	

}
