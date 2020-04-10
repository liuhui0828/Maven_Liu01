package com.cn.demo01;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.demo01.Mapper.UserMapper;
import com.cn.demo01.Pojo.User;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;
import java.util.HashMap;
import java.util.List;

@SpringBootTest

class Demo01ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        //增
       User user = new User("lisi","123",12);
       userMapper.insert(user);
        //删
//        userMapper.deleteById(1);

        //逻辑删除

        //改
//        User newUser = new User(3,"langlangChange","1234567Change");
//        userMapper.updateById(newUser);

        //默认字段（create_time,updatetime的更新操作）
//        User user = userMapper.selectById(6);
//        user.setAge(13);
//        userMapper.updateById(user);
        //查
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
        //按照条件查询
//        HashMap map = new HashMap();
//        map.put("password","123456");
//        List<User> users =  userMapper.selectByMap(map);
//        users.forEach(System.out::println);

        //分页，需要一个分页插件




    }

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,5);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getTotal());
    }

    @Test
    public void deleteLogic(){
        userMapper.deleteById(9);
    }

    //测试wapper的使用
    @Test
    public void ifConfig(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.isNotNull("age")
                .isNotNull("create_time");
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }


}
