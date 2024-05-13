package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengfalvyuanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengfalvyuanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengfalvyuanzhuView;


/**
 * 学生法律援助
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface XueshengfalvyuanzhuService extends IService<XueshengfalvyuanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengfalvyuanzhuVO> selectListVO(Wrapper<XueshengfalvyuanzhuEntity> wrapper);
   	
   	XueshengfalvyuanzhuVO selectVO(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
   	
   	List<XueshengfalvyuanzhuView> selectListView(Wrapper<XueshengfalvyuanzhuEntity> wrapper);
   	
   	XueshengfalvyuanzhuView selectView(@Param("ew") Wrapper<XueshengfalvyuanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengfalvyuanzhuEntity> wrapper);
   	
}

