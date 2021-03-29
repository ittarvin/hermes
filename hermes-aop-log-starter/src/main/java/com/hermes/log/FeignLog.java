package com.hermes.log;

import com.hermes.log.constants.OptTypeEnum;
import com.hermes.log.constants.SystemTypeEnum;

import java.lang.annotation.*;

@Target(ElementType.METHOD)  //METHOD方法级别生效
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FeignLog {

    /**
     * 操作模块
     */
    String model() ;

    /**
     * 操作类型
     */
    OptTypeEnum optType();

    /**
     * 操作说明
     */
    String desc() default "";

    /**
     * 系统标识
     * @return
     */
    SystemTypeEnum systemName();

}
