package service.concretes;

import java.util.List;
import java.util.stream.Collectors;

import entity.concretes.Customer;
import repository.abstracts.CustomerRepository;
import service.abstracts.CustomerService;

public class CustomerManager implements CustomerService{

	private CustomerRepository customerRepository;
	
	public CustomerManager(CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}
	

	@Override
	public List<Customer> getAllCustomersContainsC() {
		
		return customerRepository.getAll()
				.stream()
				.filter(c-> c.getFirstName().contains("C") || c.getLastName().contains("C"))
				.collect(Collectors.toList());
	}

	@Override
	public List<Customer> getAll() {
		
		return customerRepository.getAll();
	}

	@Override
	public Customer getById(int id) {
		
		return customerRepository.getById(id);
	}

	@Override
	public Customer add(Customer customer) {
		
		return customerRepository.add(customer);
	}


	@Override
	public Customer getByFirstNameAndLastName(String firstName, String lastName) {
		if(firstName.isEmpty()&&lastName.isEmpty())
			return null;
		return customerRepository.getByFirstNameAndLastName(firstName,lastName);
	}


	@Override
	public void printAllCustomer(List<Customer> customers) {
		customers.forEach(System.out::println);
		
	}

}
