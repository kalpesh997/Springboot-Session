package com.example;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class HibConfiguration {

	@Value("${db.driver}")
	private String DRIVER;
	
	@Value("${db.url}")
	private String URL;
	
	@Value("${db.username}")
	private String USERNAME;
	
	@Value("${db.password}")
	private String PASSWORD;
	
	@Value("${hibernate.dialect}")
	private String DIALECT;
 
	@Value("${hibernate.show_sql}")
	private String SHOW_SQL;
 
	@Value("${hibernate.hbm2ddl.auto}")
	private String HBM2DDL_AUTO;
 
	@Value("${entitymanager.packagesToScan}")
	private String PACKAGES_TO_SCAN;
 
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}
}