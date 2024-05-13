package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 求职简历
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 22:41:42
 */
@TableName("qiuzhijianli")
public class QiuzhijianliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuzhijianliEntity() {
		
	}
	
	public QiuzhijianliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 求职岗位
	 */
					
	private String qiuzhigangwei;
	
	/**
	 * 工作地点
	 */
					
	private String gongzuodidian;
	
	/**
	 * 期望薪资
	 */
					
	private Integer qiwangxinzi;
	
	/**
	 * 教育背景
	 */
					
	private String jiaoyubeijing;
	
	/**
	 * 获奖证书
	 */
					
	private String huojiangzhengshu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：求职岗位
	 */
	public void setQiuzhigangwei(String qiuzhigangwei) {
		this.qiuzhigangwei = qiuzhigangwei;
	}
	/**
	 * 获取：求职岗位
	 */
	public String getQiuzhigangwei() {
		return qiuzhigangwei;
	}
	/**
	 * 设置：工作地点
	 */
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
	/**
	 * 设置：期望薪资
	 */
	public void setQiwangxinzi(Integer qiwangxinzi) {
		this.qiwangxinzi = qiwangxinzi;
	}
	/**
	 * 获取：期望薪资
	 */
	public Integer getQiwangxinzi() {
		return qiwangxinzi;
	}
	/**
	 * 设置：教育背景
	 */
	public void setJiaoyubeijing(String jiaoyubeijing) {
		this.jiaoyubeijing = jiaoyubeijing;
	}
	/**
	 * 获取：教育背景
	 */
	public String getJiaoyubeijing() {
		return jiaoyubeijing;
	}
	/**
	 * 设置：获奖证书
	 */
	public void setHuojiangzhengshu(String huojiangzhengshu) {
		this.huojiangzhengshu = huojiangzhengshu;
	}
	/**
	 * 获取：获奖证书
	 */
	public String getHuojiangzhengshu() {
		return huojiangzhengshu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
