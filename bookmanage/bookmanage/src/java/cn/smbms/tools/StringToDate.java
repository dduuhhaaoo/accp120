package cn.smbms.tools;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
  private  String dateparam;

  //无参构造器
    public  StringToDate(String dateparam){
        this.dateparam=dateparam;
    }

    @Override
    public Date convert(String s) {
        Date date=null;
        try {
          date  =new SimpleDateFormat(dateparam).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
