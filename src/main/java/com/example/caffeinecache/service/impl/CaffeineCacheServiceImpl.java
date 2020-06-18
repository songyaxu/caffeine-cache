package com.example.caffeinecache.service.impl;

import com.example.caffeinecache.service.CaffeineCacheService;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2020/6/18 下午2:49
 * @MOdified by:
 **/
@Service
public class CaffeineCacheServiceImpl implements CaffeineCacheService {

    private Cache<String, String> cache = Caffeine.newBuilder().expireAfterWrite(Duration.ofMinutes(1))
            .maximumSize(5).build();

    @Override
    public String getIfPresent(String key) {
        return cache.getIfPresent(key);
    }

    @Override
    public void put(String key, String value) {
        cache.put(key, value);
    }
}
