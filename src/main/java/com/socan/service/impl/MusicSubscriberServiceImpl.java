package com.socan.service.impl;
import com.socan.dao.MusicSubscriberDAO;
import com.socan.entity.MusicSubscriber;
import com.socan.service.MusicSubscriberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author York
 * @version 1.0
 */
//@Service
//@Transactional
//public class MusicSubscriberServiceImpl implements MusicSubscriberService {
//	
//	public MusicSubscriberServiceImpl() {
//		System.out.println("MusicSubscriberServiceImpl()");
//	}
//	
//    @Autowired
//    private MusicSubscriberDAO musicSubscriberDAO;
//
//    @Override
//    public long createMusicSubscriber(MusicSubscriber musicSubscriber) {
//        return musicSubscriberDAO.createMusicSubscriber(musicSubscriber);
//    }
//    @Override
//    public MusicSubscriber updateMusicSubscriber(MusicSubscriber musicSubscriber) {
//        return musicSubscriberDAO.updateMusicSubscriber(musicSubscriber);
//    }
//    @Override
//    public void deleteMusicSubscriber(long id) {
//        musicSubscriberDAO.deleteMusicSubscriber(id);
//    }
//    @Override
//    public List<MusicSubscriber> getAllMusicSubscribers() {
//        return musicSubscriberDAO.getAllMusicSubscribers();
//    }
//    @Override
//    public MusicSubscriber getMusicSubscriber(long id) {
//        return musicSubscriberDAO.getMusicSubscriber(id);
//    }    
//    @Override
//    public List<MusicSubscriber> getAllMusicSubscribers(String musicSubscriberName) {
//    	return musicSubscriberDAO.getAllMusicSubscribers(musicSubscriberName);
//    }
//}
