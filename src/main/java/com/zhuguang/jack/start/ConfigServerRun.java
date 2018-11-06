/**   
* @Title:：ConfigServerRun.java 
* @Package ：com.zhuguang.jack.start 
* @Description：SpringCloud Config Server 启动类
* @author： lcai   
* @date： 2018年11月6日 上午11:22:39 
* @version ： 1.0   
*/
package com.zhuguang.jack.start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication//这个注解由3个注解组成：@Configuration、@EnableAutoConfiguration、@ComponentScan
@EnableConfigServer//启动ConfigServer的注解
public class ConfigServerRun {

	public static void main(String[] args) {
		
		SpringApplication.run(ConfigServerRun.class, args);
	}
	/**
	 * 访问github里面的配置文件内容
	 * http://localhost:9092/jack-cloudconfig/test/master
	 * 
	 * 或者
	 * 
	 * http://localhost:9092/jack-cloudconfig/dev/master
	 * 
	 * 解释含义：
	 * jack-cloudconfig：其实代表的是项目名称
	 * dev：代表是开发环境的配置名字指向的是这个配置文件：jack-cloudconfig-dev.properties
	 * test：代表是开发环境的配置名字指向的是这个配置文件：jack-cloudconfig-test.properties
	 * master：代表的是主分支
	 * 
	 * ---------github的配置信息查看application.properties---------
	 * 
	 * 
	 * 
	 * maven项目 编译、打包命令：  mvn clean 和 mvn package -DMaven.test.skip=true
	 * 
	 * SpringBoot项目运行命令： java -jar jar包 例如： java -jar jack-cloudconfig.jar或者jack-cloudconfig.war
	 * 
	 */
	
}
