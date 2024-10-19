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


import com.dao.ZichanweixiuDao;
import com.entity.ZichanweixiuEntity;
import com.service.ZichanweixiuService;
import com.entity.vo.ZichanweixiuVO;
import com.entity.view.ZichanweixiuView;

@Service("zichanweixiuService")
public class ZichanweixiuServiceImpl extends ServiceImpl<ZichanweixiuDao, ZichanweixiuEntity> implements ZichanweixiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanweixiuEntity> page = this.selectPage(
                new Query<ZichanweixiuEntity>(params).getPage(),
                new EntityWrapper<ZichanweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanweixiuEntity> wrapper) {
		  Page<ZichanweixiuView> page =new Query<ZichanweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanweixiuVO> selectListVO(Wrapper<ZichanweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanweixiuVO selectVO(Wrapper<ZichanweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanweixiuView> selectListView(Wrapper<ZichanweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanweixiuView selectView(Wrapper<ZichanweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
