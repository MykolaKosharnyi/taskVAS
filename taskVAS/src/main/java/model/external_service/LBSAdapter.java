package model.external_service;

import model.Song;

public class LBSAdapter implements ServiceAdapter {

	private LBS lbs;
	
	public LBSAdapter(LBS lbs){
		this.lbs = lbs;
	}
	
	@Override
	public Song getMelody(String nameSong) {
		return lbs.getTrack(nameSong);
	}

}
