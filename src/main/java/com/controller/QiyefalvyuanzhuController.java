package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QiyefalvyuanzhuEntity;
import com.entity.view.QiyefalvyuanzhuView;

import com.service.QiyefalvyuanzhuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 企业法律援助
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
@RestController
@RequestMapping("/qiyefalvyuanzhu")
public class QiyefalvyuanzhuController {
    @Autowired
    private QiyefalvyuanzhuService qiyefalvyuanzhuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiyefalvyuanzhuEntity qiyefalvyuanzhu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qiye")) {
			qiyefalvyuanzhu.setQiyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiyefalvyuanzhuEntity> ew = new EntityWrapper<QiyefalvyuanzhuEntity>();
    	PageUtils page = qiyefalvyuanzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyefalvyuanzhu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiyefalvyuanzhuEntity qiyefalvyuanzhu, 
		HttpServletRequest request){
        EntityWrapper<QiyefalvyuanzhuEntity> ew = new EntityWrapper<QiyefalvyuanzhuEntity>();
    	PageUtils page = qiyefalvyuanzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyefalvyuanzhu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiyefalvyuanzhuEntity qiyefalvyuanzhu){
       	EntityWrapper<QiyefalvyuanzhuEntity> ew = new EntityWrapper<QiyefalvyuanzhuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiyefalvyuanzhu, "qiyefalvyuanzhu")); 
        return R.ok().put("data", qiyefalvyuanzhuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiyefalvyuanzhuEntity qiyefalvyuanzhu){
        EntityWrapper< QiyefalvyuanzhuEntity> ew = new EntityWrapper< QiyefalvyuanzhuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiyefalvyuanzhu, "qiyefalvyuanzhu")); 
		QiyefalvyuanzhuView qiyefalvyuanzhuView =  qiyefalvyuanzhuService.selectView(ew);
		return R.ok("查询企业法律援助成功").put("data", qiyefalvyuanzhuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiyefalvyuanzhuEntity qiyefalvyuanzhu = qiyefalvyuanzhuService.selectById(id);
        return R.ok().put("data", qiyefalvyuanzhu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiyefalvyuanzhuEntity qiyefalvyuanzhu = qiyefalvyuanzhuService.selectById(id);
        return R.ok().put("data", qiyefalvyuanzhu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiyefalvyuanzhuEntity qiyefalvyuanzhu, HttpServletRequest request){
    	qiyefalvyuanzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyefalvyuanzhu);

        qiyefalvyuanzhuService.insert(qiyefalvyuanzhu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiyefalvyuanzhuEntity qiyefalvyuanzhu, HttpServletRequest request){
    	qiyefalvyuanzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyefalvyuanzhu);

        qiyefalvyuanzhuService.insert(qiyefalvyuanzhu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QiyefalvyuanzhuEntity qiyefalvyuanzhu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiyefalvyuanzhu);
        qiyefalvyuanzhuService.updateById(qiyefalvyuanzhu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiyefalvyuanzhuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QiyefalvyuanzhuEntity> wrapper = new EntityWrapper<QiyefalvyuanzhuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qiye")) {
			wrapper.eq("qiyezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = qiyefalvyuanzhuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
