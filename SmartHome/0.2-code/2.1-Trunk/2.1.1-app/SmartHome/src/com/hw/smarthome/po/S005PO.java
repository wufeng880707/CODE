/**
 * 文件名：S005PO.java
 *
 * 版本信息：1.0
 * 日期：2012-09-29
 * Copyright 北京威果智能科技有限公司软件部 Corporation 2012 
 * 版权所有
 *
 */
package com.hw.smarthome.po;
import java.io.Serializable;

/**
 * S005PO类
 * 提交反馈内容
 */
public class S005PO implements Serializable {

	private static final long serialVersionUID = 1L;

	// -------------- fields --------------

	/**
	 * 用户留言标识
	 */
	private String ma001;

	/**
	 * 讨论区ID
	 */
	private String ma002;

	/**
	 * 回复内容
	 */
	private String ma003;

	/**
	 * 回复时间
	 */
	private String ma004;

	/**
	 * 用户ID
	 */
	private String ma005;

	/**
	 * 备注1
	 */
	private String ma006;

	/**
	 * 备注2
	 */
	private String ma007;
	/*用户昵称*/
	private String ma008;
	/*用户id*/
	private String ma009;
	// -------------- getter and setter --------------

	public String getMa001() {
		return ma001;
	}

	public void setMa001(String ma001) {
		this.ma001 = ma001;
	}

	public String getMa002() {
		return ma002;
	}

	public void setMa002(String ma002) {
		this.ma002 = ma002;
	}

	public String getMa003() {
		return ma003;
	}

	public void setMa003(String ma003) {
		this.ma003 = ma003;
	}



	public String getMa004() {
		return ma004;
	}

	public void setMa004(String ma004) {
		this.ma004 = ma004;
	}

	public String getMa005() {
		return ma005;
	}

	public void setMa005(String ma005) {
		this.ma005 = ma005;
	}

	public String getMa006() {
		return ma006;
	}

	public void setMa006(String ma006) {
		this.ma006 = ma006;
	}

	public String getMa007() {
		return ma007;
	}

	public void setMa007(String ma007) {
		this.ma007 = ma007;
	}

	public String getMa008() {
		return ma008;
	}

	public void setMa008(String ma008) {
		this.ma008 = ma008;
	}

	public String getMa009() {
		return ma009;
	}

	public void setMa009(String ma009) {
		this.ma009 = ma009;
	}

	@Override
	public String toString() {
		return "S005PO [ma001=" + ma001 + ", ma002=" + ma002
				+ ", ma003=" + ma003 + ", ma004=" + ma004
				+ ", ma005=" + ma005 + ", ma006=" + ma006
				+ ", ma007=" + ma007 + ", ma008=" + ma008
				+ ", ma009=" + ma009 + "]";
	}



	
}