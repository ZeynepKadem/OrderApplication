package repository.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.concretes.Order;
import repository.abstracts.OrderRepository;

public class InMemoryOrderRepository implements OrderRepository {

	private final List<Order> orderList = new ArrayList<Order>();
	
	
	@Override
	public List<Order> getAll() {
		
		return orderList.stream().collect(Collectors.toList());
	}

	@Override
	public Order getById(int id) {
		
		return orderList.get(id);
	}

	@Override
	public void add(Order order) {
		
		 orderList.add(order);
	}

}
