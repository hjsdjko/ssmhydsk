package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusslvyoushangpinDao;
import com.entity.DiscusslvyoushangpinEntity;
import com.service.DiscusslvyoushangpinService;
import com.entity.vo.DiscusslvyoushangpinVO;
import com.entity.view.DiscusslvyoushangpinView;

@Service("discusslvyoushangpinService")
public class DiscusslvyoushangpinServiceImpl extends ServiceImpl<DiscusslvyoushangpinDao, DiscusslvyoushangpinEntity> implements DiscusslvyoushangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvyoushangpinEntity> page = this.selectPage(
                new Query<DiscusslvyoushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusslvyoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvyoushangpinEntity> wrapper) {
		  Page<DiscusslvyoushangpinView> page =new Query<DiscusslvyoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvyoushangpinVO> selectListVO(Wrapper<DiscusslvyoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvyoushangpinVO selectVO(Wrapper<DiscusslvyoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvyoushangpinView> selectListView(Wrapper<DiscusslvyoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvyoushangpinView selectView(Wrapper<DiscusslvyoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
