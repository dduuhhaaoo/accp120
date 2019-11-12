package cn.book.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//实体类
public class User {
private Integer id;
private  String name;
private String password;
private  Integer age;
private  Integer sex;
private  String nickname;
private  Integer usertype;

}
