package controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import api.service.li.dubbo.dto.DemoRespDTO;
import api.service.li.dubbo.interfaces.IDemoRSV;

@Controller
@RequestMapping("test")
public class TestController {
	@Resource
	private IDemoRSV demoRSV;
	@RequestMapping()
	public String test(){
		DemoRespDTO respDTO = demoRSV.queryDemoById((long)8);
		System.out.println("respDTO:"+respDTO);
		System.out.println("in");
		return "index.jsp";
	}

}
