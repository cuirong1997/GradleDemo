package mj.service;

import java.util.List;

import mj.domain.Comment;



public interface CommentService {
	List<Comment> getAll();
		
	Comment addcomment(int cid,String uid,String gid,String content);
	
	void deletecomment(String id);
	
	List<Comment> findComByGId(String gid);

}
