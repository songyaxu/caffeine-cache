package com.example.caffeinecache.controller;

import com.example.caffeinecache.common.Result;
import com.example.caffeinecache.service.CaffeineCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：yaxuSong
 * @Description:
 * @Date: 16:47 2018/12/18
 * @Modified by:
 */
@RestController
@RequestMapping("test")
public class CacheController {

    @Autowired
    private CaffeineCacheService caffeineCacheService;

    @RequestMapping("get")
    public Result<String> get(String key) {
        String value = caffeineCacheService.getIfPresent(key);
        return Result.success(value);
    }

    @RequestMapping("put")
    public Result<String> put(String key,String value) {
        caffeineCacheService.put(key, value);
        return Result.success();
    }
}
