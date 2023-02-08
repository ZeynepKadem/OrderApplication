package service.concretes;

import java.util.List;

import entity.concretes.Order;
import repository.abstracts.OrderRepository;
import service.abstracts.OrderService;

public class OrderManager implements OrderService {

	private OrderRepository orderRepository;
	
	
	public OrderManager(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Order> getAll() {
		
		return orderRepository.getAll();
	}

	@Override
	public Order getById(int id) {
		
		return orderRepository.getById(id);
	}

	@Override
	public void add(Order order) {
		
		 orderRepository.add(order);
	}

}
