package domain;

public class Popedom {
    private Integer popedomId;
    private Integer userId;
    private YesNo selectDiary;
    private YesNo selectDiaryNeirong;
    private YesNo deleteDiary;
    private YesNo deleteDiaryNeirong;
    private YesNo insertDiary;
    private YesNo insertDiaryNeirong;
    private YesNo updateDiary;
    private YesNo updateDiaryNeirong;
    private YesNo fuyuquanxian;

    public Popedom() {
    }

    public Popedom(Integer popedomId, Integer userId, YesNo selectDiary, YesNo selectDiaryNeirong, YesNo deleteDiary, YesNo deleteDiaryNeirong, YesNo insertDiary, YesNo insertDiaryNeirong, YesNo updateDiary, YesNo updateDiaryNeirong, YesNo fuyuquanxian) {
        this.popedomId = popedomId;
        this.userId = userId;
        this.selectDiary = selectDiary;
        this.selectDiaryNeirong = selectDiaryNeirong;
        this.deleteDiary = deleteDiary;
        this.deleteDiaryNeirong = deleteDiaryNeirong;
        this.insertDiary = insertDiary;
        this.insertDiaryNeirong = insertDiaryNeirong;
        this.updateDiary = updateDiary;
        this.updateDiaryNeirong = updateDiaryNeirong;
        this.fuyuquanxian = fuyuquanxian;
    }

    public Integer getPopedomId() {
        return popedomId;
    }

    public void setPopedomId(Integer popedomId) {
        this.popedomId = popedomId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public YesNo getSelectDiary() {
        return selectDiary;
    }

    public void setSelectDiary(YesNo selectDiary) {
        this.selectDiary = selectDiary;
    }

    public YesNo getSelectDiaryNeirong() {
        return selectDiaryNeirong;
    }

    public void setSelectDiaryNeirong(YesNo selectDiaryNeirong) {
        this.selectDiaryNeirong = selectDiaryNeirong;
    }

    public YesNo getDeleteDiary() {
        return deleteDiary;
    }

    public void setDeleteDiary(YesNo deleteDiary) {
        this.deleteDiary = deleteDiary;
    }

    public YesNo getDeleteDiaryNeirong() {
        return deleteDiaryNeirong;
    }

    public void setDeleteDiaryNeirong(YesNo deleteDiaryNeirong) {
        this.deleteDiaryNeirong = deleteDiaryNeirong;
    }

    public YesNo getInsertDiary() {
        return insertDiary;
    }

    public void setInsertDiary(YesNo insertDiary) {
        this.insertDiary = insertDiary;
    }

    public YesNo getInsertDiaryNeirong() {
        return insertDiaryNeirong;
    }

    public void setInsertDiaryNeirong(YesNo insertDiaryNeirong) {
        this.insertDiaryNeirong = insertDiaryNeirong;
    }

    public YesNo getUpdateDiary() {
        return updateDiary;
    }

    public void setUpdateDiary(YesNo updateDiary) {
        this.updateDiary = updateDiary;
    }

    public YesNo getUpdateDiaryNeirong() {
        return updateDiaryNeirong;
    }

    public void setUpdateDiaryNeirong(YesNo updateDiaryNeirong) {
        this.updateDiaryNeirong = updateDiaryNeirong;
    }

    public YesNo getFuyuquanxian() {
        return fuyuquanxian;
    }

    public void setFuyuquanxian(YesNo fuyuquanxian) {
        this.fuyuquanxian = fuyuquanxian;
    }

    @Override
    public String toString() {
        return "Popedom{" +
                "popedomId=" + popedomId +
                ", userId=" + userId +
                ", selectDiary=" + selectDiary +
                ", selectDiaryNeirong=" + selectDiaryNeirong +
                ", deleteDiary=" + deleteDiary +
                ", deleteDiaryNeirong=" + deleteDiaryNeirong +
                ", insertDiary=" + insertDiary +
                ", insertDiaryNeirong=" + insertDiaryNeirong +
                ", updateDiary=" + updateDiary +
                ", updateDiaryNeirong=" + updateDiaryNeirong +
                ", fuyuquanxian=" + fuyuquanxian +
                '}';
    }
}
