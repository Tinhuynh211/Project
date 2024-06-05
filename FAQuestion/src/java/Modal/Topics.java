package Modal;

import java.util.Date;

public class Topics {
    private int topicId;
    private String topicName;
    private int duration;
    private int totalQuestion;
    private String topicType;
    private String grade;
    private Date createDate;
    private String status;
    private Date startTestDate;
    private Date finishTestDate;
    private int subjectId;

    public Topics() {
        // Constructor mặc định
    }

    public Topics(int topicId, String topicName, int duration, int totalQuestion, String topicType,
                 String grade, Date createDate, String status, Date startTestDate, Date finishTestDate,
                 int subjectId) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.duration = duration;
        this.totalQuestion = totalQuestion;
        this.topicType = topicType;
        this.grade = grade;
        this.createDate = createDate;
        this.status = status;
        this.startTestDate = startTestDate;
        this.finishTestDate = finishTestDate;
        this.subjectId = subjectId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public String getTopicType() {
        return topicType;
    }

    public void setTopicType(String topicType) {
        this.topicType = topicType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartTestDate() {
        return startTestDate;
    }

    public void setStartTestDate(Date startTestDate) {
        this.startTestDate = startTestDate;
    }

    public Date getFinishTestDate() {
        return finishTestDate;
    }

    public void setFinishTestDate(Date finishTestDate) {
        this.finishTestDate = finishTestDate;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

   

    @Override
    public String toString() {
        return "Topic{" +
                "topicId=" + topicId +
                ", topicName='" + topicName + '\'' +
                ", duration=" + duration +
                ", totalQuestion=" + totalQuestion +
                ", topicType='" + topicType + '\'' +
                ", grade='" + grade + '\'' +
                ", createDate=" + createDate +
                ", status='" + status + '\'' +
                ", startTestDate=" + startTestDate +
                ", finishTestDate=" + finishTestDate +
                ", subjectId=" + subjectId +
                '}';
    }
}
