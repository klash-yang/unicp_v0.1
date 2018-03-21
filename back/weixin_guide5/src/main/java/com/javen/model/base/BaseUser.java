package com.javen.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setNickName(java.lang.String nickName) {
		set("nickName", nickName);
		return (M)this;
	}

	public java.lang.String getNickName() {
		return getStr("nickName");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	public java.lang.String getEmail() {
		return getStr("email");
	}

	public M setTel(java.lang.String tel) {
		set("tel", tel);
		return (M)this;
	}

	public java.lang.String getTel() {
		return getStr("tel");
	}

	public M setQq(java.lang.String qq) {
		set("qq", qq);
		return (M)this;
	}

	public java.lang.String getQq() {
		return getStr("qq");
	}

	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}

	public java.lang.String getPassword() {
		return getStr("password");
	}

	public M setPassword2(java.lang.String password2) {
		set("password2", password2);
		return (M)this;
	}

	public java.lang.String getPassword2() {
		return getStr("password2");
	}

	public M setOpenId(java.lang.String openId) {
		set("openId", openId);
		return (M)this;
	}

	public java.lang.String getOpenId() {
		return getStr("openId");
	}

	public M setRemember(java.lang.String remember) {
		set("remember", remember);
		return (M)this;
	}

	public java.lang.String getRemember() {
		return getStr("remember");
	}

	public M setRegisterDate(java.util.Date registerDate) {
		set("registerDate", registerDate);
		return (M)this;
	}

	public java.util.Date getRegisterDate() {
		return get("registerDate");
	}

	public M setLastLoginDate(java.util.Date lastLoginDate) {
		set("lastLoginDate", lastLoginDate);
		return (M)this;
	}

	public java.util.Date getLastLoginDate() {
		return get("lastLoginDate");
	}

	public M setLevel(java.lang.Integer level) {
		set("level", level);
		return (M)this;
	}

	public java.lang.Integer getLevel() {
		return getInt("level");
	}

}
