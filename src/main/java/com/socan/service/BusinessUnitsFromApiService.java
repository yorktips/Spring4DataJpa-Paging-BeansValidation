
package com.socan.service;
import com.socan.entity.BusinessUnitsFromApi;

import java.util.List;

/**
 * @author York
 * @version 1.0
 */
public interface BusinessUnitsFromApiService {
	public long createBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi);
    public BusinessUnitsFromApi updateBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi);
    public void deleteBusinessUnitsFromApi(long id);
    public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis();
    public BusinessUnitsFromApi getBusinessUnitsFromApi(long id);	
	public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis(String businessUnitsFromApiName);
}
