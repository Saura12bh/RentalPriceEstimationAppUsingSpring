package org.springMvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan(basePackages = {"org.springMvc"})
@EnableWebMvc
public class DbConfig {
	
//	//Local
	@Bean("dataSource")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("Saurabh2003");
		ds.setUrl("jdbc:mysql://localhost:3306/rentalpriceapp");
		return ds;		
	}
	
	//live
	
//	@Bean("dataSource")
//	public DriverManagerDataSource getDataSource()
//	{
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUsername("smprowor_Saurabh");
//		ds.setPassword("IWA3#W8Dg%L_Y)E4");
//		ds.setUrl("jdbc:mysql://localhost:3306/smprowor_rentalpriceapp");
//		return ds;		
//	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(this.getDataSource());
		return jt;
	}
}
