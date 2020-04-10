package com.cn.demo01.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    int id;
    @NonNull
    String username;
    @NonNull
    String password;
    @NonNull
    int age;

    Date create_time;
    Date update_time;

    @Version //乐观锁
    int version;
}
