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


import com.dao.ZichanfenleiDao;
import com.entity.ZichanfenleiEntity;
import com.service.ZichanfenleiService;
import com.entity.vo.ZichanfenleiVO;
import com.entity.view.ZichanfenleiView;

@Service("zichanfenleiService")
public class ZichanfenleiServiceImpl extends ServiceImpl<ZichanfenleiDao, ZichanfenleiEntity> implements ZichanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanfenleiEntity> page = this.selectPage(
                new Query<ZichanfenleiEntity>(params).getPage(),
                new EntityWrapper<ZichanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanfenleiEntity> wrapper) {
		  Page<ZichanfenleiView> page =new Query<ZichanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanfenleiVO> selectListVO(Wrapper<ZichanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanfenleiVO selectVO(Wrapper<ZichanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanfenleiView> selectListView(Wrapper<ZichanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanfenleiView selectView(Wrapper<ZichanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
