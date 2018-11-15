package com.sunland.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static String formatDateYYYYMMdd(Date date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(getDateFormat(11));
            return sdf.format(date);
        } else {
            return "";
        }
    }

    public static String formatDateHHmmss(Date date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(getDateFormat(17));
            return sdf.format(date);
        } else {
            return "";
        }
    }

    public static String formatDateyyyyMMddHHmmss(Date date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(getDateFormat(1));
            return sdf.format(date);
        } else {
            return "";
        }
    }

    public static String getDateFormat(int kind) {
        String[] format = {
                "yyyy-MM-dd", //0
                "yyyy-MM-dd HH:mm:ss", //1
                "yyyy",//2
                "M",//3
                "dd", //4
                "yyyy年M月d日H点m分", //5
                "yyyy年M月d日", //6
                "H点m分", //7
                "yyyy-MM-dd HH:mm", //8
                "HH",//9
                "mm",//10
                "yyyyMMdd", //11
                "yyyyMMddHHmmss", //12
                "yyyy-MM-dd 23:59:59", //13
                "yyyy 年 M 月 d 日", //14
                "yyyy年MM月dd日HH时mm分",//15
                "yyyy 年  M 月  d 日  H 点  m 分", //16
                "HHmmss",//17
                "HHmm",//18
                "HH:mm",//19
                "yyyy/MM/dd HH:mm:ss", //20

        };
        return format[kind];
    }

    /**
     * 时间间隔计算
     *
     * @param smdate
     * @param bdate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    public static Date stringToDate(String date) throws ParseException {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            return sdf.parse(date);
        } else {
            return null;
        }
    }
}

