package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
	private static final String CONTEXT_ROOT = "/";
    private static final String WELCOME_MESSAGE = "Greetings from Spring Boot!";
	
    /*@RequestMapping(value = CONTEXT_ROOT,method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    */

    @RequestMapping(value = CONTEXT_ROOT,method = RequestMethod.GET, produces = "application/json")
    public Map<String, String> index() {
        Map<String, String> lclmap = new HashMap<>();
        lclmap.put("message", WELCOME_MESSAGE);
        lclmap.put("date", new java.util.Date().toString());
        return lclmap;
    }
    
    
}
