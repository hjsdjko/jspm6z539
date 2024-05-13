package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinyongdengjipingdingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinyongdengjipingdingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinyongdengjipingdingView;


/**
 * 信用等级评定
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface XinyongdengjipingdingService extends IService<XinyongdengjipingdingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinyongdengjipingdingVO> selectListVO(Wrapper<XinyongdengjipingdingEntity> wrapper);
   	
   	XinyongdengjipingdingVO selectVO(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
   	
   	List<XinyongdengjipingdingView> selectListView(Wrapper<XinyongdengjipingdingEntity> wrapper);
   	
   	XinyongdengjipingdingView selectView(@Param("ew") Wrapper<XinyongdengjipingdingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinyongdengjipingdingEntity> wrapper);
   	
}

