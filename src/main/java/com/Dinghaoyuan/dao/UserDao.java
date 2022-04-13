package com.Dinghaoyuan.dao;

import com.Dinghaoyuan.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{
    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        int id = user.getId();
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String male = user.getMale();
        String female = user.getFemale();
        Date birthday = user.getBirthday();
        try{
            PreparedStatement ps=con.prepareStatement("insert into usertable values('"+id+"','"+username+"','"+password+"','"+email+"','"+male+"','"+female+"','"+birthday+"')") ;
            ps.executeLargeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        int id = user.getId();
        try{
            String sql = "delete from usertable where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            con.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        int id = user.getId();
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String male = user.getMale();
        String female = user.getFemale();
        Date birthday = user.getBirthday();
        try {
            String sql = "update usertable set email=? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        String sql = "select * from usertable where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql = "select * from usertable where username='" + username + "' and password= '" + password + "'";
        PreparedStatement st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery(sql);
        User user = null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        String sql = "select * from usertable where username=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        return null;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        String sql = "select * from usertable where password=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        String sql = "select * from usertable where email=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public List<User> findByMale(Connection con, String male) throws SQLException {
        String sql = "select * from usertable where male=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public List<User> findByFemale(Connection con, String female) throws SQLException {
        String sql = "select * from usertable where female=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public List<User> findByBirthdate(Connection con, Date birthday) throws SQLException {
        String sql = "select * from usertable where birthday=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        String sql = "select * from usertable";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        User user= null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setMale(rs.getString("male"));
            user.setFemale(rs.getString("female"));
            user.setBirthday(rs.getDate("birthday"));
        }
        con.close();
        ps.close();
        rs.close();
        return null;
    }
}
