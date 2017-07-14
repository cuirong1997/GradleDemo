package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Cart;
import mj.mapper.OrderMapper;
import mj.service.OrderService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")

public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getAll() {
		return orderMapper.findAll();
	}

}
