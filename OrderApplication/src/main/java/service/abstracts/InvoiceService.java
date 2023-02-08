package service.abstracts;

import java.time.LocalDate;
import java.util.List;
import java.util.OptionalDouble;

import entity.concretes.Customer;
import entity.concretes.Invoice;


public interface InvoiceService {

	int getTotalInvoicesByCustomerRegistrationMonth(LocalDate date);
	List<Invoice> getByPriceOfInvoicesOver(int price);
	List<Invoice> getByPriceOfInvoicesUnder(int price);
	OptionalDouble getAverageOfInvoicesOverPrice(float price);
	List<Customer> getCustomerListByInvoiceTotalUnderPrice(int price);
}
