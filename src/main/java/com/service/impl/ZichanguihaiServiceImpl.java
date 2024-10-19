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


import com.dao.ZichanguihaiDao;
import com.entity.ZichanguihaiEntity;
import com.service.ZichanguihaiService;
import com.entity.vo.ZichanguihaiVO;
import com.entity.view.ZichanguihaiView;

@Service("zichanguihaiService")
public class ZichanguihaiServiceImpl extends ServiceImpl<ZichanguihaiDao, ZichanguihaiEntity> implements ZichanguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanguihaiEntity> page = this.selectPage(
                new Query<ZichanguihaiEntity>(params).getPage(),
                new EntityWrapper<ZichanguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanguihaiEntity> wrapper) {
		  Page<ZichanguihaiView> page =new Query<ZichanguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanguihaiVO> selectListVO(Wrapper<ZichanguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanguihaiVO selectVO(Wrapper<ZichanguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanguihaiView> selectListView(Wrapper<ZichanguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanguihaiView selectView(Wrapper<ZichanguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
