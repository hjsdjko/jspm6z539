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


import com.dao.DaxueshengDao;
import com.entity.DaxueshengEntity;
import com.service.DaxueshengService;
import com.entity.vo.DaxueshengVO;
import com.entity.view.DaxueshengView;

@Service("daxueshengService")
public class DaxueshengServiceImpl extends ServiceImpl<DaxueshengDao, DaxueshengEntity> implements DaxueshengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaxueshengEntity> page = this.selectPage(
                new Query<DaxueshengEntity>(params).getPage(),
                new EntityWrapper<DaxueshengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaxueshengEntity> wrapper) {
		  Page<DaxueshengView> page =new Query<DaxueshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaxueshengVO> selectListVO(Wrapper<DaxueshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaxueshengVO selectVO(Wrapper<DaxueshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaxueshengView> selectListView(Wrapper<DaxueshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaxueshengView selectView(Wrapper<DaxueshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
