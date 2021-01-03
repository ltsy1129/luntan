package domain;

public class Diary {
    private Integer diaryId;
    private Integer userId;
    private String diaryTitle;

    public Diary() {
    }

    public Diary(Integer diaryId, Integer userId, String diaryTitle) {
        this.diaryId = diaryId;
        this.userId = userId;
        this.diaryTitle = diaryTitle;
    }

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "diaryId=" + diaryId +
                ", userId=" + userId +
                ", diaryTitle='" + diaryTitle + '\'' +
                '}';
    }
}
