package com.dao;

import com.entity.ZichanweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanweixiuVO;
import com.entity.view.ZichanweixiuView;


/**
 * 资产维修
 * 
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanweixiuDao extends BaseMapper<ZichanweixiuEntity> {
	
	List<ZichanweixiuVO> selectListVO(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
	
	ZichanweixiuVO selectVO(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
	
	List<ZichanweixiuView> selectListView(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);

	List<ZichanweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
	
	ZichanweixiuView selectView(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
	
}
