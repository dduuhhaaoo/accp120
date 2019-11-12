package org.java.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;


}
