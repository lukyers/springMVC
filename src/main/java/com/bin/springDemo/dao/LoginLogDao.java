package com.bin.springDemo.dao;

import com.bin.springDemo.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by richard02.zhang on 2016/6/22.
 */
@Repository
public class LoginLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) "
                + "VALUES(?,?,?)";
        Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDatetime()};
        jdbcTemplate.update(sqlStr, args);
    }
}
