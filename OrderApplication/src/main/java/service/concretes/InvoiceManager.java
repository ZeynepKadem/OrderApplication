package service.concretes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import entity.concretes.Customer;
import entity.concretes.Invoice;
import repository.abstracts.InvoiceRepository;
import service.abstracts.InvoiceService;

public class InvoiceManager implements InvoiceService{

	
	private InvoiceRepository invoiceRepository;
	
	
	public InvoiceManager(InvoiceRepository invoiceRepository) {
		super();
		this.invoiceRepository = invoiceRepository;
	}


	@Override
	public int getTotalInvoicesByCustomerRegistrationMonth(LocalDate date) {
		return invoiceRepository.getAll()
				.stream()
				.filter(c -> c.getCreationDate().getMonthValue() == date.getMonthValue())
				.mapToInt(Invoice :: getPrice).sum();
		
	}


	@Override
	public List<Invoice> getByPriceOfInvoicesOver(int price) {
		return invoiceRepository
				.getAll()
				.stream().filter(i->i.getPrice()>price)
				.collect(Collectors.toList());
	}


	@Override
	public List<Invoice> getByPriceOfInvoicesUnder(int price) {
		return invoiceRepository
				.getAll()
				.stream().filter(i->i.getPrice()<price)
				.collect(Collectors.toList());
		
	}


	@Override
	public OptionalDouble getAverageOfInvoicesOverPrice(float price) {
		return invoiceRepository.getAll().stream()
				.filter(i->i.getPrice()> price).mapToDouble(Invoice::getPrice).average();
	}


	@Override
	public List<Customer> getCustomerListByInvoiceTotalUnderPrice(int price) {
		List<Customer> customers = new ArrayList<Customer>();
		List<Invoice> invoiceList = invoiceRepository.getAll();
		for(Invoice invoice :invoiceList) {
			if(invoice.getPrice()<price) {
				customers.add(invoice.getCustomer());
			}
		}
		return customers;
	}

}
