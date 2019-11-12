package cn.book.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
//实体类
public class Book {
    private  Integer id;
    private  String Name;
    private  String Author;
    private  String publish;
    private Date publishdate;
    private Integer Page;
    private Integer Price;
    private  String  Content;


}
