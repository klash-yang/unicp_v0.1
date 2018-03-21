package com.javen.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseIdea<M extends BaseIdea<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setAccount(java.lang.String account) {
		set("account", account);
		return (M)this;
	}

	public java.lang.String getAccount() {
		return getStr("account");
	}

	public M setContact(java.lang.String contact) {
		set("contact", contact);
		return (M)this;
	}

	public java.lang.String getContact() {
		return getStr("contact");
	}

	public M setContext(java.lang.String context) {
		set("context", context);
		return (M)this;
	}

	public java.lang.String getContext() {
		return getStr("context");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

}
