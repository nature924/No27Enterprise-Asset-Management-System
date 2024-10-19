package com.entity.view;

import com.entity.ZichanguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanguihai")
public class ZichanguihaiView  extends ZichanguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanguihaiView(){
	}
 
 	public ZichanguihaiView(ZichanguihaiEntity zichanguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, zichanguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
