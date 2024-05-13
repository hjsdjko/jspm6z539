package com.entity.view;

import com.entity.XinyongdengjipingdingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信用等级评定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
@TableName("xinyongdengjipingding")
public class XinyongdengjipingdingView  extends XinyongdengjipingdingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinyongdengjipingdingView(){
	}
 
 	public XinyongdengjipingdingView(XinyongdengjipingdingEntity xinyongdengjipingdingEntity){
 	try {
			BeanUtils.copyProperties(this, xinyongdengjipingdingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
