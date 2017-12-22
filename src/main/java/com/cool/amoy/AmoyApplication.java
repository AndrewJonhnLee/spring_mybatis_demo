package com.cool.amoy;

import org.apache.kafka.common.errors.AuthorizationException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.apache.shiro.realm.Realm;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
@SpringBootApplication
public class AmoyApplication {

	private static Logger log = LoggerFactory.getLogger(AmoyApplication.class);

	public static void main(String[] args) {
		//		application.properties配置false的话 (this will still initialize the restart classloader but it won’t watch for file changes).
		//		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(AmoyApplication.class, args);
	}


	@ExceptionHandler(AuthorizationException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public String handleException(AuthorizationException e, Model model) {

		// you could return a 404 here instead (this is how github handles 403, so the user does NOT know there is a
		// resource at that location)
		log.debug("AuthorizationException was thrown", e);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", HttpStatus.FORBIDDEN.value());
		map.put("message", "No message available");
		model.addAttribute("errors", map);

		return "error";
	}

	@Bean
	public Realm realm() {
		TextConfigurationRealm realm = new TextConfigurationRealm();
		realm.setUserDefinitions("joe.coder=password,user\n" +
				"jill.coder=password,admin");

		realm.setRoleDefinitions("admin=read,write\n" +
				"user=read");
		realm.setCachingEnabled(true);
		return realm;
	}

	@Bean
	public ShiroFilterChainDefinition shiroFilterChainDefinition() {
		DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
		chainDefinition.addPathDefinition("/login.html", "authc"); // need to accept POSTs from the login form
		chainDefinition.addPathDefinition("/logout", "logout");
		return chainDefinition;
	}

	/**
	 * 为所有的request添加用户主体
	 * @return
	 */

	@ModelAttribute(name = "subject")
	public Subject subject() {
		return SecurityUtils.getSubject();
	}


//	xml使用示例

//	private final CityDao cityDao;
//
//	private final HotelMapper hotelMapper;
//
//	public SampleXmlApplication(CityDao cityDao, HotelMapper hotelMapper) {
//		this.cityDao = cityDao;
//		this.hotelMapper = hotelMapper;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(this.cityDao.selectCityById(1));
//		System.out.println(this.hotelMapper.selectByCityId(1));
//	}


// mybatis注解使用

//	final private CityMapper cityMapper;
//
//	public SampleAnnotationApplication(CityMapper cityMapper) {
//		this.cityMapper = cityMapper;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(this.cityMapper.findByState("CA"));
//	}


}
