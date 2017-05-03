package model.external_service;

import model.Song;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * Adapter for FunDial service, for using in head VAS service
 *
 */
public class FunDialAdapter implements ServiceAdapter {

	private FunDialService funDial;
	
	public FunDialAdapter(FunDialService funDial){
		this.funDial = funDial;
	}
	
	public Song getMelody(String nameSong) {
		return new Song(funDial.findMusic(nameSong));
	}

}
