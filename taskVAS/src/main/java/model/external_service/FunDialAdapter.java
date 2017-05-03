package model.external_service;

import model.Song;

public class FunDialAdapter implements ServiceAdapter {

	private FunDialService funDial;
	
	public FunDialAdapter(FunDialService funDial){
		this.funDial = funDial;
	}
	
	public Song getMelody(String nameSong) {
		return new Song(funDial.findMusic(nameSong));
	}

}
