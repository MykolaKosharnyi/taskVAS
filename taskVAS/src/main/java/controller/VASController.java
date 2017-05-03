package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Song;
import model.VASService;

/**
 * 
 * @author  Nikolay Kosharnyi
 *
 * This controller works like RESTful service for out VAS service.
 * 
 */
@Controller
public class VASController{
	
	@Autowired
	VASService vasService;
	
	@RequestMapping(value = "/vasService/{nameSong}", method = RequestMethod.POST, 
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Song> getSongs(
			@PathVariable("nameSong") String nameSong){
		return vasService.getMelody(nameSong);
	}

}
