package repository.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.concretes.Invoice;
import repository.abstracts.InvoiceRepository;

public class InMemoryInvoiceRepository implements InvoiceRepository{

	List<Invoice> invoiceList = new ArrayList<Invoice>();
	
	
	public InMemoryInvoiceRepository(List<Invoice> invoiceList) {
		invoiceList.add(new Invoice(0, null, null, null, 0, null));
	}

	@Override
	public Invoice add(Invoice invoice) {

		return invoiceList.add(invoice) ? invoice : null;
	}

	@Override
	public List<Invoice> getAll() {
		
		return invoiceList.stream().collect(Collectors.toList());
	}

	@Override
	public Invoice getById(int id) {
		
		return invoiceList.get(id);
		
	}

	@Override
	public List<Invoice> getByGreaterThan(int price) {
		
		return invoiceList.stream()
				.filter(i->i.getPrice() > price)
				.collect(Collectors.toList());
	}

}
