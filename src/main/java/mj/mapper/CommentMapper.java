package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Comment;


public interface CommentMapper {
	
	@Select("select * from tb_comment")
	List<Comment> findAll();
	
	@Select("insert into tb_comment values(#{cid},#{uid},#{gid},#{content})")
	Comment addcomment(@Param("cid") int cid,@Param("uid") String uid,@Param("gid")String gid,@Param("content") String content);
	
	@Delete("delete from tb_comment where user_id=#{id}")
	void deletecomment(String id);
	
	@Select("select * from tb_comment where good_id=#{gid}")
	List<Comment> findComByGId(@Param("gid") String gid);
}
