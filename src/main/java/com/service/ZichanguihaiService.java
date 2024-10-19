package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanguihaiView;


/**
 * 资产归还
 *
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanguihaiService extends IService<ZichanguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanguihaiVO> selectListVO(Wrapper<ZichanguihaiEntity> wrapper);
   	
   	ZichanguihaiVO selectVO(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
   	
   	List<ZichanguihaiView> selectListView(Wrapper<ZichanguihaiEntity> wrapper);
   	
   	ZichanguihaiView selectView(@Param("ew") Wrapper<ZichanguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanguihaiEntity> wrapper);
   	
}

