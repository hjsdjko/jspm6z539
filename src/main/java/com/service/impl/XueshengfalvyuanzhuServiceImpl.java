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


import com.dao.XueshengfalvyuanzhuDao;
import com.entity.XueshengfalvyuanzhuEntity;
import com.service.XueshengfalvyuanzhuService;
import com.entity.vo.XueshengfalvyuanzhuVO;
import com.entity.view.XueshengfalvyuanzhuView;

@Service("xueshengfalvyuanzhuService")
public class XueshengfalvyuanzhuServiceImpl extends ServiceImpl<XueshengfalvyuanzhuDao, XueshengfalvyuanzhuEntity> implements XueshengfalvyuanzhuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengfalvyuanzhuEntity> page = this.selectPage(
                new Query<XueshengfalvyuanzhuEntity>(params).getPage(),
                new EntityWrapper<XueshengfalvyuanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengfalvyuanzhuEntity> wrapper) {
		  Page<XueshengfalvyuanzhuView> page =new Query<XueshengfalvyuanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengfalvyuanzhuVO> selectListVO(Wrapper<XueshengfalvyuanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengfalvyuanzhuVO selectVO(Wrapper<XueshengfalvyuanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengfalvyuanzhuView> selectListView(Wrapper<XueshengfalvyuanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengfalvyuanzhuView selectView(Wrapper<XueshengfalvyuanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
