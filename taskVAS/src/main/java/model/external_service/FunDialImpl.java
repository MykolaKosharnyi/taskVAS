package model.external_service;

import java.util.HashMap;
import java.util.Map;

public class FunDialImpl implements FunDialService {
	
	private Map<String, String> storeOfSongs = new HashMap<>();
	
	{
		storeOfSongs.put("song1", "song 1 from FunDial");
		storeOfSongs.put("song2", "song 3 from FunDial");
		storeOfSongs.put("song3", "song 3 from FunDial");
	}

	@Override
	public String findMusic(String nameSong) {
		return storeOfSongs.get(nameSong);
	}

}
