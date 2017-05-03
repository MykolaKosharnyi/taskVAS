package model.external_service;

import java.util.HashMap;
import java.util.Map;

import model.Song;

public class LBSImpl implements LBS {

	private Map<String, String> storeOfSongs = new HashMap<>();
	
	{
		storeOfSongs.put("song4", "song 4 from FunDial");
		storeOfSongs.put("song5", "song 5 from FunDial");
		storeOfSongs.put("song6", "song 6 from FunDial");
	}
	
	@Override
	public Song getTrack(String nameSong) {
		return new Song(storeOfSongs.get(nameSong));
	}

}
