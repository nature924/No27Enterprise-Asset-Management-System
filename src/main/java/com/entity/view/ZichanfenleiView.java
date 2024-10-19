package com.entity.view;

import com.entity.ZichanfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanfenlei")
public class ZichanfenleiView  extends ZichanfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanfenleiView(){
	}
 
 	public ZichanfenleiView(ZichanfenleiEntity zichanfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zichanfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
