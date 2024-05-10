package com.dao;

import com.entity.XinwenzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenzixunVO;
import com.entity.view.XinwenzixunView;


/**
 * 新闻资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public interface XinwenzixunDao extends BaseMapper<XinwenzixunEntity> {
	
	List<XinwenzixunVO> selectListVO(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
	
	XinwenzixunVO selectVO(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
	
	List<XinwenzixunView> selectListView(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);

	List<XinwenzixunView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
	
	XinwenzixunView selectView(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
	
}
