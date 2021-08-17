package com.java.spring.mvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.java.spring.mvc.dao.EmployDAO;
import com.java.spring.mvc.dao.EmployDAOImpl;

@Configuration
@ComponentScan(basePackages="com.java.spring.mvc")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
//	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
//	<property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
//		<property name="url" value="jdbc:mysql://localhost:3306/hexawaresql"/>
//		<property name="username" value="root" />
//		<property name="password" value="root" />
//</bean>
	
	    @Bean
	    public DataSource getDataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/practice");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");
	        return dataSource;
	    }
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	 @Bean
	    public EmployDAO getEmployDAO() {
	        return new EmployDAOImpl(getDataSource());
	    }

	
}
