package entity.abstracts;

import java.time.LocalDate;

public abstract class BaseEntity {

	private int id;
	private LocalDate creationDate;
	
	public BaseEntity(int id, LocalDate creationDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
}
