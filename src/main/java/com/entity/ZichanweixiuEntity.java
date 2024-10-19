package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资产维修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanweixiu")
public class ZichanweixiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanweixiuEntity() {
		
	}
	
	public ZichanweixiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资产编号
	 */
					
	private String zichanbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资产编号
	 */
	public void setZichanbianhao(String zichanbianhao) {
		this.zichanbianhao = zichanbianhao;
	}
	/**
	 * 获取：资产编号
	 */
	public String getZichanbianhao() {
		return zichanbianhao;
	}
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
