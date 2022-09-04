package org.daming.rate.limit.enums;

/**
 * @author gming001
 * @version 2022-09-03 16:54
 */
public enum LimitType {

    /**
     * 默认策略全局限流
     */
    DEFAULT,
    /**
     * 根据请求者IP进行限流
     */
    IP
}
