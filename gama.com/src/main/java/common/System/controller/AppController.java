package common.System.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

import common.System.configuration.AppPropertiesConfig;
import  infrastructure.System.Adapters.*;
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) throws IOException {
    	
    	AppPropertiesConfig obs = new AppPropertiesConfig();
    	obs.getPropValues("hello");
    
    
    	String host="localhost"; 
    	String port="3306"; 
    	String database="Gamachicas"; 
    	String user="root"; 
    	String password="1988deza"; 

    	
    	MySqlAdapter ob = new MySqlAdapter();
    	//javaMySQLBasic.connectDatabase("localhost.localdomain", "3306", "Gamachicas","gamachicas", "1988deza");
    	ob.connectDatabase(host, port, database, user, password);
    	
        return "home";
    }
    
 

 
    @RequestMapping(value = { "/hello"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "hello";
    }
}