package com.mycompany.jar.individual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Teste {
    private String porta ="3306";
    private String servidor ="54.175.135.45";
    private String bancoDeDados = "testebanco";
    private String login ="root";
    private String senha ="urubu100";
    
    private JdbcTemplate connection;
    
    public Teste(){
        
        BasicDataSource dataSource = new BasicDataSource();
        
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        dataSource.setUrl(String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",servidor,porta,bancoDeDados));
        
        dataSource.setUsername(login);
        dataSource.setPassword(senha);
        
        this.connection = new JdbcTemplate(dataSource);
        
    }
    
    public JdbcTemplate getConnection(){

        return connection;
    }
    
    

  
}
