package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SecurityRestController {
	
	@RequestMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("welcome!!", HttpStatus.OK);
	}
	
}
