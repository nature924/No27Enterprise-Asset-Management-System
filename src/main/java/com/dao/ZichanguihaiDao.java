package com.dao;

import com.entity.ZichanguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanguihaiVO;
import com.entity.view.ZichanguihaiView;


/**
 * 资产归还
 * 
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanguihaiDao extends BaseMapper<ZichanguihaiEntity> {
	
	List<ZichanguihaiVO> selectListVO(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
	
	ZichanguihaiVO selectVO(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
	
	List<ZichanguihaiView> selectListView(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);

	List<ZichanguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
	
	ZichanguihaiView selectView(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
	
}
