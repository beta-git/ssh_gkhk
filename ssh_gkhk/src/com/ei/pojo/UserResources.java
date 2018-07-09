package com.ei.pojo;

import java.util.HashSet;
import java.util.Set;

public class UserResources {
	private int balance;
	private Set advice = new HashSet(0);
	private Set video = new HashSet(0);
	private Set videoComment = new HashSet(0);
	private Set dynamic = new HashSet(0);
	private Set dunamicComment = new HashSet(0);
	private Set message = new HashSet(0);
	private Set favorite = new HashSet(0);
	private Set bill = new HashSet(0);
	private Set focus = new HashSet(0);
	private Set history = new HashSet(0);
	private Set logging = new HashSet(0);
	private Set fan = new HashSet(0);
	public UserResources(int balance, Set advice, Set video, Set videoComment, Set dynamic, Set dunamicComment,
			Set message, Set favorite, Set bill, Set focus, Set history, Set logging, Set fan) {
		super();
		this.balance = balance;
		this.advice = advice;
		this.video = video;
		this.videoComment = videoComment;
		this.dynamic = dynamic;
		this.dunamicComment = dunamicComment;
		this.message = message;
		this.favorite = favorite;
		this.bill = bill;
		this.focus = focus;
		this.history = history;
		this.logging = logging;
		this.fan = fan;
	}
	public UserResources(){}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Set getAdvice() {
		return advice;
	}
	public void setAdvice(Set advice) {
		this.advice = advice;
	}
	public Set getVideo() {
		return video;
	}
	public void setVideo(Set video) {
		this.video = video;
	}
	public Set getVideoComment() {
		return videoComment;
	}
	public void setVideoComment(Set videoComment) {
		this.videoComment = videoComment;
	}
	public Set getDynamic() {
		return dynamic;
	}
	public void setDynamic(Set dynamic) {
		this.dynamic = dynamic;
	}
	public Set getDunamicComment() {
		return dunamicComment;
	}
	public void setDunamicComment(Set dunamicComment) {
		this.dunamicComment = dunamicComment;
	}
	public Set getMessage() {
		return message;
	}
	public void setMessage(Set message) {
		this.message = message;
	}
	public Set getFavorite() {
		return favorite;
	}
	public void setFavorite(Set favorite) {
		this.favorite = favorite;
	}
	public Set getBill() {
		return bill;
	}
	public void setBill(Set bill) {
		this.bill = bill;
	}
	public Set getFocus() {
		return focus;
	}
	public void setFocus(Set focus) {
		this.focus = focus;
	}
	public Set getHistory() {
		return history;
	}
	public void setHistory(Set history) {
		this.history = history;
	}
	public Set getLogging() {
		return logging;
	}
	public void setLogging(Set logging) {
		this.logging = logging;
	}
	public Set getFan() {
		return fan;
	}
	public void setFan(Set fan) {
		this.fan = fan;
	}
}
