package org.daming.rate.limit.annontaions;

import org.daming.rate.limit.enums.LimitType;

import java.lang.annotation.*;

/**
 * @author gming001
 * @version 2022-09-03 16:55
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {

    /**
     * 限流key
     */
    String key() default "rate_limit:";

    /**
     * 限流时间,单位秒
     */
    int time() default 60;

    /**
     * 限流次数
     */
    int count() default 100;

    /**
     * 限流类型
     */
    LimitType limitType() default LimitType.DEFAULT;

}
