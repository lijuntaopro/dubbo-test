package mytest;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.service.li.dubbo.dto.DemoRespDTO;
import api.service.li.dubbo.interfaces.IDemoRSV;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Mytest {
	@Resource
	private IDemoRSV demoRSV;
	@Test
	public void test1(){
		DemoRespDTO demo = demoRSV.queryDemoById((long)8);
		System.out.println(demo);
	}
	
}