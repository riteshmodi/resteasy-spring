package org.resteasy;

import com.wordnik.swagger.config.*;

import javax.servlet.http.HttpServlet;

public class MyCustomBootstrap extends HttpServlet {
  
  private static final long serialVersionUID = 100L;
  static {
    ConfigFactory.config().setBasePath("http://localhost:8080/spring");
   
   //use the following as another option
    /*BeanConfig bean = new BeanConfig();
		bean.setScan(true);
		bean.setResourcePackage("org.resteasy.rest");
		bean.setBasePath("http://localhost:8080/spring");
		bean.setVersion("1.0");*/
  }
}
