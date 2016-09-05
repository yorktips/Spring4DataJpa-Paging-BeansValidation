/**
 * 
 */
package com.socan.dao.impl;
//
//import com.socan.dao.MusicSubscriberDAO;
//import com.socan.entity.MusicSubscriber;
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
//public class MusicSubscriberDAOImpl implements MusicSubscriberDAO {
//    
//	public MusicSubscriberDAOImpl() {
//    	System.out.println("MusicSubscriberDAOImpl");
//    }
//	
//	@Autowired
//    private HibernateUtil hibernateUtil;
//
//    @Override
//    public long createMusicSubscriber(MusicSubscriber musicSubscriber) {        
//        return (Long) hibernateUtil.create(musicSubscriber);
//    }
//    
//    @Override
//    public MusicSubscriber updateMusicSubscriber(MusicSubscriber musicSubscriber) {        
//        return hibernateUtil.update(musicSubscriber);
//    }
//    
//    @Override
//    public void deleteMusicSubscriber(long id) {
//        MusicSubscriber musicSubscriber = new MusicSubscriber();
//        musicSubscriber.setId(String.valueOf(id));
//        hibernateUtil.delete(musicSubscriber);
//    }
//    
//    @Override
//    public List<MusicSubscriber> getAllMusicSubscribers() {        
//        return hibernateUtil.fetchAll(MusicSubscriber.class);
//    }
//    
//    @Override
//    public MusicSubscriber getMusicSubscriber(long id) {
//        return hibernateUtil.fetchById(id, MusicSubscriber.class);
//    }
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<MusicSubscriber> getAllMusicSubscribers(String musicSubscriberName) { 
//		String query = "SELECT e.* FROM MusicSubscribers e WHERE e.name like '%"+ musicSubscriberName +"%'";
//		List<Object[]> musicSubscriberObjects = hibernateUtil.fetchAll(query);
//		List<MusicSubscriber> musicSubscribers = new ArrayList<MusicSubscriber>();
//		for(Object[] musicSubscriberObject: musicSubscriberObjects) {
//			MusicSubscriber musicSubscriber = new MusicSubscriber();
//			long id = ((BigInteger) musicSubscriberObject[0]).longValue();			
//			int age = (int) musicSubscriberObject[1];
//			String name = (String) musicSubscriberObject[2];
//			float salary = (float) musicSubscriberObject[3];
//			musicSubscriber.setId(String.valueOf(id));
//			//musicSubscriber.setName(name);
//			//musicSubscriber.setAge(age);
//			//musicSubscriber.setSalary(salary);
//			musicSubscribers.add(musicSubscriber);
//		}
//		System.out.println(musicSubscribers);
//		return musicSubscribers;
//	}
//}