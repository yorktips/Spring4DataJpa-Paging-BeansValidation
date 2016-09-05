/**
 * 
 */
package com.socan.dao.impl;
//
//import com.socan.dao.BusinessUnitsFromApiDAO;
//import com.socan.entity.BusinessUnitsFromApi;
//import com.socan.util.HibernateUtil;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author York
// * @version 1.0
// */
//
////@Repository
//public class BusinessUnitsFromApiDAOImpl implements BusinessUnitsFromApiDAO {
//    
//	public BusinessUnitsFromApiDAOImpl() {
//    	System.out.println("BusinessUnitsFromApiDAOImpl");
//    }
//	
//	@Autowired
//    private HibernateUtil hibernateUtil;
//
//    @Override
//    public long createBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi) {        
//        return (Long) hibernateUtil.create(businessUnitsFromApi);
//    }
//    
//    @Override
//    public BusinessUnitsFromApi updateBusinessUnitsFromApi(BusinessUnitsFromApi businessUnitsFromApi) {        
//        return hibernateUtil.update(businessUnitsFromApi);
//    }
//    
//    @Override
//    public void deleteBusinessUnitsFromApi(long id) {
//        BusinessUnitsFromApi businessUnitsFromApi = new BusinessUnitsFromApi();
//        businessUnitsFromApi.setId((int)id);
//        hibernateUtil.delete(businessUnitsFromApi);
//    }
//    
//    @Override
//    public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis() {        
//        return hibernateUtil.fetchAll(BusinessUnitsFromApi.class);
//    }
//    
//    @Override
//    public BusinessUnitsFromApi getBusinessUnitsFromApi(long id) {
//        return hibernateUtil.fetchById(id, BusinessUnitsFromApi.class);
//    }
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<BusinessUnitsFromApi> getAllBusinessUnitsFromApis(String businessUnitsFromApiName) { 
//		String query = "SELECT e.* FROM BusinessUnitsFromApis e WHERE e.name like '%"+ businessUnitsFromApiName +"%'";
//		List<Object[]> businessUnitsFromApiObjects = hibernateUtil.fetchAll(query);
//		List<BusinessUnitsFromApi> businessUnitsFromApis = new ArrayList<BusinessUnitsFromApi>();
//		for(Object[] businessUnitsFromApiObject: businessUnitsFromApiObjects) {
//			BusinessUnitsFromApi businessUnitsFromApi = new BusinessUnitsFromApi();
//			long id = ((BigInteger) businessUnitsFromApiObject[0]).longValue();			
//			int age = (int) businessUnitsFromApiObject[1];
//			String name = (String) businessUnitsFromApiObject[2];
//			float salary = (float) businessUnitsFromApiObject[3];
//			
//			businessUnitsFromApi.setId((int)id);
//			//businessUnitsFromApi.setName(name);
//			//businessUnitsFromApi.setAge(age);
//			//businessUnitsFromApi.setSalary(salary);
//			//businessUnitsFromApis.add(businessUnitsFromApi);
//			
//		}
//		System.out.println(businessUnitsFromApis);
//		return businessUnitsFromApis;
//	}
//}