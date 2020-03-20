package com.alex.leetcode;


public class No1360 {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2019-06-29","2019-06-30"));
        System.out.println(daysBetweenDates("2020-01-15","2019-12-31"));
        System.out.println(daysBetweenDates("2019-12-31", "2020-01-15"));
        System.out.println(daysBetweenDates("1971-06-29", "2010-09-23"));
    }

    private static final int[] YEAR = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int[] LEAP_YEAR = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public static int daysBetweenDates(String date1, String date2) {
        String[] strs1 = date1.split("-");
        String[] strs2 = date2.split("-");
        int year1 = Integer.valueOf(strs1[0]), month1 = Integer.valueOf(strs1[1]), days1 = Integer.valueOf(strs1[2]);
        int year2 = Integer.valueOf(strs2[0]), month2 = Integer.valueOf(strs2[1]), days2 = Integer.valueOf(strs2[2]);
        int res = 0;
        boolean flag = false;
        if (year1 > year2) {
            flag = true;
        } else if (year1 == year2) {
            if (month1 > month2) {
                flag = true;
            } else if (month1 == month2) {
                if (days1 > days2) {
                    flag = true;
                }
            }
        }
        if (flag) {
            //交换年
            year1 = year1 + year2;
            year2 = year1 - year2;
            year1 = year1 - year2;
            //交换月
            month1 = month1 + month2;
            month2 = month1 - month2;
            month1 = month1 - month2;
            //交换题
            days1 = days1 + days2;
            days2 = days1 - days2;
            days1 = days1 - days2;
        }
        //两个年份之间的日差
        for (int i = year1; i < year2; i++) {
            res += getDays(i, 12, 31);
        }

        //date2过去的天数加上
        res += getDays(year2, month2, days2);

        //date1过去的天数减去
        res -= getDays(year1, month1, days1);

        return res;
    }

    private static final int getDays(int year, int month, int day) {
        boolean isLeapYear = isLeapYear(year);
        int[] tem = isLeapYear ? LEAP_YEAR : YEAR;
        int res = 0;
        for (int i = 0; i < month - 1; i++) {
            res += tem[i];
        }
        return res += day;
    }

    /**
     * 闰年判定方法：能被400整除。或者能被4整除但不能被100整除
     * @param year
     * @return
     */
    private static final boolean isLeapYear(int year) {
        return ((year%4==0 && year%100!=0) || (year%400==0));
    }
}