package io.nvijaykarthik.service.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOne {

	@Autowired
	ServiceOneProperties properties;
	
	@GetMapping("/getConfigFromProperty")
    public String getConfigFromProperty() {
        return properties.getProp();
    }
	
	
	@GetMapping("/")
    public String serviceOne() {
        return "I am from service one ";
    }
}
