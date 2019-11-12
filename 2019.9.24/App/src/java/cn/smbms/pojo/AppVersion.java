package cn.smbms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppVersion {
    private  Integer id;
    private  Integer appId;
    private  String  versionNo;
    private  String versionInfo;
    private  Integer publishStatus;
    private  String  downloadLink;
    private  double  versionSize;
    private  Integer createdBy;
    private Date creationDate;
    private    Integer modifyBy;
    private  Date modifyDate;
    private  String apkLocPath;
    private String apkFileName;
}
