package model;

import java.util.ArrayList;
import java.util.List;

import model.external_service.ServiceAdapter;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * Actually realization of VAS service
 * Because we work with different services we need check them all
 * on needed song.
 *
 */
public class VASServiceImpl implements VASService {
	
	private List<ServiceAdapter> outerServices = new ArrayList<>();

	public void setOuterServices(List<ServiceAdapter> outerServices) {
		this.outerServices = outerServices;
	}

	@Override
	public List<Song> getMelody(String nameSong) {
		List<Song> result = new ArrayList<>();
		
		for(ServiceAdapter service: outerServices){
			result.add(service.getMelody(nameSong));
		}
		
		return result;
	}

}
