package mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.Cart;
import mj.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/order")
	 public String main(Model model){
		// 获得所有物品
		List<Cart> cart_list =orderService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到shop页面
		return "order";
	}

}
