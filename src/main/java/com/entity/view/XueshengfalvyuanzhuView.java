package com.entity.view;

import com.entity.XueshengfalvyuanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生法律援助
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
@TableName("xueshengfalvyuanzhu")
public class XueshengfalvyuanzhuView  extends XueshengfalvyuanzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengfalvyuanzhuView(){
	}
 
 	public XueshengfalvyuanzhuView(XueshengfalvyuanzhuEntity xueshengfalvyuanzhuEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengfalvyuanzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
