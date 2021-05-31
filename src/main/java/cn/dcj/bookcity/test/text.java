package cn.dcj.bookcity.test;

import cn.dcj.bookcity.domain.User;
import cn.dcj.bookcity.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class text {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDs());
        String sql= "select * from t_user";
        User user = template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class));
        System.out.println(user);
    }
}
