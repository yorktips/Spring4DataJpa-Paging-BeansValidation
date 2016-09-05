package com.socan.controller;
import com.socan.entity.MusicSubscriber;
import com.socan.service.MusicSubscriberService;
//import com.socan.util.HibernateUtil;

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
//public class MusicSubscriberController {
//	
//	private static final Logger logger = Logger.getLogger(MusicSubscriberController.class);
//	
//	public MusicSubscriberController() {
//		System.out.println("MusicSubscriberController()");
//	}
//
//    @Autowired
//    private MusicSubscriberService musicSubscriberService;
//
//    @RequestMapping("createMusicSubscriber")
//    public ModelAndView createMusicSubscriber(@ModelAttribute MusicSubscriber musicSubscriber) {
//    	logger.info("Creating MusicSubscriber. Data: "+musicSubscriber);
//        return new ModelAndView("musicSubscriberForm");
//    }
//    
//    @RequestMapping("editMusicSubscriber")
//    public ModelAndView editMusicSubscriber(@RequestParam long id, @ModelAttribute MusicSubscriber musicSubscriber) {
//    	logger.info("Updating the MusicSubscriber for the Id "+id);
//        musicSubscriber = musicSubscriberService.getMusicSubscriber(id);
//        return new ModelAndView("musicSubscriberForm", "musicSubscriberObject", musicSubscriber);
//    }
//    
//    @RequestMapping("saveMusicSubscriber")
//    public ModelAndView saveMusicSubscriber(@ModelAttribute MusicSubscriber musicSubscriber) {
//    	logger.info("Saving the MusicSubscriber. Data : "+musicSubscriber);
//        if(HibernateUtil.getIntValue(musicSubscriber.getId()) == 0){ // if musicSubscriber id is 0 then creating the musicSubscriber other updating the musicSubscriber
//            musicSubscriberService.createMusicSubscriber(musicSubscriber);
//        } else {
//            musicSubscriberService.updateMusicSubscriber(musicSubscriber);
//        }
//        return new ModelAndView("redirect:getAllMusicSubscribers");
//    }
//    
//    @RequestMapping("deleteMusicSubscriber")
//    public ModelAndView deleteMusicSubscriber(@RequestParam long id) {
//    	logger.info("Deleting the MusicSubscriber. Id : "+id);
//        musicSubscriberService.deleteMusicSubscriber(id);
//        return new ModelAndView("redirect:getAllMusicSubscribers");
//    }
//    
//    @RequestMapping(value = {"getAllMusicSubscribers"})
//    public ModelAndView getAllMusicSubscribers() {
//    	logger.info("Getting the all MusicSubscribers.");
//        List<MusicSubscriber> musicSubscriberList = musicSubscriberService.getAllMusicSubscribers();
//        return new ModelAndView("musicSubscriberList", "musicSubscriberList", musicSubscriberList);
//    }
//    
//    @RequestMapping("searchMusicSubscriber")
//    public ModelAndView searchMusicSubscriber(@RequestParam("searchName") String searchName) {  
//    	logger.info("Searching the MusicSubscriber. MusicSubscriber Names: "+searchName);
//    	List<MusicSubscriber> musicSubscriberList = musicSubscriberService.getAllMusicSubscribers(searchName);
//        return new ModelAndView("musicSubscriberList", "musicSubscriberList", musicSubscriberList);    	
//    }
//}