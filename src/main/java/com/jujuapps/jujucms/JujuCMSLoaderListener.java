package com.jujuapps.jujucms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.jujuapps.jujucms.bean.PageBean;
import com.jujuapps.jujucms.helpers.JujuCMSMetaData;
import com.jujuapps.jujucms.helpers.ResultSetMapper;

public class JujuCMSLoaderListener implements ServletContextListener {
	private static final Logger log = Logger.getLogger(JujuCMSLoaderListener.class);
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext ctx = servletContextEvent.getServletContext();
        
        String url = ctx.getInitParameter("dburl");
        String u = ctx.getInitParameter("dbuser");
        String p = ctx.getInitParameter("dbpass");
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ResultSetMapper<PageBean> resultSetMapper = new ResultSetMapper<PageBean>();
        //create database connection from init parameters and set it to context
        try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,u, p);
			st = conn.createStatement();
			rs = st.executeQuery("select * from pages p where 1");
			JujuCMSMetaData.GLOBAL_PAGE_LIST = resultSetMapper.queryToBean(rs, PageBean.class);
			if(JujuCMSMetaData.GLOBAL_PAGE_LIST!=null && JujuCMSMetaData.GLOBAL_PAGE_LIST.size()>0) {
				log.info("Total " + JujuCMSMetaData.GLOBAL_PAGE_LIST.size() + " JujuCMS pages loaded");	
			}
			else {
				log.info("No JujuCMS pages loaded");
			}
		} catch (ClassNotFoundException e) {
			log.error(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e);
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(st!=null) {
					st.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}
			catch(Exception ex) {
				//silently ignore
			}
				
		}
        
        log.info("**************** JujuCMS Loaded *************");
	}

}
