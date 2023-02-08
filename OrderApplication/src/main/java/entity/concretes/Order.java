package entity.concretes;

import java.time.LocalDate;


public class Order {

	private int id;
	private LocalDate creationDate;
	
	private Customer customer;

	public Order(int id, LocalDate creationDate, Customer customer) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
