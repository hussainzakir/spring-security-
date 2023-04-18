package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.mvc.beans.MyBean;

public class Mydao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/*
	 * public int save(MyBean p) { String sql =
	 * "insert into userdata(?,?,?,?,?,?,?)"; return template.update(sql, new
	 * Object[] { p.getId(), p.getUsername(), p.getName(), p.getEmployeeId(),
	 * p.getPassword(), p.getDesignation() }); }
	 */
	
	public List<MyBean> getEmployees(){  
	    return template.query("select * from userdata",new RowMapper<MyBean>(){  
	        public MyBean mapRow(ResultSet rs, int row) throws SQLException {  
	            MyBean e=new MyBean();  
	            e.setId((long) rs.getInt(1));  
	            e.setUsername(rs.getString(2));
	            e.setPassword(rs.getString(3));
	            e.setName(rs.getString(4));  
	            e.setEmployeeId(rs.getString(5));
	            e.setCompanyconde(rs.getString(6));
	            e.setDesignation(rs.getString(7)); 
	
	            return e;  
	        }  
	    });
}

}