package com.jbit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
private Integer id;
private  String name;
private String password;
private  Integer age;
private  Integer sex;
private  String nickname;
private  Integer usertype;

}
