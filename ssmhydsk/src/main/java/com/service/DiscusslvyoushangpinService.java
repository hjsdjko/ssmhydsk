package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvyoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvyoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvyoushangpinView;


/**
 * 旅游商品评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public interface DiscusslvyoushangpinService extends IService<DiscusslvyoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyoushangpinVO> selectListVO(Wrapper<DiscusslvyoushangpinEntity> wrapper);
   	
   	DiscusslvyoushangpinVO selectVO(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
   	
   	List<DiscusslvyoushangpinView> selectListView(Wrapper<DiscusslvyoushangpinEntity> wrapper);
   	
   	DiscusslvyoushangpinView selectView(@Param("ew") Wrapper<DiscusslvyoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyoushangpinEntity> wrapper);
   	
}

