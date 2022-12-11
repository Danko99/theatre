package com.example.theatre;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public List<String> list(){
        return new ArrayList<>(){{add("string1");add("string2");}};
    }

//    @Bean
//    public DataSource dataSource() {
//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
//        hikariDataSource.setUsername("postgres");
//        hikariDataSource.setPassword("admin");
//
//        return hikariDataSource;
//    }

//    @Bean
//    public TransactionTemplate transactionTemplate() {
//        TransactionTemplate transactionTemplate = new TransactionTemplate();
//        transactionTemplate.setIsolationLevelName(Isolation.DEFAULT.name());
//        transactionTemplate.setPropagationBehaviorName(Propagation.REQUIRED.name());
//        transactionTemplate.setTransactionManager(platformTransactionManager());
//        return transactionTemplate;
//    }

//    @Bean
//    public PlatformTransactionManager platformTransactionManager() {
//        return new DataSourceTransactionManager();
//    }

}
