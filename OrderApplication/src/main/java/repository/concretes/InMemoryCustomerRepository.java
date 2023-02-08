package repository.concretes;

import java.time.LocalDate;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import entity.concretes.Customer;
import repository.abstracts.CustomerRepository;

public class InMemoryCustomerRepository implements CustomerRepository{

	
	List<Customer> customerList = new ArrayList<>();	
	
	public InMemoryCustomerRepository(List<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public InMemoryCustomerRepository() {
		customerList.add(new Customer(1, "Zeynep", "Kadem", "zeynep@gmail.com", "0555",LocalDate.of(2023, Month.JUNE, 07)));
		
	}

	@Override
	public List<Customer> getAll() {
		
		return customerList;
	}

	@Override
	public Customer add(Customer customer) {
		
		return customerList.add(customer) ? customer : null;
	}

	@Override
	public List<Customer> getAllCustomersContainsC() {
		
		return customerList.stream().filter(c-> c.getFirstName().contains("C") || c.getLastName().contains("C"))
				.collect(Collectors.toList());
	}

	@Override
	public Customer getById(int id) {
		
		return customerList.get(id);
	}

	@Override
	public Customer getByFirstNameAndLastName(String firstName, String lastName) {
		
		return getByFirstNameAndLastName(firstName, lastName);
	}

}
