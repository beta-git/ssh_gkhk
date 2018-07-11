package com.ei.actions;

import java.util.List;

import com.ei.Bean.MultiMedia;
import com.ei.manager.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class MultiMediaAction extends ActionSupport{
	private Manager manager;
	private MultiMedia multiMedia;
	private List listMultiMedia;
	private String subType;
	public String add()
	{
		if(manager.addMultiMedia(multiMedia))
			return SUCCESS;
		return ERROR;
	}
	public String delete()
	{
		if(manager.deleteMultiMediaByIdArray(new long[]{multiMedia.getId()}))
			return SUCCESS;
		return ERROR;
	}
	public String getMultiMedias()
	{
		listMultiMedia = manager.findMultiMediaBySubType(subType);
		if(null != listMultiMedia)
			return SUCCESS;
		return ERROR;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public MultiMedia getMultiMedia() {
		return multiMedia;
	}
	public void setMultiMedia(MultiMedia multiMedia) {
		this.multiMedia = multiMedia;
	}
	public List getListMultiMedia() {
		return listMultiMedia;
	}
	public void setListMultiMedia(List listMultiMedia) {
		this.listMultiMedia = listMultiMedia;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	
}
