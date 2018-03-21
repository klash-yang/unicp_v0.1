package com.javen.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUserInfo<M extends BaseUserInfo<M>> extends Model<M> implements IBean {

	public M setUserNo(java.lang.Integer userNo) {
		set("user_no", userNo);
		return (M)this;
	}

	public java.lang.Integer getUserNo() {
		return getInt("user_no");
	}

	public M setNickName(java.lang.String nickName) {
		set("nick_name", nickName);
		return (M)this;
	}

	public java.lang.String getNickName() {
		return getStr("nick_name");
	}

	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	public java.lang.String getSex() {
		return getStr("sex");
	}

	public M setRequiredSex(java.lang.String requiredSex) {
		set("required_sex", requiredSex);
		return (M)this;
	}

	public java.lang.String getRequiredSex() {
		return getStr("required_sex");
	}

	public M setBirthday(java.lang.String birthday) {
		set("birthday", birthday);
		return (M)this;
	}

	public java.lang.String getBirthday() {
		return getStr("birthday");
	}

	public M setWechatNumber(java.lang.String wechatNumber) {
		set("wechat_number", wechatNumber);
		return (M)this;
	}

	public java.lang.String getWechatNumber() {
		return getStr("wechat_number");
	}

	public M setQqNumber(java.lang.String qqNumber) {
		set("qq_number", qqNumber);
		return (M)this;
	}

	public java.lang.String getQqNumber() {
		return getStr("qq_number");
	}

	public M setLocation(java.lang.String location) {
		set("location", location);
		return (M)this;
	}

	public java.lang.String getLocation() {
		return getStr("location");
	}

	public M setHomeTown(java.lang.String homeTown) {
		set("home_town", homeTown);
		return (M)this;
	}

	public java.lang.String getHomeTown() {
		return getStr("home_town");
	}

	public M setUniversityName(java.lang.String universityName) {
		set("university_name", universityName);
		return (M)this;
	}

	public java.lang.String getUniversityName() {
		return getStr("university_name");
	}

	public M setCollege(java.lang.String college) {
		set("college", college);
		return (M)this;
	}

	public java.lang.String getCollege() {
		return getStr("college");
	}

	public M setMajor(java.lang.String major) {
		set("major", major);
		return (M)this;
	}

	public java.lang.String getMajor() {
		return getStr("major");
	}

	public M setConstellation(java.lang.String constellation) {
		set("constellation", constellation);
		return (M)this;
	}

	public java.lang.String getConstellation() {
		return getStr("constellation");
	}

	public M setPersonality(java.lang.String personality) {
		set("personality", personality);
		return (M)this;
	}

	public java.lang.String getPersonality() {
		return getStr("personality");
	}

	public M setLovedMusic(java.lang.String lovedMusic) {
		set("loved_music", lovedMusic);
		return (M)this;
	}

	public java.lang.String getLovedMusic() {
		return getStr("loved_music");
	}

	public M setLovedMovieOrSeries(java.lang.String lovedMovieOrSeries) {
		set("loved_movie_or_series", lovedMovieOrSeries);
		return (M)this;
	}

	public java.lang.String getLovedMovieOrSeries() {
		return getStr("loved_movie_or_series");
	}

	public M setLovedFood(java.lang.String lovedFood) {
		set("loved_food", lovedFood);
		return (M)this;
	}

	public java.lang.String getLovedFood() {
		return getStr("loved_food");
	}

	public M setTravedPlace(java.lang.String travedPlace) {
		set("traved_place", travedPlace);
		return (M)this;
	}

	public java.lang.String getTravedPlace() {
		return getStr("traved_place");
	}

	public M setHoobie(java.lang.String hoobie) {
		set("hoobie", hoobie);
		return (M)this;
	}

	public java.lang.String getHoobie() {
		return getStr("hoobie");
	}

}
