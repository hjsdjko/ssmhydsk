package com.dao;

import com.entity.DiscusslvyoushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvyoushangpinVO;
import com.entity.view.DiscusslvyoushangpinView;


/**
 * 旅游商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public interface DiscusslvyoushangpinDao extends BaseMapper<DiscusslvyoushangpinEntity> {
	
	List<DiscusslvyoushangpinVO> selectListVO(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
	
	DiscusslvyoushangpinVO selectVO(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
	
	List<DiscusslvyoushangpinView> selectListView(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);

	List<DiscusslvyoushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
	
	DiscusslvyoushangpinView selectView(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
	
}
