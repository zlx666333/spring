package zlx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insert(){
        String sql = "insert into `tbl_user`(username, age) values(?, ?)";
        String username = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql, username, 19); // 增删改都来调用这个方法
        System.out.println("插入成功");

    }
}
