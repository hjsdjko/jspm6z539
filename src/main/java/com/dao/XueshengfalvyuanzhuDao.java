package com.dao;

import com.entity.XueshengfalvyuanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengfalvyuanzhuVO;
import com.entity.view.XueshengfalvyuanzhuView;


/**
 * 学生法律援助
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface XueshengfalvyuanzhuDao extends BaseMapper<XueshengfalvyuanzhuEntity> {
	
	List<XueshengfalvyuanzhuVO> selectListVO(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
	
	XueshengfalvyuanzhuVO selectVO(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
	
	List<XueshengfalvyuanzhuView> selectListView(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);

	List<XueshengfalvyuanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
	
	XueshengfalvyuanzhuView selectView(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
	
}
