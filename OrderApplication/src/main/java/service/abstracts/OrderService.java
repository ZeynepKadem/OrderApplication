package service.abstracts;

import java.util.List;

import entity.concretes.Order;

public interface OrderService{

	List<Order> getAll();
	Order getById(int id);
	void add(Order order);
}
