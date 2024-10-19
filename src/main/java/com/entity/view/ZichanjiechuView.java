package com.entity.view;

import com.entity.ZichanjiechuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产借出
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanjiechu")
public class ZichanjiechuView  extends ZichanjiechuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanjiechuView(){
	}
 
 	public ZichanjiechuView(ZichanjiechuEntity zichanjiechuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanjiechuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
