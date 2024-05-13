package com.entity.view;

import com.entity.DaxueshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 大学生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:42
 */
@TableName("daxuesheng")
public class DaxueshengView  extends DaxueshengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaxueshengView(){
	}
 
 	public DaxueshengView(DaxueshengEntity daxueshengEntity){
 	try {
			BeanUtils.copyProperties(this, daxueshengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
