package com.entity.model;

import com.entity.LvyoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 旅游商品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public class LvyoushangpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商品价格
	 */
	
	private Integer shangpinjiage;
		
	/**
	 * 商品功能
	 */
	
	private String shangpingongneng;
		
	/**
	 * 商品简介
	 */
	
	private String shangpinjianjie;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品类型
	 */
	 
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：商品价格
	 */
	 
	public void setShangpinjiage(Integer shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	
	/**
	 * 获取：商品价格
	 */
	public Integer getShangpinjiage() {
		return shangpinjiage;
	}
				
	
	/**
	 * 设置：商品功能
	 */
	 
	public void setShangpingongneng(String shangpingongneng) {
		this.shangpingongneng = shangpingongneng;
	}
	
	/**
	 * 获取：商品功能
	 */
	public String getShangpingongneng() {
		return shangpingongneng;
	}
				
	
	/**
	 * 设置：商品简介
	 */
	 
	public void setShangpinjianjie(String shangpinjianjie) {
		this.shangpinjianjie = shangpinjianjie;
	}
	
	/**
	 * 获取：商品简介
	 */
	public String getShangpinjianjie() {
		return shangpinjianjie;
	}
			
}
