package com.jbit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
