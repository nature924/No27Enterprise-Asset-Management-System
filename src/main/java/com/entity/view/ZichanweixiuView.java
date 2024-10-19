package com.entity.view;

import com.entity.ZichanweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanweixiu")
public class ZichanweixiuView  extends ZichanweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanweixiuView(){
	}
 
 	public ZichanweixiuView(ZichanweixiuEntity zichanweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
