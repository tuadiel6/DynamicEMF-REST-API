package adia.example.Dynamic.EMFREST.API.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuiController {
	
	@GetMapping("/clientUI")
    public String clientUI() {  	
    	return "clientUI"; 
		
    }
	
	@GetMapping("/nodered")
    public String nodeRed() {  	
    	return "node-red"; 
		
    }
	
	@GetMapping("/n8n")
    public String workflow() {
        // Return the view for Workflow
        return "n8n";
    }

}
