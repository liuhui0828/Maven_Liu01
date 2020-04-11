package com.cn.demo01.Pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    int id;
    @NonNull
    String name;
    @NonNull
    String psd;
}
