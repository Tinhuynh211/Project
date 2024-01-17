/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modal.User;

/**
 *
 * @author PC
 */
public class UserDAO extends DBContext {

    // get User
    public User getUserById(int AccountId) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM [ACCOUNT] "
                    + "WHERE AccountId = ?;";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, AccountId);

            rs = ps.executeQuery();
            User user = new User();

            while (rs.next()) {
                user.setAccountId(rs.getInt("AccountId"));
                user.setRoleId(rs.getInt("RoleId"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                java.sql.Timestamp createAt = rs.getTimestamp("CreateDate");
                user.setCreateDate(createAt);
                user.setFullName(rs.getString("FullName"));
                java.sql.Timestamp Birthday = rs.getTimestamp("BirthDay");
                user.setBirthDay(Birthday);
                user.setPhone(rs.getString("Phone"));
                user.setSchoolName(rs.getString("SchoolName"));
                user.setAvatar(rs.getString("Avatar"));
                user.setGender(rs.getString("Gender"));
                user.setStatus(rs.getString("Status"));

                // return lap tuc!
                return user;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
public boolean isEmailExists(String Email) {
        try {
            String sql = "SELECT COUNT(*) FROM ACCOUNT WHERE Email = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Email);

            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }

            resultSet.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
public boolean isUserExists(String Email, String Password) {
        String sql = "SELECT COUNT(*) FROM ACCOUNT "
                + "WHERE Email = ? AND Password = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, Password);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }

            resultSet.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    public User getUserByEmail(String Email, String Password) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM [ACCOUNT] "
                    + "WHERE Email = ? AND Password = ?;";
            ps = connection.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, Password);

            rs = ps.executeQuery();
            User user = new User();

            while (rs.next()) {
                user.setAccountId(rs.getInt("AccountId"));
                user.setRoleId(rs.getInt("RoleId"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                java.sql.Timestamp createAt = rs.getTimestamp("CreateDate");
                user.setCreateDate(createAt);
                user.setFullName(rs.getString("FullName"));
                java.sql.Timestamp Birthday = rs.getTimestamp("BirthDay");
                user.setBirthDay(Birthday);
                user.setPhone(rs.getString("Phone"));
                user.setSchoolName(rs.getString("SchoolName"));
                user.setAvatar(rs.getString("Avatar"));
                user.setGender(rs.getString("Gender"));
                user.setStatus(rs.getString("Status"));

                // return lap tuc!
                return user;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
    
    
}
