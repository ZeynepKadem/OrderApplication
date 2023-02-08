package repository.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.concretes.Company;
import repository.abstracts.CompanyRepository;

public class InMemoryCompanyRepository implements CompanyRepository {

	private  List<Company> companyList= new ArrayList<>();
	
	public InMemoryCompanyRepository(List<Company> companyList) {
		super();
		this.companyList = companyList;
	}

	@Override
	public List<Company> getAll() {
		
		return companyList.stream().collect(Collectors.toList());
	}

	@Override
	public Company getById(int id) {
		
		return companyList.get(id);
	}

	@Override
	public void addCompany(Company company) {
		companyList.add(company);
	}

}
