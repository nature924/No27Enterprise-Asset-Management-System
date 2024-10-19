package com.dao;

import com.entity.ZichanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanxinxiVO;
import com.entity.view.ZichanxinxiView;


/**
 * 资产信息
 * 
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanxinxiDao extends BaseMapper<ZichanxinxiEntity> {
	
	List<ZichanxinxiVO> selectListVO(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	ZichanxinxiVO selectVO(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	List<ZichanxinxiView> selectListView(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);

	List<ZichanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
	ZichanxinxiView selectView(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
	
}
