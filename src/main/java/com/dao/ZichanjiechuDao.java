package com.dao;

import com.entity.ZichanjiechuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanjiechuVO;
import com.entity.view.ZichanjiechuView;


/**
 * 资产借出
 * 
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanjiechuDao extends BaseMapper<ZichanjiechuEntity> {
	
	List<ZichanjiechuVO> selectListVO(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
	
	ZichanjiechuVO selectVO(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
	
	List<ZichanjiechuView> selectListView(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);

	List<ZichanjiechuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
	
	ZichanjiechuView selectView(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
	
}
