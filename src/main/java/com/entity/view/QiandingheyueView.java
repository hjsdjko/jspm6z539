package com.entity.view;

import com.entity.QiandingheyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签订合约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
@TableName("qiandingheyue")
public class QiandingheyueView  extends QiandingheyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiandingheyueView(){
	}
 
 	public QiandingheyueView(QiandingheyueEntity qiandingheyueEntity){
 	try {
			BeanUtils.copyProperties(this, qiandingheyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
