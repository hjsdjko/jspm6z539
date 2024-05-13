package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyefalvyuanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyefalvyuanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyefalvyuanzhuView;


/**
 * 企业法律援助
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface QiyefalvyuanzhuService extends IService<QiyefalvyuanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyefalvyuanzhuVO> selectListVO(Wrapper<QiyefalvyuanzhuEntity> wrapper);
   	
   	QiyefalvyuanzhuVO selectVO(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
   	
   	List<QiyefalvyuanzhuView> selectListView(Wrapper<QiyefalvyuanzhuEntity> wrapper);
   	
   	QiyefalvyuanzhuView selectView(@Param("ew") Wrapper<QiyefalvyuanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyefalvyuanzhuEntity> wrapper);
   	
}

