package com.dao;

import com.entity.DiscussqiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiyeVO;
import com.entity.view.DiscussqiyeView;


/**
 * 企业评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface DiscussqiyeDao extends BaseMapper<DiscussqiyeEntity> {
	
	List<DiscussqiyeVO> selectListVO(@Param("ew") Wrapper<DiscussqiyeEntity> wrapper);
	
	DiscussqiyeVO selectVO(@Param("ew") Wrapper<DiscussqiyeEntity> wrapper);
	
	List<DiscussqiyeView> selectListView(@Param("ew") Wrapper<DiscussqiyeEntity> wrapper);

	List<DiscussqiyeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiyeEntity> wrapper);
	
	DiscussqiyeView selectView(@Param("ew") Wrapper<DiscussqiyeEntity> wrapper);
	
}
