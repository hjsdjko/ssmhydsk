package com.dao;

import com.entity.LvyoushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyoushangpinVO;
import com.entity.view.LvyoushangpinView;


/**
 * 旅游商品
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public interface LvyoushangpinDao extends BaseMapper<LvyoushangpinEntity> {
	
	List<LvyoushangpinVO> selectListVO(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
	
	LvyoushangpinVO selectVO(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
	
	List<LvyoushangpinView> selectListView(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);

	List<LvyoushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
	
	LvyoushangpinView selectView(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
	
}
