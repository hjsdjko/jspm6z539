package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaxueshengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaxueshengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaxueshengView;


/**
 * 大学生
 *
 * @author 
 * @email 
 * @date 2021-05-07 22:41:42
 */
public interface DaxueshengService extends IService<DaxueshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaxueshengVO> selectListVO(Wrapper<DaxueshengEntity> wrapper);
   	
   	DaxueshengVO selectVO(@Param("ew") Wrapper<DaxueshengEntity> wrapper);
   	
   	List<DaxueshengView> selectListView(Wrapper<DaxueshengEntity> wrapper);
   	
   	DaxueshengView selectView(@Param("ew") Wrapper<DaxueshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaxueshengEntity> wrapper);
   	
}

