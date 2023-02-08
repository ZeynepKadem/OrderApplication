package entity.concretes;

public class Company {
	private int id;
	private String name;
	private String sectorName;
	
	
	public Company(int id, String name, String sectorName) {
		super();
		this.id = id;
		this.name = name;
		this.sectorName = sectorName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSectorName() {
		return sectorName;
	}


	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

}
