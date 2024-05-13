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


import com.dao.XinyongdengjipingdingDao;
import com.entity.XinyongdengjipingdingEntity;
import com.service.XinyongdengjipingdingService;
import com.entity.vo.XinyongdengjipingdingVO;
import com.entity.view.XinyongdengjipingdingView;

@Service("xinyongdengjipingdingService")
public class XinyongdengjipingdingServiceImpl extends ServiceImpl<XinyongdengjipingdingDao, XinyongdengjipingdingEntity> implements XinyongdengjipingdingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinyongdengjipingdingEntity> page = this.selectPage(
                new Query<XinyongdengjipingdingEntity>(params).getPage(),
                new EntityWrapper<XinyongdengjipingdingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinyongdengjipingdingEntity> wrapper) {
		  Page<XinyongdengjipingdingView> page =new Query<XinyongdengjipingdingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinyongdengjipingdingVO> selectListVO(Wrapper<XinyongdengjipingdingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinyongdengjipingdingVO selectVO(Wrapper<XinyongdengjipingdingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinyongdengjipingdingView> selectListView(Wrapper<XinyongdengjipingdingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinyongdengjipingdingView selectView(Wrapper<XinyongdengjipingdingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
