package repository.abstracts;
import java.util.List;

import entity.concretes.Invoice;

public interface InvoiceRepository {

	Invoice add(Invoice invoice);
	List<Invoice> getAll();
	Invoice getById(int id);
	List<Invoice> getByGreaterThan(int price);
	
}
