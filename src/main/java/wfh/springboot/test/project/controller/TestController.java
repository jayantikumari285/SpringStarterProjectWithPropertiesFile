package wfh.springboot.test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import wfh.springboot.test.project.bean.ReadPropertiesFile;

@RestController
public class TestController {
	
	@Autowired
	private ReadPropertiesFile readPropertiesFile;
	
	@GetMapping("/getMessageFromPropertiesFile")
	public String getMessageFromPropertiesFile()
	{
		return  readPropertiesFile.getMessage();
	}

}
