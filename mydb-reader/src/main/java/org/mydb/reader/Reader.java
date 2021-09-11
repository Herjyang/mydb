package org.mydb.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 读取器：用于将配置文件转化为Java可操作的实体类
 *
 * @author Herjyang
 */
public class Reader {
    private static final Logger LOGGER = LoggerFactory.getLogger(Reader.class);

    private static final String DEFAULT_CONFIG_FILE = "mydb.properties";

    public Reader() {
    }

    public Reader(String path) {

    }
}
