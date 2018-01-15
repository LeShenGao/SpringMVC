package com.gaole.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换类
 *
 * @author gl
 * @create 2018-01-15-19:53
 */
public class DateConverter implements Converter<String, Date> {
    public Date convert(String source) {
        try {
//        将字符串转换为时间类型
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = dateFormat.parse(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        转换类型失败
        return null;
    }
}
