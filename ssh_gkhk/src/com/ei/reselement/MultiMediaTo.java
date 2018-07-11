
package com.ei.reselement;

import com.ei.Bean.MultiMedia;

public class MultiMediaTo {
	public static Object toSubType(MultiMedia multiMedia)
	{
		Object object = null;
		switch(multiMedia.getSubType())
		{
		case Advice.SUBTYPE: 
			Advice advice = new Advice();
			advice.setSubType(multiMedia.getSubType());
			advice.setDate(multiMedia.getDate());
			advice.setResource(multiMedia.getResource());
			advice.setUserResources(multiMedia.getUserResources());
			advice.setId(multiMedia.getId());
			object = advice;
			break;
		case Bill.SUBTYPE: 
			Bill bill = new Bill();
			bill.setSubType(multiMedia.getSubType());
			bill.setDate(multiMedia.getDate());
			bill.setResource(multiMedia.getResource());
			bill.setUserResources(multiMedia.getUserResources());
			bill.setId(multiMedia.getId());
			object = bill;
			break;
		case Dynamic.SUBTYPE: 
			Dynamic dynamic = new Dynamic();
			dynamic.setSubType(multiMedia.getSubType());
			dynamic.setDate(multiMedia.getDate());
			dynamic.setResource(multiMedia.getResource());
			dynamic.setUserResources(multiMedia.getUserResources());
			dynamic.setId(multiMedia.getId());
			object = dynamic;
			break;
		case Fan.SUBTYPE: 
			Fan fan = new Fan();
			fan.setSubType(multiMedia.getSubType());
			fan.setDate(multiMedia.getDate());
			fan.setResource(multiMedia.getResource());
			fan.setUserResources(multiMedia.getUserResources());
			fan.setId(multiMedia.getId());
			object = fan;
			break;
		case Favorite.SUBTYPE: 
			Favorite favorite = new Favorite();
			favorite.setSubType(multiMedia.getSubType());
			favorite.setDate(multiMedia.getDate());
			favorite.setResource(multiMedia.getResource());
			favorite.setUserResources(multiMedia.getUserResources());
			favorite.setId(multiMedia.getId());
			object = favorite;
			break;
		case Focus.SUBTYPE: 
			Focus focus = new Focus();
			focus.setSubType(multiMedia.getSubType());
			focus.setDate(multiMedia.getDate());
			focus.setResource(multiMedia.getResource());
			focus.setUserResources(multiMedia.getUserResources());
			focus.setId(multiMedia.getId());
			object = focus;
			break;
		case History.SUBTYPE: 
			History history = new History();
			history.setSubType(multiMedia.getSubType());
			history.setDate(multiMedia.getDate());
			history.setResource(multiMedia.getResource());
			history.setUserResources(multiMedia.getUserResources());
			history.setId(multiMedia.getId());
			object = history;
			break;
		case Logging.SUBTYPE: 
			Logging logging = new Logging();
			logging.setSubType(multiMedia.getSubType());
			logging.setDate(multiMedia.getDate());
			logging.setResource(multiMedia.getResource());
			logging.setUserResources(multiMedia.getUserResources());
			logging.setId(multiMedia.getId());
			object = logging;
			break;
		case Message.SUBTYPE: 
			Message message = new Message();
			message.setSubType(multiMedia.getSubType());
			message.setDate(multiMedia.getDate());
			message.setResource(multiMedia.getResource());
			message.setUserResources(multiMedia.getUserResources());
			message.setId(multiMedia.getId());
			object = message;
			break;
		case Video.SUBTYPE: 
			Video video = new Video();
			video.setSubType(multiMedia.getSubType());
			video.setDate(multiMedia.getDate());
			video.setResource(multiMedia.getResource());
			video.setUserResources(multiMedia.getUserResources());
			video.setId(multiMedia.getId());
			object = video;
			break;
		default:System.out.println("MultiMedia.class case nothing");;break;
		}
		return object;
	}
}
