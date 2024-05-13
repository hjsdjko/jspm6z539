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


import com.dao.ZhiqiantixingDao;
import com.entity.ZhiqiantixingEntity;
import com.service.ZhiqiantixingService;
import com.entity.vo.ZhiqiantixingVO;
import com.entity.view.ZhiqiantixingView;

@Service("zhiqiantixingService")
public class ZhiqiantixingServiceImpl extends ServiceImpl<ZhiqiantixingDao, ZhiqiantixingEntity> implements ZhiqiantixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiqiantixingEntity> page = this.selectPage(
                new Query<ZhiqiantixingEntity>(params).getPage(),
                new EntityWrapper<ZhiqiantixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiqiantixingEntity> wrapper) {
		  Page<ZhiqiantixingView> page =new Query<ZhiqiantixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiqiantixingVO> selectListVO(Wrapper<ZhiqiantixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiqiantixingVO selectVO(Wrapper<ZhiqiantixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiqiantixingView> selectListView(Wrapper<ZhiqiantixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiqiantixingView selectView(Wrapper<ZhiqiantixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
