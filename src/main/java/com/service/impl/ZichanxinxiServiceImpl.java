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


import com.dao.ZichanxinxiDao;
import com.entity.ZichanxinxiEntity;
import com.service.ZichanxinxiService;
import com.entity.vo.ZichanxinxiVO;
import com.entity.view.ZichanxinxiView;

@Service("zichanxinxiService")
public class ZichanxinxiServiceImpl extends ServiceImpl<ZichanxinxiDao, ZichanxinxiEntity> implements ZichanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanxinxiEntity> page = this.selectPage(
                new Query<ZichanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZichanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanxinxiEntity> wrapper) {
		  Page<ZichanxinxiView> page =new Query<ZichanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanxinxiVO> selectListVO(Wrapper<ZichanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanxinxiVO selectVO(Wrapper<ZichanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanxinxiView> selectListView(Wrapper<ZichanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanxinxiView selectView(Wrapper<ZichanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
