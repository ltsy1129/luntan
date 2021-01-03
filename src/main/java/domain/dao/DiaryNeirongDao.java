package domain.dao;

import java.util.List;

public interface DiaryNeirongDao {
    List<DiaryNeirongDao> selectAll();
    //对内容的增加
    int insertdiaryneirong(String diaryneirongneirong);
    int deletediaryneirong(int diaryneirongid);
    int updatediaryneirong(int diaryneirongid);
}
