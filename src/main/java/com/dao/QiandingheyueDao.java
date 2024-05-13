package com.dao;

import com.entity.QiandingheyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandingheyueVO;
import com.entity.view.QiandingheyueView;


/**
 * 签订合约
 * 
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface QiandingheyueDao extends BaseMapper<QiandingheyueEntity> {
	
	List<QiandingheyueVO> selectListVO(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
	
	QiandingheyueVO selectVO(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
	
	List<QiandingheyueView> selectListView(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);

	List<QiandingheyueView> selectListView(Pagination page,@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
	
	QiandingheyueView selectView(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
	
}
