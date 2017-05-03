package model.external_service;

import model.Song;

public interface LBS {
	public Song getTrack(String nameSong);
}
