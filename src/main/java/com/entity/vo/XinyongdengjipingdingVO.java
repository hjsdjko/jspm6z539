package com.entity.vo;

import com.entity.XinyongdengjipingdingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 信用等级评定
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public class XinyongdengjipingdingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 企业等级
	 */
	
	private String qiyedengji;
		
	/**
	 * 评定理由
	 */
	
	private String pingdingliyou;
		
	/**
	 * 评定时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingdingshijian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：企业等级
	 */
	 
	public void setQiyedengji(String qiyedengji) {
		this.qiyedengji = qiyedengji;
	}
	
	/**
	 * 获取：企业等级
	 */
	public String getQiyedengji() {
		return qiyedengji;
	}
				
	
	/**
	 * 设置：评定理由
	 */
	 
	public void setPingdingliyou(String pingdingliyou) {
		this.pingdingliyou = pingdingliyou;
	}
	
	/**
	 * 获取：评定理由
	 */
	public String getPingdingliyou() {
		return pingdingliyou;
	}
				
	
	/**
	 * 设置：评定时间
	 */
	 
	public void setPingdingshijian(Date pingdingshijian) {
		this.pingdingshijian = pingdingshijian;
	}
	
	/**
	 * 获取：评定时间
	 */
	public Date getPingdingshijian() {
		return pingdingshijian;
	}
			
}
