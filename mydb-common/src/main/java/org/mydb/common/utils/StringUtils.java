package org.mydb.common.utils;

/**
 * 字符串操作工具类
 *
 * @author Herjyang
 */
public class StringUtils {

    /**
     * 判断字符串是否为空串：如果字符串为空或者字符串去掉前后空格的长度为零则为空串
     *
     * @param str 要校验的字符串
     * @return true-是空串; false-不是空串
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否不为空串：如果字符串为空或者字符串去掉前后空格的长度为零则为空串
     *
     * @param str 要校验的字符串
     * @return true-不是空串; false-是空串
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
