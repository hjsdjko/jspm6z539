package com.dao;

import com.entity.QiyefalvyuanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyefalvyuanzhuVO;
import com.entity.view.QiyefalvyuanzhuView;


/**
 * 企业法律援助
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface QiyefalvyuanzhuDao extends BaseMapper<QiyefalvyuanzhuEntity> {
	
	List<QiyefalvyuanzhuVO> selectListVO(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
	
	QiyefalvyuanzhuVO selectVO(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
	
	List<QiyefalvyuanzhuView> selectListView(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);

	List<QiyefalvyuanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
	
	QiyefalvyuanzhuView selectView(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
	
}
