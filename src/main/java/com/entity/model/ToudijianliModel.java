package com.entity.model;

import com.entity.ToudijianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 投递简历
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-07 22:41:43
 */
public class ToudijianliModel  implements Serializable {
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
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 企业账号
	 */
	
	private String qiyezhanghao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 求职岗位
	 */
	
	private String qiuzhigangwei;
		
	/**
	 * 期望薪资
	 */
	
	private String qiwangxinzi;
		
	/**
	 * 教育背景
	 */
	
	private String jiaoyubeijing;
		
	/**
	 * 获奖证书
	 */
	
	private String huojiangzhengshu;
		
	/**
	 * 毕业学校
	 */
	
	private String biyexuexiao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
	 * 设置：企业账号
	 */
	 
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
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
	 * 设置：期望薪资
	 */
	 
	public void setQiwangxinzi(String qiwangxinzi) {
		this.qiwangxinzi = qiwangxinzi;
	}
	
	/**
	 * 获取：期望薪资
	 */
	public String getQiwangxinzi() {
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
	 * 设置：毕业学校
	 */
	 
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
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
