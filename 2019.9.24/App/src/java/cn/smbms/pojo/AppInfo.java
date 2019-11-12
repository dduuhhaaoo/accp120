package cn.smbms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppInfo {
    private  Integer id;
    private  String softwareName;
    private  String APKName;
    private  String supportROM;
    private  String interfaceLanguage;
    private double softwareSize;
    private Date updateDate;
    private  Integer devId;
    private  String appInfo;
    private  Integer status;
    private  Date onSaleDate;
    private  Date offSaleDate;
    private  Integer flatformId;
    private  Integer categoryLevel3;
    private  Integer downloads;
    private  Integer createdBy;
    private  Date  creationDate;
    private  Integer modifyBy;
    private  Date modifyDate;
    private  Integer categoryLevel1;
    private  Integer categoryLevel2;
    private  String logoPicPath;
    private  String logoLocPath;
    private  Integer versionId;
}
