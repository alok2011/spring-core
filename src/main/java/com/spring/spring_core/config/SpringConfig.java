package com.spring.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.spring_core.Dao.EmployeeDao;

@Configuration
public class SpringConfig 
{
		@Bean
		public DriverManagerDataSource myDataSource()
		{
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
			dataSource.setUsername("root");
			dataSource.setPassword("Alok@2001");
			
			return dataSource;
		}
		@Bean
		public JdbcTemplate myJdbcTemplate()
		{
			JdbcTemplate jt = new JdbcTemplate();
			
			jt.setDataSource(myDataSource());
			
			return jt;
		}
		
		@Bean
		public EmployeeDao myEmpDao()
		{
			EmployeeDao empdao = new EmployeeDao();
			
			empdao.setJdbcTemplate(myJdbcTemplate());
			
			return empdao;
		}
		
		
	
}
