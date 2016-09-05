package com.socan.service.impl;
import com.socan.dao.BusinessUnitsFromApiDAO;
import com.socan.entity.BusinessUnitsFromApi;
import com.socan.entity.GeneralLicensee;
import com.socan.service.BusinessUnitsFromApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
/**
 * @author York
 * @version 1.0
 */
//@Service
//@Transactional
//public class BusinessUnitsFromApiServiceImpl implements BusinessUnitsFromApiService {
//	
//	public BusinessUnitsFromApiServiceImpl() {
//		System.out.println("BusinessUnitsFromApiServiceImpl()");
//	}
//	
//    @Autowired
//    private BusinessUnitsFromApiDAO businessUnitsFromApiDAO;
//
//    @Override
//    public long createBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi) {
//        return businessUnitsFromApiDAO.createBusinessUnitsFromApi(businessUnitsFromApi);
//    }
//    @Override
//    public BusinessUnitsFromApi updateBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi) {
//        return businessUnitsFromApiDAO.updateBusinessUnitsFromApi(businessUnitsFromApi);
//    }
//    @Override
//    public void deleteBusinessUnitsFromApi(long id) {
//        businessUnitsFromApiDAO.deleteBusinessUnitsFromApi(id);
//    }
//    @Override
//    public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis() {
//        return businessUnitsFromApiDAO.getAllBusinessUnitsFromApis();
//    }
//    @Override
//    public BusinessUnitsFromApi getBusinessUnitsFromApi(long id) {
//        return businessUnitsFromApiDAO.getBusinessUnitsFromApi(id);
//    }    
//    @Override
//    public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis(String businessUnitsFromApiName) {
//    	return businessUnitsFromApiDAO.getAllBusinessUnitsFromApis(businessUnitsFromApiName);
//    }
//    
//  
//}
