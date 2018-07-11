package com.ei.interceptor;

import java.util.Map;

import com.ei.actions.RegLog;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


public class LoginStatus extends MethodFilterInterceptor{

	

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Object action = invocation.getAction();
		if(action instanceof RegLog)
		{
			return invocation.invoke();
		}
		Map session = invocation.getInvocationContext().getSession();
		String loginFlag = (String)session.get("loginFlag");
		if(loginFlag!=null&&loginFlag.equals("login"))
		{
			return invocation.invoke();
		}
		else
		{
			((ActionSupport)action).addActionMessage(((ActionSupport)action).getText("info.welcomeerror"));
			return "loginfirst";
		}
	}

}
