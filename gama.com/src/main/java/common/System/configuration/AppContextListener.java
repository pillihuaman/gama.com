package common.System.configuration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

public class AppContextListener implements ServletContextListener {
	 private String url=null;
	 private  String DBUSER=null;


    public  void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();

        url = ctx.getInitParameter("DBURL");
        DBUSER= ctx.getInitParameter("DBUSER");
        String p = ctx.getInitParameter("DBPWD");
       
}
    public String name(String name) {
   
    	name=url;
	   
    	 return name;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}}