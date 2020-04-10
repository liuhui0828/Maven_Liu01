package com.cn.demo02.Pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    int id;
    @NonNull
    String username;
    @NonNull
    String password;
    @NonNull
    int age;
}
