package org.mydb.reader.common.enums;

/**
 * 支持解析的文件类型
 *
 * @author Herjyang
 */
public enum AllowedFileEnum {
    XML("xml"),
    PROPERTIES("properties"),
    ;

    private String suffix;

    AllowedFileEnum(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 判断文件后缀是否为支持的格式
     *
     * @param fileSuffix 文件后缀
     * @return true-支持的文件;false-不支持的文件
     */
    public static boolean allowed(String fileSuffix) {
        for (AllowedFileEnum suffix : AllowedFileEnum.values()) {
            if (suffix.suffix.equals(fileSuffix)) {
                return true;
            }
        }
        return false;
    }
}
