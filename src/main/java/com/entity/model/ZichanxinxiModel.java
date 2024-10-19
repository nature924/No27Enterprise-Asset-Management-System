package com.entity.model;

import com.entity.ZichanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
public class ZichanxinxiModel  implements Serializable {
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
	 * 资产图片
	 */
	
	private String zichantupian;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 备注说明
	 */
	
	private String beizhushuoming;
		
	/**
	 * 当前位置
	 */
	
	private String dangqianweizhi;
				
	
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
	 * 设置：资产图片
	 */
	 
	public void setZichantupian(String zichantupian) {
		this.zichantupian = zichantupian;
	}
	
	/**
	 * 获取：资产图片
	 */
	public String getZichantupian() {
		return zichantupian;
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
	 * 设置：备注说明
	 */
	 
	public void setBeizhushuoming(String beizhushuoming) {
		this.beizhushuoming = beizhushuoming;
	}
	
	/**
	 * 获取：备注说明
	 */
	public String getBeizhushuoming() {
		return beizhushuoming;
	}
				
	
	/**
	 * 设置：当前位置
	 */
	 
	public void setDangqianweizhi(String dangqianweizhi) {
		this.dangqianweizhi = dangqianweizhi;
	}
	
	/**
	 * 获取：当前位置
	 */
	public String getDangqianweizhi() {
		return dangqianweizhi;
	}
			
}
