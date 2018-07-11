package com.ei.actions;

import java.util.List;

import com.ei.Bean.User;
import com.ei.manager.Manager;
import com.ei.reselement.Video;
import com.opensymphony.xwork2.ActionSupport;

public class Search extends ActionSupport{
	private Manager manager;
	private String key;
	private String sort;
	private boolean hastags = false;
	private String[] tags;
	List<Video> listVideo;
	List<User> listUser;
	
	@Override
	public String execute()
	{
		String result = ERROR;
		if(sort.equals("video"))
		{
			listVideo = manager.searchVideo(key);
			if(listVideo!=null)result = SUCCESS;
		}
		else
		{
			
		}
		return result;
	}
	
	public boolean isHastags() {
		return hastags;
	}

	public void setHastags(boolean hastags) {
		this.hastags = hastags;
	}

	public List<Video> getListVideo() {
		return listVideo;
	}
	public void setListVideo(List<Video> listVideo) {
		this.listVideo = listVideo;
	}
	public List<User> getListUser() {
		return listUser;
	}
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
}
