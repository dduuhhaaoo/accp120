package cn.smbms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private  Integer id;
    private  String name;
    private  String password;
    private  Integer status;
    private Date lastModifyTime;
    private  Integer typeId;

}
