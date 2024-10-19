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
 * 资产信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanxinxi")
public class ZichanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanxinxiEntity() {
		
	}
	
	public ZichanxinxiEntity(T t) {
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
