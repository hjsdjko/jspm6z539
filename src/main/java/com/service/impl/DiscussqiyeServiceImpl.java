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


import com.dao.DiscussqiyeDao;
import com.entity.DiscussqiyeEntity;
import com.service.DiscussqiyeService;
import com.entity.vo.DiscussqiyeVO;
import com.entity.view.DiscussqiyeView;

@Service("discussqiyeService")
public class DiscussqiyeServiceImpl extends ServiceImpl<DiscussqiyeDao, DiscussqiyeEntity> implements DiscussqiyeService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiyeEntity> page = this.selectPage(
                new Query<DiscussqiyeEntity>(params).getPage(),
                new EntityWrapper<DiscussqiyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiyeEntity> wrapper) {
		  Page<DiscussqiyeView> page =new Query<DiscussqiyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiyeVO> selectListVO(Wrapper<DiscussqiyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiyeVO selectVO(Wrapper<DiscussqiyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiyeView> selectListView(Wrapper<DiscussqiyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiyeView selectView(Wrapper<DiscussqiyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
