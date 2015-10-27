package com.jujuapps.jujucms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.jujuapps.jujucms.bean.PageBean;

public class JujuCMSBaseAction implements ServletContextAware, SessionAware,
		ServletRequestAware, ServletResponseAware {

	protected Map<String, Object> session = new HashMap<String, Object>();
	protected ServletContext context;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected final String SUCCESS = "success";
	protected final String PAGE_NOT_FOUND = "pageNotFound";
	protected PageBean page = new PageBean();
	protected String requestUri = "";

	public PageBean getPage() {
		return page;
	}

	public void setPage(PageBean page) {
		this.page = page;
	}

	public String getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}

	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}

	public void setServletContext(ServletContext arg0) {
		context = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		response = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}

}
