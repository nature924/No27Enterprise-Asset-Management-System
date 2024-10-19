package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanjiechuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanjiechuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanjiechuView;


/**
 * 资产借出
 *
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public interface ZichanjiechuService extends IService<ZichanjiechuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanjiechuVO> selectListVO(Wrapper<ZichanjiechuEntity> wrapper);
   	
   	ZichanjiechuVO selectVO(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
   	
   	List<ZichanjiechuView> selectListView(Wrapper<ZichanjiechuEntity> wrapper);
   	
   	ZichanjiechuView selectView(@Param("ew") Wrapper<ZichanjiechuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanjiechuEntity> wrapper);
   	
}

