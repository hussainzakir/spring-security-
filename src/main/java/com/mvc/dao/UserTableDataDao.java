package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvc.beans.UserTableData;


public class UserTableDataDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<UserTableData> findByUsername(){  
	    return template.query("select * from users",new RowMapper<UserTableData>(){  
	        public UserTableData mapRow(ResultSet rs, int row) throws SQLException {  
	        	UserTableData e =new UserTableData();  
	            e.setUsername(rs.getString(1));
	            e.setPassword(rs.getString(2));
	            return e;    
	        }  
	    });	
	}

	public UserTableData searchUserinDB(String username) {
		String sql = "SELECT * from users WHERE username =?";
		UserTableData user = template.queryForObject(sql, new Object[] {username}, new BeanPropertyRowMapper<>(UserTableData.class));
		return user;
	}

	
}
