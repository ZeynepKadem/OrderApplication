package repository.abstracts;

import java.util.List;

import entity.concretes.Order;

public interface OrderRepository {

	List<Order> getAll();
	Order getById(int id);
	void add(Order order);
	
}
