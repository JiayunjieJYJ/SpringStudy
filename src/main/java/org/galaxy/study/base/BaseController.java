package org.galaxy.study.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by galaxy on 2017/2/17.
 */
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected void console(String tag, String args) {
        logger.error(tag + ": " + args);
    }

}
