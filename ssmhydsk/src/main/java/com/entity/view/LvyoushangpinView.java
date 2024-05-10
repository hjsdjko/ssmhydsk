package com.entity.view;

import com.entity.LvyoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
@TableName("lvyoushangpin")
public class LvyoushangpinView  extends LvyoushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyoushangpinView(){
	}
 
 	public LvyoushangpinView(LvyoushangpinEntity lvyoushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, lvyoushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
