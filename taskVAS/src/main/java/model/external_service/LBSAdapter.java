package model.external_service;

import model.Song;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * Adapter for LBS service.
 *
 */
public class LBSAdapter implements ServiceAdapter {

	private LBSService lbs;
	
	public LBSAdapter(LBSService lbs){
		this.lbs = lbs;
	}
	
	@Override
	public Song getMelody(String nameSong) {
		return lbs.getTrack(nameSong);
	}

}
