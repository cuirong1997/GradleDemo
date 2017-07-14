package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Comment;
import mj.mapper.CommentMapper;

import mj.service.CommentService;



@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return commentMapper.findAll();
	}

	@Override
	public Comment addcomment(int cid, String uid, String gid, String content) {
		// TODO Auto-generated method stub
		return commentMapper.addcomment(cid,uid, gid, content);
	}

	@Override
	public void deletecomment(String id) {
		// TODO Auto-generated method stub
		commentMapper.deletecomment(id);
	}

	@Override
	public List<Comment> findComByGId(String gid) {
		// TODO Auto-generated method stub
		return commentMapper.findComByGId(gid);
	}
	

}
