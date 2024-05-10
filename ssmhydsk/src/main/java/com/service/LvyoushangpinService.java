package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoushangpinView;


/**
 * 旅游商品
 *
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
public interface LvyoushangpinService extends IService<LvyoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyoushangpinVO> selectListVO(Wrapper<LvyoushangpinEntity> wrapper);
   	
   	LvyoushangpinVO selectVO(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
   	
   	List<LvyoushangpinView> selectListView(Wrapper<LvyoushangpinEntity> wrapper);
   	
   	LvyoushangpinView selectView(@Param("ew") Wrapper<LvyoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyoushangpinEntity> wrapper);
   	
}

