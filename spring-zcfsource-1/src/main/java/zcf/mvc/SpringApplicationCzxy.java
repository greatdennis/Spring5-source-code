package zcf.mvc;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import zcf.mvc.config.App;

import java.net.URL;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/23
 */
public class SpringApplicationCzxy  {

	public static void run(){
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(80);
		URL resource = SpringApplicationCzxy.class.getClassLoader().getResource("./");
		String path = resource.getPath();
		tomcat.addWebapp("/",path);
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
