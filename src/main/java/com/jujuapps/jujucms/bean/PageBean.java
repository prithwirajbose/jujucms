package com.jujuapps.jujucms.bean;

import com.jujuapps.jujucms.helpers.annotations.Column;
import com.jujuapps.jujucms.helpers.annotations.Entity;

@Entity(table="pages")
public class PageBean {
	@Column(name="page_id")
	private int pageId;
	
	@Column(name="page_title")
	private String pageTitle;
	
	@Column(name="url_slug")
	private String urlSlug;
	
	@Column(name="page_description")
	private String pageDescription;
	
	@Column(name="page_content")
	private String pageContent;

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getUrlSlug() {
		return urlSlug;
	}

	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}

	public String getPageDescription() {
		return pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}

}
