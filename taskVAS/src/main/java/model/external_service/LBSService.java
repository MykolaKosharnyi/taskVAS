package model.external_service;

import model.Song;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * This is interface of remote LBS service.
 *
 */
public interface LBSService {
	public Song getTrack(String nameSong);
}
