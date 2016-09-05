/**
 * 
 */
package com.socan.dao;

import java.util.List;

import com.socan.entity.MusicSubscriber;

/**
 * @author York
 * @version 1.0
 */
public interface MusicSubscriberDAO {
	public long createMusicSubscriber(MusicSubscriber musicSubscriber);
    public MusicSubscriber updateMusicSubscriber(MusicSubscriber musicSubscriber);
    public void deleteMusicSubscriber(long id);
    public List<MusicSubscriber> getAllMusicSubscribers();
    public MusicSubscriber getMusicSubscriber(long id);	
	public List<MusicSubscriber> getAllMusicSubscribers(String musicSubscriberName);
}
