package com.entity.vo;

import com.entity.ZichanweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产维修
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public class ZichanweixiuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 资产分类
	 */
	
	private String zichanfenlei;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 维修数量
	 */
	
	private Integer weixiushuliang;
		
	/**
	 * 维修说明
	 */
	
	private String weixiushuoming;
		
	/**
	 * 维修进度
	 */
	
	private String weixiujindu;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：资产分类
	 */
	 
	public void setZichanfenlei(String zichanfenlei) {
		this.zichanfenlei = zichanfenlei;
	}
	
	/**
	 * 获取：资产分类
	 */
	public String getZichanfenlei() {
		return zichanfenlei;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：维修数量
	 */
	 
	public void setWeixiushuliang(Integer weixiushuliang) {
		this.weixiushuliang = weixiushuliang;
	}
	
	/**
	 * 获取：维修数量
	 */
	public Integer getWeixiushuliang() {
		return weixiushuliang;
	}
				
	
	/**
	 * 设置：维修说明
	 */
	 
	public void setWeixiushuoming(String weixiushuoming) {
		this.weixiushuoming = weixiushuoming;
	}
	
	/**
	 * 获取：维修说明
	 */
	public String getWeixiushuoming() {
		return weixiushuoming;
	}
				
	
	/**
	 * 设置：维修进度
	 */
	 
	public void setWeixiujindu(String weixiujindu) {
		this.weixiujindu = weixiujindu;
	}
	
	/**
	 * 获取：维修进度
	 */
	public String getWeixiujindu() {
		return weixiujindu;
	}
			
}
