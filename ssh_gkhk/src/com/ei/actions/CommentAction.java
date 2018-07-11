package com.ei.actions;

import com.ei.Bean.Comment;
import com.ei.manager.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport{
	private Manager manager;
	private Comment comment;
	
	@Override
	public String execute()
	{
		manager.comment(comment);
		return SUCCESS;
	}
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
}
