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
 * 资产归还
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 09:16:46
 */
@TableName("zichanguihai")
public class ZichanguihaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanguihaiEntity() {
		
	}
	
	public ZichanguihaiEntity(T t) {
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
	 * 归还日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date guihairiqi;
	
	/**
	 * 归还备注
	 */
					
	private String guihaibeizhu;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：归还日期
	 */
	public void setGuihairiqi(Date guihairiqi) {
		this.guihairiqi = guihairiqi;
	}
	/**
	 * 获取：归还日期
	 */
	public Date getGuihairiqi() {
		return guihairiqi;
	}
	/**
	 * 设置：归还备注
	 */
	public void setGuihaibeizhu(String guihaibeizhu) {
		this.guihaibeizhu = guihaibeizhu;
	}
	/**
	 * 获取：归还备注
	 */
	public String getGuihaibeizhu() {
		return guihaibeizhu;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
