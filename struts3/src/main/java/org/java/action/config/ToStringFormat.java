package org.java.action.config;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * 自定义时间类型转换
 *
 */

public class ToStringFormat extends StrutsTypeConverter {
    private SimpleDateFormat[]format={
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy_MM_dd")
    };

    //流入
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        String string=strings[0];
        for (SimpleDateFormat simpleDateFormat:format){
            try {
          return simpleDateFormat.parse(string);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "input";
    }
//流出
    @Override
    public String convertToString(Map map, Object o) {
        return format[0].format(0);
    }
}
