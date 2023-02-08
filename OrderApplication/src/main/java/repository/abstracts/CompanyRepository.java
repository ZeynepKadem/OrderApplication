package repository.abstracts;

import java.util.List;

import entity.concretes.Company;

public interface CompanyRepository {

	List<Company> getAll();
	Company getById(int id);
	void addCompany(Company company);
	
}
