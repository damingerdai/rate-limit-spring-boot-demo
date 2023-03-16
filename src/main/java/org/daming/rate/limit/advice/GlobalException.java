package org.daming.rate.limit.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public Map<String,Object> serviceException(Exception e) {
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("status", 500);
        map.put("message", e.getMessage());
        return map;
    }
}
