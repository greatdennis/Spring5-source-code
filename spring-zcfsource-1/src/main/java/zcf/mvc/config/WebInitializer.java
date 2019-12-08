package zcf.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {
	/**项目启动时会执行该方法*/
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("我被初始化了...");
		/**1、初始化Spring容器（Bean对象的公寓）*/
		AnnotationConfigWebApplicationContext application = new AnnotationConfigWebApplicationContext();
		//注册配置文件(将来spring和MyBatis配置文件都以该方式配置进来)
		application.register(App.class);
		//将ServletContext设置进Spring容器
		application.setServletContext(servletContext);
		/**2、post乱码解决*/
		javax.servlet.FilterRegistration.Dynamic encodingFilter = 
				servletContext.addFilter("CharacterEncodingFilter", new CharacterEncodingFilter("UTF-8"));
		//设置拦截处理乱码路径
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
		/**3、向servletContext中添加一个前端控制器*/
		Dynamic springMVCServlet = 
				servletContext.addServlet("springmvc", new DispatcherServlet(application));
		//控制器仅拦截*.action的请求
		springMVCServlet.addMapping("/");
		springMVCServlet.setLoadOnStartup(1);
	}
}
