package com.hongjian.log4j;

import org.apache.log4j.Logger;

/**
 * log4j log4j2 之间的差别挺大的使用时应该小心
 * 要从切换日志需要找一下资料
 *
 */
public class Log4jTest {
	// 获取日志记录器
	private static Logger logger = Logger.getLogger(Log4jTest.class);
	
    public static void main( String[] args ){
    	// 控制台信息
        System.out.println( "Console message!" );
        // trace 级别
        logger.trace("Trace message");
        // debug 级别
        logger.debug("Debug message");
        // info 级别
        logger.info("Info message");
        // warn 级别
        logger.warn("Warn message");
        // error 级别
        logger.error("Error message");
        // fatal 级别
        logger.fatal("Fatal message");
    }
}
