package com.jujuapps.jujucms;

import com.jujuapps.jujucms.bean.PageBean;
import com.jujuapps.jujucms.helpers.JujuCMSMetaData;
import com.opensymphony.xwork2.ActionContext;

public class JujuCMSControllerAction extends JujuCMSBaseAction {
	public String execute() {
		setRequestUri(request.getRequestURL().toString());
		boolean pageNotFound = true;
		String action = ActionContext.getContext().getName();
		for(PageBean page : JujuCMSMetaData.GLOBAL_PAGE_LIST) {
			if(page!=null && page.getUrlSlug()!=null && page.getUrlSlug().equalsIgnoreCase(action)) {
				setPage(page);
				pageNotFound = false;
				break;
			}
		}
		if(pageNotFound) {
			return PAGE_NOT_FOUND;
		}
		else {
			return SUCCESS;
		}
	}
}
