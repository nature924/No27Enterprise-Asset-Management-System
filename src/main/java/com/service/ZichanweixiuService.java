package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanweixiuView;


/**
 * 资产维修
 *
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanweixiuService extends IService<ZichanweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanweixiuVO> selectListVO(Wrapper<ZichanweixiuEntity> wrapper);
   	
   	ZichanweixiuVO selectVO(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
   	
   	List<ZichanweixiuView> selectListView(Wrapper<ZichanweixiuEntity> wrapper);
   	
   	ZichanweixiuView selectView(@Param("ew") Wrapper<ZichanweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanweixiuEntity> wrapper);
   	
}

