package com.socan.service;
import com.socan.entity.MusicSubscriber;

import java.util.List;

/**
 * @author York
 * @version 1.0
 */
public interface MusicSubscriberService {
	public long createMusicSubscriber(MusicSubscriber musicSubscriber);
    public MusicSubscriber updateMusicSubscriber(MusicSubscriber musicSubscriber);
    public void deleteMusicSubscriber(long id);
    public List<MusicSubscriber> getAllMusicSubscribers();
    public MusicSubscriber getMusicSubscriber(long id);	
	public List<MusicSubscriber> getAllMusicSubscribers(String musicSubscriberName);
}
