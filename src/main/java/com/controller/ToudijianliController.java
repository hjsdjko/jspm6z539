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

import com.entity.ToudijianliEntity;
import com.entity.view.ToudijianliView;

import com.service.ToudijianliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 投递简历
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
@RestController
@RequestMapping("/toudijianli")
public class ToudijianliController {
    @Autowired
    private ToudijianliService toudijianliService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ToudijianliEntity toudijianli, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daxuesheng")) {
			toudijianli.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("qiye")) {
			toudijianli.setQiyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ToudijianliEntity> ew = new EntityWrapper<ToudijianliEntity>();
    	PageUtils page = toudijianliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toudijianli), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ToudijianliEntity toudijianli, 
		HttpServletRequest request){
        EntityWrapper<ToudijianliEntity> ew = new EntityWrapper<ToudijianliEntity>();
    	PageUtils page = toudijianliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toudijianli), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ToudijianliEntity toudijianli){
       	EntityWrapper<ToudijianliEntity> ew = new EntityWrapper<ToudijianliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( toudijianli, "toudijianli")); 
        return R.ok().put("data", toudijianliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ToudijianliEntity toudijianli){
        EntityWrapper< ToudijianliEntity> ew = new EntityWrapper< ToudijianliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( toudijianli, "toudijianli")); 
		ToudijianliView toudijianliView =  toudijianliService.selectView(ew);
		return R.ok("查询投递简历成功").put("data", toudijianliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ToudijianliEntity toudijianli = toudijianliService.selectById(id);
        return R.ok().put("data", toudijianli);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ToudijianliEntity toudijianli = toudijianliService.selectById(id);
        return R.ok().put("data", toudijianli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ToudijianliEntity toudijianli, HttpServletRequest request){
    	toudijianli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toudijianli);

        toudijianliService.insert(toudijianli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ToudijianliEntity toudijianli, HttpServletRequest request){
    	toudijianli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toudijianli);

        toudijianliService.insert(toudijianli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ToudijianliEntity toudijianli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(toudijianli);
        toudijianliService.updateById(toudijianli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        toudijianliService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ToudijianliEntity> wrapper = new EntityWrapper<ToudijianliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daxuesheng")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("qiye")) {
			wrapper.eq("qiyezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = toudijianliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
