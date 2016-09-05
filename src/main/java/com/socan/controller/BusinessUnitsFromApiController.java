package com.socan.controller;
import com.socan.entity.BusinessUnitsFromApi;
import com.socan.service.BusinessUnitsFromApiService;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author York
 * @version 1.0
 */
//@Controller
//public class BusinessUnitsFromApiController {
//	
//	private static final Logger logger = Logger.getLogger(BusinessUnitsFromApiController.class);
//	
//	public BusinessUnitsFromApiController() {
//		System.out.println("BusinessUnitsFromApiController()");
//	}
//
//    @Autowired
//    private BusinessUnitsFromApiService businessUnitsFromApiService;
//
//    @RequestMapping("createBusinessUnitsFromApi")
//    public ModelAndView createBusinessUnitsFromApi(@ModelAttribute BusinessUnitsFromApi businessUnitsFromApi) {
//    	logger.info("Creating BusinessUnitsFromApi. Data: "+businessUnitsFromApi);
//        return new ModelAndView("businessUnitsFromApiForm");
//    }
//    
//    @RequestMapping("editBusinessUnitsFromApi")
//    public ModelAndView editBusinessUnitsFromApi(@RequestParam long id, @ModelAttribute BusinessUnitsFromApi businessUnitsFromApi) {
//    	logger.info("Updating the BusinessUnitsFromApi for the Id "+id);
//        businessUnitsFromApi = businessUnitsFromApiService.getBusinessUnitsFromApi(id);
//        return new ModelAndView("businessUnitsFromApiForm", "businessUnitsFromApiObject", businessUnitsFromApi);
//    }
//    
//    @RequestMapping("saveBusinessUnitsFromApi")
//    public ModelAndView saveBusinessUnitsFromApi(@ModelAttribute BusinessUnitsFromApi businessUnitsFromApi) {
//    	logger.info("Saving the BusinessUnitsFromApi. Data : "+businessUnitsFromApi);
//        if(businessUnitsFromApi.getId() == 0){ // if businessUnitsFromApi id is 0 then creating the businessUnitsFromApi other updating the businessUnitsFromApi
//            businessUnitsFromApiService.createBusinessUnitsFromApi(businessUnitsFromApi);
//        } else {
//            businessUnitsFromApiService.updateBusinessUnitsFromApi(businessUnitsFromApi);
//        }
//        return new ModelAndView("redirect:getAllBusinessUnitsFromApis");
//    }
//    
//    @RequestMapping("deleteBusinessUnitsFromApi")
//    public ModelAndView deleteBusinessUnitsFromApi(@RequestParam long id) {
//    	logger.info("Deleting the BusinessUnitsFromApi. Id : "+id);
//        businessUnitsFromApiService.deleteBusinessUnitsFromApi(id);
//        return new ModelAndView("redirect:getAllBusinessUnitsFromApis");
//    }
//    
//    @RequestMapping(value = {"getAllBusinessUnitsFromApis"})
//    public ModelAndView getAllBusinessUnitsFromApis() {
//    	logger.info("Getting the all BusinessUnitsFromApis.");
//        List<BusinessUnitsFromApi> businessUnitsFromApiList = businessUnitsFromApiService.getAllBusinessUnitsFromApis();
//        return new ModelAndView("businessUnitsFromApiList", "businessUnitsFromApiList", businessUnitsFromApiList);
//    }
//    
//    @RequestMapping("searchBusinessUnitsFromApi")
//    public ModelAndView searchBusinessUnitsFromApi(@RequestParam("searchName") String searchName) {  
//    	logger.info("Searching the BusinessUnitsFromApi. BusinessUnitsFromApi Names: "+searchName);
//    	List<BusinessUnitsFromApi> businessUnitsFromApiList = businessUnitsFromApiService.getAllBusinessUnitsFromApis(searchName);
//        return new ModelAndView("businessUnitsFromApiList", "businessUnitsFromApiList", businessUnitsFromApiList);    	
//    }
//}