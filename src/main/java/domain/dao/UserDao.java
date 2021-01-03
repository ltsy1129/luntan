package domain.dao;

public interface UserDao {
    int insertUser(String username,String password);
    int zhuceUser(String username,String password);

}
