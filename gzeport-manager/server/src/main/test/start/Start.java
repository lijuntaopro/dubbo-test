package start;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import api.server.li.service.interfaces.DemoSV;
import api.service.li.dubbo.dto.DemoRespDTO;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-server.xml");
		DemoSV demoSV = context.getBean(DemoSV.class);
		DemoRespDTO demo = demoSV.queryDemoById((long)8);
		System.out.println(demo);
		while(true){
			
		}
		
	}
	
}
