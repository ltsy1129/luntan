package domain.dao;

import java.util.List;

public interface DiaryDao {
    List<DiaryDao> selectAll();
    List<DiaryDao> selectLike(String diarytitle);

}
