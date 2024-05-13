package com.dao;

import com.entity.ZhiqiantixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiqiantixingVO;
import com.entity.view.ZhiqiantixingView;


/**
 * 职前提醒
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface ZhiqiantixingDao extends BaseMapper<ZhiqiantixingEntity> {
	
	List<ZhiqiantixingVO> selectListVO(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
	
	ZhiqiantixingVO selectVO(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
	
	List<ZhiqiantixingView> selectListView(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);

	List<ZhiqiantixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
	
	ZhiqiantixingView selectView(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
	
}
