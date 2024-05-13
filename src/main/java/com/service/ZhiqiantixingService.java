package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiqiantixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiqiantixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiqiantixingView;


/**
 * 职前提醒
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public interface ZhiqiantixingService extends IService<ZhiqiantixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiqiantixingVO> selectListVO(Wrapper<ZhiqiantixingEntity> wrapper);
   	
   	ZhiqiantixingVO selectVO(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
   	
   	List<ZhiqiantixingView> selectListView(Wrapper<ZhiqiantixingEntity> wrapper);
   	
   	ZhiqiantixingView selectView(@Param("ew") Wrapper<ZhiqiantixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiqiantixingEntity> wrapper);
   	
}

