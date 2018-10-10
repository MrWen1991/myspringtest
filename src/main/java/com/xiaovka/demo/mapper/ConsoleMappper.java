package com.xiaovka.demo.mapper;

import com.xiaovka.demo.pojo.ConsoleUser;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.Map;

/**
 * @Description:
 * @Author: wenjiajia
 * @Data: 2018/7/29 下午9:42
 */
@Mapper
public interface ConsoleMappper {
    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    @Select("select * from console_user where id =#{id}")
    ConsoleUser selectByPrimaryKey(@Param("id") Integer id);

    String selectByMap(@Param("map") Map map);

    @Insert("insert into console_user " +
            "(user_name,pwd,real_name,phone)" +
            "values" +
            "(#{userName},#{pwd},#{realName},#{phone})")
    int insert(ConsoleUser user);

    @Update("update console_user set create_by =1,create_time=now(),done_time=now(),last_login_time=now() where id = #{id}")
    int update(ConsoleUser user);
}
