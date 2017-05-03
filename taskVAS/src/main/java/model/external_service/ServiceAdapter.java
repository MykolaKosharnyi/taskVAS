package model.external_service;

import model.Song;

/**
 * 
 * @author  Nikolay Kosharnyi
 *
 *	Interface for adapting remote interfaces to one interface with 
 *	which we can operate.
 *
 */
public interface ServiceAdapter {
	Song getMelody(String nameSong);
}
