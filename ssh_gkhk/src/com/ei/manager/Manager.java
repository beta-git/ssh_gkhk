package com.ei.manager;

import java.util.List;

import com.ei.Bean.Comment;
import com.ei.Bean.MultiMedia;
import com.ei.Bean.User;
import com.ei.Bean.UserInfo;
import com.ei.dao.SearchManager;
import com.ei.dao.UserManager;
import com.ei.dao.UserResourcesManager;
import com.ei.reselement.Video;

public class Manager {
	private UserManager UM;
	private UserResourcesManager URM;
	private SearchManager SM;
	private User currentUser = null;
	public boolean isUsernameUnique(String username)
	{
		return UM.isNameUnique(username);
	}
	public void updateCurrentUser()
	{
		currentUser = (User)UM.findById(currentUser.getId()).get(0);
	}
	
	public boolean isLength(String str)
	{
		return str.length()>0;
	}
	public boolean login(String username, String password)
	{
		if(isLength(username)&&isLength(password)&&UM.isUserExist(username, password))
		{	
			setCurrentUser((User)UM.findByName(username));
			return true;
		}
		return false;
	}
	public boolean register(String username, String password)
	{
		if(isLength(username)&&isLength(password)&&UM.addUser(username, password))
		{
			setCurrentUser((User)UM.findByName(username));
			return true;
		}
		return false;
	}
	public Object[] search(String key)
	{
		if(isLength(key))
		{
			SM.setKey(key);
			return SM.search();
		}
		return null;
	}
	public List<User> searchUser(String key)
	{
		if(isLength(key))
		{
			SM.setKey(key);
			return SM.searchUser();
		}
		return null;
	}
	public List<Video> searchVideo(String key)
	{
		if(isLength(key))
		{
			SM.setKey(key);
			return SM.searchVideo();
		}
		return null;
	}
	public List<Video> searchVideoByTags(String key, String[] tags)
	{
		if(isLength(key))
		{
			SM.setKey(key);
			SM.setTags(tags);
			return SM.searchVideoByTags();
		}
		return null;
	}
	public List findMultiMediaBySubType(String subType)
	{
		return URM.findByProperty(URM.SUB_TYPE, subType);
	}
	public List findUserById(long id)
	{
		if(id>0)
		{
			return UM.findById(id);
		}
		return null;
	}
	public boolean updateUserInfo(UserInfo userInfo)
	{
		return UM.updateUserInfo(currentUser,userInfo);
	}
	public boolean resetPassword(String password)
	{
		if(isLength(password))
		{
			return UM.setPassword(currentUser, password);
		}
		return false;
	}
	public boolean resetUsername(String username)
	{
		if(isLength(username))
		{
			return UM.setPassword(currentUser, username);
		}
		return false;
	}
	public boolean resetIcon(String url)
	{
		if(true)
		{
			return UM.setIcon(currentUser, url);
		}
		return false;
	}
	public MultiMedia getMultiMediaById(Long multiMediaID)
	{
		return (MultiMedia)URM.findByProperty("id", multiMediaID).get(0);
	}
	public boolean addMultiMedia(MultiMedia multiMedia)
	{
		if(true)
		{
			return URM.addMultiMedia(currentUser, multiMedia);
		}
		return false;
	}
	public boolean comment(Comment comment)
	{
		return URM.addMultiMediaComment(comment);
	}
	public List getComment(Long multiMediaID)
	{
		return URM.getMultiMediaComment(multiMediaID);
	}
	public boolean deleteMultiMediaByIdArray(long[] idArray)
	{
		boolean flag = false;
		if(idArray.length>0)
		{
			for(long id:idArray)
			{
				URM.deleteMultiMedia(id);
			}
			flag = true;
		}
		return flag;
	}
	public boolean template()
	{
		if(true)
		{
			return true;
		}
		return false;
	}
	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	public UserManager getUM() {
		return UM;
	}
	public void setUM(UserManager uM) {
		UM = uM;
	}
	public UserResourcesManager getURM() {
		return URM;
	}
	public void setURM(UserResourcesManager uRM) {
		URM = uRM;
	}
	public SearchManager getSM() {
		return SM;
	}
	public void setSM(SearchManager sM) {
		SM = sM;
	}
}
