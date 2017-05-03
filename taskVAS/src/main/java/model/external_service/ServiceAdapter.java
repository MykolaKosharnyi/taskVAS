package model.external_service;

import model.Song;

public interface ServiceAdapter {
	Song getMelody(String nameSong);
}
