package org.mydb.reader.parser;

import org.mydb.common.utils.StringUtils;
import org.mydb.reader.common.constants.FileConstant;
import org.mydb.reader.common.enums.AllowedFileEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体解析器的抽象操作/公共操作
 *
 * @author Herjyang
 */
public abstract class AbstractParse implements Parser {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractParse.class);

    protected AbstractParse(String filePath) {
        if (!LegalVerifier.verify(filePath)) {
            throw new IllegalArgumentException("unsupport file");
        }
    }

    private static class LegalVerifier {
        static boolean verify(String filePath) {
            String suffix;
            if (StringUtils.isEmpty(filePath)
                || (StringUtils.isEmpty(suffix = filePath.split(FileConstant.TYPE_SEPARATOR)[1]))) {
                return false;
            }
            return AllowedFileEnum.allowed(suffix);
        }
    }
}
