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


import com.dao.ZichanjiechuDao;
import com.entity.ZichanjiechuEntity;
import com.service.ZichanjiechuService;
import com.entity.vo.ZichanjiechuVO;
import com.entity.view.ZichanjiechuView;

@Service("zichanjiechuService")
public class ZichanjiechuServiceImpl extends ServiceImpl<ZichanjiechuDao, ZichanjiechuEntity> implements ZichanjiechuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanjiechuEntity> page = this.selectPage(
                new Query<ZichanjiechuEntity>(params).getPage(),
                new EntityWrapper<ZichanjiechuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanjiechuEntity> wrapper) {
		  Page<ZichanjiechuView> page =new Query<ZichanjiechuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanjiechuVO> selectListVO(Wrapper<ZichanjiechuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanjiechuVO selectVO(Wrapper<ZichanjiechuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanjiechuView> selectListView(Wrapper<ZichanjiechuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanjiechuView selectView(Wrapper<ZichanjiechuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
