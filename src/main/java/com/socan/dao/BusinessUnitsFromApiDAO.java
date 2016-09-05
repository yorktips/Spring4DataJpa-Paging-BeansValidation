package com.socan.dao;

import java.util.List;

import com.socan.entity.BusinessUnitsFromApi;

/**
 * @author York
 * @version 1.0
 */
public interface BusinessUnitsFromApiDAO {
	public long createBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi);
    public BusinessUnitsFromApi updateBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi);
    public void deleteBusinessUnitsFromApi(long id);
    public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis();
    public BusinessUnitsFromApi getBusinessUnitsFromApi(long id);	
	public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis(String businessUnitsFromApiName);
}
