package com.entity.model;

import com.entity.LvyoujingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 旅游景点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public class LvyoujingdianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点分类
	 */
	
	private String jingdianfenlei;
		
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 景点星级
	 */
	
	private String jingdianxingji;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 门票价格
	 */
	
	private Integer menpiaojiage;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
				
	
	/**
	 * 设置：景点分类
	 */
	 
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：景点星级
	 */
	 
	public void setJingdianxingji(String jingdianxingji) {
		this.jingdianxingji = jingdianxingji;
	}
	
	/**
	 * 获取：景点星级
	 */
	public String getJingdianxingji() {
		return jingdianxingji;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：门票价格
	 */
	 
	public void setMenpiaojiage(Integer menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	
	/**
	 * 获取：门票价格
	 */
	public Integer getMenpiaojiage() {
		return menpiaojiage;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
			
}
