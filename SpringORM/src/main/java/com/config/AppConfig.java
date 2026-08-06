package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.model.Employee;

@Configuration
@ComponentScan(basePackages = "com")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/practice");
        ds.setUsername("root");
        ds.setPassword("Srikar@123");

        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();

        // Database Connection
        factory.setDataSource(dataSource());

        // Entity Classes
        factory.setAnnotatedClasses(Employee.class);

        // Hibernate Properties
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");

        factory.setHibernateProperties(properties);

        return factory;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {

        HibernateTransactionManager txManager = new HibernateTransactionManager();

        txManager.setSessionFactory(sessionFactory().getObject());

        return txManager;
    }
}