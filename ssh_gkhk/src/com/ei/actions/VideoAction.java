package com.ei.actions;

import java.util.List;

import com.ei.manager.Manager;
import com.ei.reselement.Video;
import com.opensymphony.xwork2.ActionSupport;

public class VideoAction extends ActionSupport{
	private Manager manager;
	List listComment;
	private Video video;
	
	public String  show()
	{
		if(null!=manager.getMultiMediaById(video.getId()))
		{
			listComment = manager.getComment(video.getId());
			return SUCCESS;
		}
		return ERROR; 
	}
	public String add()
	{
		if(manager.addMultiMedia(video))
			return SUCCESS;
		return ERROR;
	}
	public String delete()
	{
		manager.deleteMultiMediaByIdArray(new long[]{video.getId()}); 
		return SUCCESS;
	}
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List getListComment() {
		return listComment;
	}

	public void setListComment(List listComment) {
		this.listComment = listComment;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	
	
}
