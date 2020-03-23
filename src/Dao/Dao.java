package Dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBUtil;
import Javabean.Yi;


public class Dao {

	 public List<Yi> search(String lastupdateTime) {
		 String sql = "select * from worlddata where lastupdateTime= '"+lastupdateTime+"'";
	        List<Yi> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;
	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            Yi bean = null;
	            while (rs.next()) {
	                String countryname = rs.getString("countryname");
	                if(countryname!="") {
	                int confirmed =  Integer.parseInt(rs.getString("confirmed"));
	                int suspected =  Integer.parseInt(rs.getString("suspected"));
	                int dead =  Integer.parseInt(rs.getString("dead"));
	                int healed =  Integer.parseInt(rs.getString("healed"));
	                String lastupdateTime1 = rs.getString("lastupdateTime");
	                //System.out.println(province);
	                //System.out.println(confirmed_num);
	                bean = new Yi(countryname,confirmed,suspected,dead,healed,lastupdateTime1);
	                list.add(bean);
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
	    
	   
}
