package com.dao;

import com.entity.XinyongdengjipingdingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinyongdengjipingdingVO;
import com.entity.view.XinyongdengjipingdingView;


/**
 * 信用等级评定
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface XinyongdengjipingdingDao extends BaseMapper<XinyongdengjipingdingEntity> {
	
	List<XinyongdengjipingdingVO> selectListVO(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
	
	XinyongdengjipingdingVO selectVO(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
	
	List<XinyongdengjipingdingView> selectListView(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);

	List<XinyongdengjipingdingView> selectListView(Pagination page,@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
	
	XinyongdengjipingdingView selectView(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
	
}
