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


import com.dao.QiandingheyueDao;
import com.entity.QiandingheyueEntity;
import com.service.QiandingheyueService;
import com.entity.vo.QiandingheyueVO;
import com.entity.view.QiandingheyueView;

@Service("qiandingheyueService")
public class QiandingheyueServiceImpl extends ServiceImpl<QiandingheyueDao, QiandingheyueEntity> implements QiandingheyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandingheyueEntity> page = this.selectPage(
                new Query<QiandingheyueEntity>(params).getPage(),
                new EntityWrapper<QiandingheyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandingheyueEntity> wrapper) {
		  Page<QiandingheyueView> page =new Query<QiandingheyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandingheyueVO> selectListVO(Wrapper<QiandingheyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandingheyueVO selectVO(Wrapper<QiandingheyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandingheyueView> selectListView(Wrapper<QiandingheyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandingheyueView selectView(Wrapper<QiandingheyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
