package mj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.User;
import mj.mapper.EnrollMapper;
import mj.service.EnrollService;



@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("enrollService")
public class EnrollServiceImpl implements EnrollService {

	@Autowired
	private EnrollMapper erollMapper;

	@Override
	public User enroll(String id, String name, String pwd, String sex, String age, String tel, String que, String anw) {
		// TODO Auto-generated method stub
		return erollMapper.insertuser( id,name,pwd,sex,age,tel,que,anw);
	}
	
	

}
