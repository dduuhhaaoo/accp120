package cn.smbms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private  Integer id;
    private  String devCode;
    private  String devName;
    private  String devPassword;
    private  String devEmail;
    private String devInfo;
    private  Integer createBy;
    private Date creationDate;
    private  Integer modifyBy;
    private  Date modifyDate;

}
