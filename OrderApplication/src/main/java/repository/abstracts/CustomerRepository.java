package repository.abstracts;

import java.util.List;

import entity.concretes.Customer;

public interface CustomerRepository {

	List<Customer> getAll();
	
	List<Customer> getAllCustomersContainsC();
	Customer getById(int id);
	Customer getByFirstNameAndLastName(String firstName, String lastName);

	Customer add(Customer customer);
	
}
