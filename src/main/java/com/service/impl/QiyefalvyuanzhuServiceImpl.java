package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiyefalvyuanzhuDao;
import com.entity.QiyefalvyuanzhuEntity;
import com.service.QiyefalvyuanzhuService;
import com.entity.vo.QiyefalvyuanzhuVO;
import com.entity.view.QiyefalvyuanzhuView;

@Service("qiyefalvyuanzhuService")
public class QiyefalvyuanzhuServiceImpl extends ServiceImpl<QiyefalvyuanzhuDao, QiyefalvyuanzhuEntity> implements QiyefalvyuanzhuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyefalvyuanzhuEntity> page = this.selectPage(
                new Query<QiyefalvyuanzhuEntity>(params).getPage(),
                new EntityWrapper<QiyefalvyuanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyefalvyuanzhuEntity> wrapper) {
		  Page<QiyefalvyuanzhuView> page =new Query<QiyefalvyuanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyefalvyuanzhuVO> selectListVO(Wrapper<QiyefalvyuanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyefalvyuanzhuVO selectVO(Wrapper<QiyefalvyuanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyefalvyuanzhuView> selectListView(Wrapper<QiyefalvyuanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyefalvyuanzhuView selectView(Wrapper<QiyefalvyuanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
