package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
	
	@GetMapping("/")
    public String viewpage(){
        
        return "index";

    }
 
	@PostMapping("/order")
    public String viewpage2 (@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("phonenumber") String phonenumber,@RequestParam("address") String address,@RequestParam("type") String type,@RequestParam("size") String size,@RequestParam("quantity") String quantity,ModelMap modelmap  ){
        
	
if(name=="" || email=="" || phonenumber==""||address==""||quantity=="") {
	
	  return "index";
	
}

else {
	modelmap.put("name",name );
	modelmap.put("email", email );
	modelmap.put("phone", phonenumber);
	modelmap.put("address", address);
	modelmap.put("type", type);
	modelmap.put("size",size );
	modelmap.put("quantity", quantity);
		
     return "show-order";
}
    }
	
}
