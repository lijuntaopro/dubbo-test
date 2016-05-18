package start;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.server.li.service.interfaces.DemoSV;
import api.service.li.dubbo.dto.DemoRespDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-server.xml")
public class springjunit4 {
	@Resource
	private DemoSV demoSV;
	@Test
	public void test1(){
		DemoRespDTO demo = demoSV.queryDemoById((long)8);
		System.out.println(demo);
		while(true){
			
		}
	}
	
}
