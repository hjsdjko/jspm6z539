package com.dao;

import com.entity.DaxueshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaxueshengVO;
import com.entity.view.DaxueshengView;


/**
 * 大学生
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:42
 */
public interface DaxueshengDao extends BaseMapper<DaxueshengEntity> {
	
	List<DaxueshengVO> selectListVO(@Param("ew") Wrapper<DaxueshengEntity> wrapper);
	
	DaxueshengVO selectVO(@Param("ew") Wrapper<DaxueshengEntity> wrapper);
	
	List<DaxueshengView> selectListView(@Param("ew") Wrapper<DaxueshengEntity> wrapper);

	List<DaxueshengView> selectListView(Pagination page,@Param("ew") Wrapper<DaxueshengEntity> wrapper);
	
	DaxueshengView selectView(@Param("ew") Wrapper<DaxueshengEntity> wrapper);
	
}
