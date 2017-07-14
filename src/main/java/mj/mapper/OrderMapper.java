package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import mj.domain.Cart;



public interface OrderMapper {
	@Select("select * from tb_cart")
	List<Cart> findAll();
}
