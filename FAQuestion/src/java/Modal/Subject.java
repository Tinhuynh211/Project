/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

/**
 *
 * @author ADMIN
 */
public class Subject {
    int SubjectId;
    String SubjectName;
    
    
    
    public Subject() {
    }

    public Subject(int SubjectId, String SubjectName) {
        this.SubjectId = SubjectId;
        this.SubjectName = SubjectName;
    }

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    @Override
    public String toString() {
        return "Subject{" + "SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + '}';
    }
    
}
