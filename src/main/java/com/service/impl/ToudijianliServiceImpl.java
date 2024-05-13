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


import com.dao.ToudijianliDao;
import com.entity.ToudijianliEntity;
import com.service.ToudijianliService;
import com.entity.vo.ToudijianliVO;
import com.entity.view.ToudijianliView;

@Service("toudijianliService")
public class ToudijianliServiceImpl extends ServiceImpl<ToudijianliDao, ToudijianliEntity> implements ToudijianliService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToudijianliEntity> page = this.selectPage(
                new Query<ToudijianliEntity>(params).getPage(),
                new EntityWrapper<ToudijianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToudijianliEntity> wrapper) {
		  Page<ToudijianliView> page =new Query<ToudijianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ToudijianliVO> selectListVO(Wrapper<ToudijianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToudijianliVO selectVO(Wrapper<ToudijianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToudijianliView> selectListView(Wrapper<ToudijianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToudijianliView selectView(Wrapper<ToudijianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
