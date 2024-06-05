/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Modal.Subject;
import Modal.Topics;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modal.User;
import java.util.Date;

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
    public ArrayList<User> getUserData() {
        ArrayList<User> account = new ArrayList<>();
        String query = "SELECT AccountId, RoleId, Email, FullName, Phone, SchoolName, Gender  FROM [FA].[dbo].[ACCOUNT];";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int AccountId = resultSet.getInt("AccountId");
                int RoleId = resultSet.getInt("RoleId");
                String Email = resultSet.getString("Email");                           
                String FullName = resultSet.getString("FullName");
                String Phone = resultSet.getString("Phone");
                String SchoolName = resultSet.getString("SchoolName");
                String Gender = resultSet.getString("Gender");
                
                

                User user = new User();
                user.setAccountId(AccountId);
                user.setRoleId(RoleId);
                user.setEmail(Email);                           
                user.setFullName(FullName);
                user.setPhone(Phone);
                user.setSchoolName(SchoolName);
                user.setGender(Gender);

                account.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }
    
    public ArrayList<Subject> getSubjectData() {
        ArrayList<Subject> subject = new ArrayList<>();
        String query = "SELECT SubjectId, SubjectName FROM [FA].[dbo].[SUBJECTS];";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int SubjectId = resultSet.getInt("SubjectId");             
                String SubjectName = resultSet.getString("SubjectName");                                        
                             
                Subject a = new Subject();             
                a.setSubjectId(SubjectId);
                a.setSubjectName(SubjectName);
                

                subject.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subject;
    }
    public ArrayList<Topics> getTopicData() {
    ArrayList<Topics> topics = new ArrayList<>();
    String query = "SELECT TopicId, TopicName, Duration, TotalQuestion, TopicType, Grade, CreateDate, Status, StartTestDate, FinishTestDate, SubjectId FROM [FA].[dbo].[TOPICS];";
    try {
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int topicId = resultSet.getInt("TopicId");
            String topicName = resultSet.getString("TopicName");
            int duration = resultSet.getInt("Duration");
            int totalQuestion = resultSet.getInt("TotalQuestion");
            String topicType = resultSet.getString("TopicType");
            String grade = resultSet.getString("Grade");
            Date createDate = resultSet.getDate("CreateDate");
            String status = resultSet.getString("Status");
            Date startTestDate = resultSet.getDate("StartTestDate");
            Date finishTestDate = resultSet.getDate("FinishTestDate");
            int subjectId = resultSet.getInt("SubjectId");

            Topics topic = new Topics(topicId, topicName, duration, totalQuestion, topicType, grade,
                    createDate, status, startTestDate, finishTestDate, subjectId);

            topics.add(topic);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return topics;
}

}
