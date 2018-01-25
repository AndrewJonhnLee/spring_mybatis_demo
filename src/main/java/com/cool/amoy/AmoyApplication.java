package com.cool.amoy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class AmoyApplication {

	private static Logger log = LoggerFactory.getLogger(AmoyApplication.class);

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		//		application.properties配置false的话 (this will still initialize the restart classloader but it won’t watch for file changes).
		//		System.setProperty("spring.devtools.restart.enabled", "false");
		ApplicationContext ctx=SpringApplication.run(AmoyApplication.class, args);

		String[] beanNames =  ctx.getBeanDefinitionNames();
//		String[] beanNames =  ctx.getBeanNamesForAnnotation(Repository.class);

		System.out.println("所有beanNames个数："+beanNames.length);

		for(String bn:beanNames){

			System.out.println(bn);

		}
	}



	@Bean
	public CommandLineRunner runner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

				log.info("+++++++++"+env.getProperty("server.port"));
			}
		};

	}


//	@Bean
//	CommandLineRunner init(String s) {
//		return (args) -> {
//
//		};
//	}


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

