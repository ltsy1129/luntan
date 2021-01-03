package domain;

public class DiaryNeirong {
    private Integer diaryNeirongId;
    private Integer diaryId;
    private String diaryNeirongNeirong;

    public DiaryNeirong() {
    }

    public DiaryNeirong(Integer diaryNeirongId, Integer diaryId, String diaryNeirongNeirong) {
        this.diaryNeirongId = diaryNeirongId;
        this.diaryId = diaryId;
        this.diaryNeirongNeirong = diaryNeirongNeirong;
    }

    public Integer getDiaryNeirongId() {
        return diaryNeirongId;
    }

    public void setDiaryNeirongId(Integer diaryNeirongId) {
        this.diaryNeirongId = diaryNeirongId;
    }

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public String getDiaryNeirongNeirong() {
        return diaryNeirongNeirong;
    }

    public void setDiaryNeirongNeirong(String diaryNeirongNeirong) {
        this.diaryNeirongNeirong = diaryNeirongNeirong;
    }

    @Override
    public String toString() {
        return "DiaryNeirong{" +
                "diaryNeirongId=" + diaryNeirongId +
                ", diaryId=" + diaryId +
                ", diaryNeirongNeirong='" + diaryNeirongNeirong + '\'' +
                '}';
    }
}
