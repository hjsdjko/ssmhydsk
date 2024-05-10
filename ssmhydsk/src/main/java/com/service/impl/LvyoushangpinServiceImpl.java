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


import com.dao.LvyoushangpinDao;
import com.entity.LvyoushangpinEntity;
import com.service.LvyoushangpinService;
import com.entity.vo.LvyoushangpinVO;
import com.entity.view.LvyoushangpinView;

@Service("lvyoushangpinService")
public class LvyoushangpinServiceImpl extends ServiceImpl<LvyoushangpinDao, LvyoushangpinEntity> implements LvyoushangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyoushangpinEntity> page = this.selectPage(
                new Query<LvyoushangpinEntity>(params).getPage(),
                new EntityWrapper<LvyoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyoushangpinEntity> wrapper) {
		  Page<LvyoushangpinView> page =new Query<LvyoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyoushangpinVO> selectListVO(Wrapper<LvyoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyoushangpinVO selectVO(Wrapper<LvyoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyoushangpinView> selectListView(Wrapper<LvyoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyoushangpinView selectView(Wrapper<LvyoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
