/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

import java.util.Date;

public class User {
    private int accountId;
    private int roleId;
    private String email;
    private String password;
    private Date createDate;
    private String fullName;
    private Date birthDay;
    private String phone;
    private String schoolName;
    private String avatar;
    private String gender;
    private String status;

    
    public User() {
    }

    public User(int accountId, int roleId, String email, String password, Date createDate,
                String fullName, Date birthDay, String phone, String schoolName,
                String avatar, String gender, String status) {
        this.accountId = accountId;
        this.roleId = roleId;
        this.email = email;
        this.password = password;
        this.createDate = createDate;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.schoolName = schoolName;
        this.avatar = avatar;
        this.gender = gender;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public String toString() {
        return "User{" +
                "accountId=" + accountId +
                ", roleId=" + roleId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", phone='" + phone + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

