package model;

import java.util.List;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * Public interface for getting songs by name
 *
 */
public interface VASService {
	List<Song> getMelody(String nameSong);
}
