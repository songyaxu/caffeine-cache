package com.example.caffeinecache.service;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2020/6/18 下午2:48
 * @MOdified by:
 **/
public interface CaffeineCacheService {

    String getIfPresent(String key);

    void put(String key, String value);
}
