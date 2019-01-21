package common.System.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

import common.System.configuration.AppPropertiesConfig;
import domain.System.BusinessEntity.ViewStockBE;

import  infrastructure.System.Adapters.*;
import model.system.repository.stockClothes;
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) throws IOException, SQLException {
    	ViewStockBE objs= new ViewStockBE();
    	stockClothes stockClothes= new stockClothes();
    	stockClothes.getViewStock(objs);
        return "home";
    }
    
 

 
    @RequestMapping(value = { "/hello"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "hello";
    }
}