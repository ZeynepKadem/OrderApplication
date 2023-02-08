package entity.concretes;

import java.time.LocalDate;
import java.util.List;

import entity.abstracts.BaseEntity;

public class Invoice extends BaseEntity {

	private Customer customer;
	private Company company;
	private int price;
	private List<Product> products;

	public Invoice(int id, LocalDate creationDate, Customer customer, Company company, int price,
			List<Product> products) {
		super(id, creationDate);
		this.customer = customer;
		this.company = company;
		this.price = price;
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
