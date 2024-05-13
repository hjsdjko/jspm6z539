package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandingheyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandingheyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandingheyueView;


/**
 * 签订合约
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface QiandingheyueService extends IService<QiandingheyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandingheyueVO> selectListVO(Wrapper<QiandingheyueEntity> wrapper);
   	
   	QiandingheyueVO selectVO(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
   	
   	List<QiandingheyueView> selectListView(Wrapper<QiandingheyueEntity> wrapper);
   	
   	QiandingheyueView selectView(@Param("ew") Wrapper<QiandingheyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandingheyueEntity> wrapper);
   	
}

