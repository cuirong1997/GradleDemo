package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mj.domain.Good;
import mj.service.GoodService;

/**
 * 处理物品请求控制器
 * */
@Controller
public class GoodController {
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;
	
	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/index")
	 public String main(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "index";
	}
	
	
	@RequestMapping(value="/shop")
	 public String main2(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		return "shop";
	}
	
	
	@RequestMapping(value="/add")
	public ModelAndView addbook(ModelAndView mv,String id,
			String name,String price,String remark,String image,int subjectid){
		Good addgood=goodService.addgood(id,name,price,remark,image,subjectid);
		mv.setViewName("msuccess");
		return mv;
	
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updatebook(ModelAndView mv,String id,
			String name,String price,String remark,String image,int subjectid){
		Good updategood=goodService.updategood(id,name,price,remark,image,subjectid);
		mv.setViewName("msuccess");
		return mv;
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView deletegood(ModelAndView mv,String id){
		//String[] idArray=ids.split(",");
		//for(String id : idArray){
			//goodService.deletegood(id);
		//}
		goodService.deletegood(id);
		mv.setViewName("msuccess");
		return mv;
	}
	
	@RequestMapping(value="/category")
	public String category(HttpServletRequest request,Model model){
		String sid=request.getParameter("sid");
		System.out.print("第一句");
		List<Good> good_list=goodService.selectSubjectBySId(Integer.parseInt(sid));
		System.out.print("第二句");
		model.addAttribute("good_list",good_list);
		System.out.print("第三句");
		return "category";
	}
	
	@RequestMapping(value="/item")
	public String item(HttpServletRequest request,Model model,String id){
			//String id=request.getParameter("id");
		Good item1=goodService.selectById(id);
		model.addAttribute("item1",item1 );
		return "item";
		}
	
}
