package api.server.li.startup;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import api.server.li.service.interfaces.DemoSV;
import api.service.li.dubbo.dto.DemoRespDTO;

public class ServerStart {
	public static void main(String[] args) {
//		System.out.println(System.getProperty("user.dir"));
//		try {
//			URL url = ServerStart.class.getResource("/");
//			String string = url.toString();
//			System.out.println("url:"+string);
//			if(string.charAt(string.length()-1)=='/')
//				string = string.substring(0,string.length()-1);
//			int k = string.lastIndexOf("/");
//			String begin = "";
//			if(k!=-1){
//				begin = string.substring(0,k+1);
//				System.out.println(begin);
//				begin += "hello.txt";
//				System.out.println(begin);
//			}
//			int j = -1;
//			FileInputStream is2 = new FileInputStream(begin);
//			while((j=is2.read())!=-1){
//				System.out.print((char)j);
//			}
//			InputStream is = ServerStart.class.getResourceAsStream("/hello.txt");
//			System.out.println(is==null);
//			int i = -1;
//			while((i=is.read())!=-1){
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-server.xml");
		DemoSV demoSV = context.getBean(DemoSV.class);
		DemoRespDTO demo = demoSV.queryDemoById((long)8);
		System.out.println(demo);
		while(true){
			
		}
		
	}
	
}
