package com.bs.cache;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.CacheException;
import org.springframework.util.SerializationUtils;
import redis.clients.jedis.Jedis;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPoolConfig;

import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @ClassName RedisCache
 * @Discription
 * @Author
 * @Date 2019/12/5 0005 17:13
 * @Version 1.0
 */

public class RedisCache implements Cache {

    private final String id;

    //    private Map<Object, Object> cache = new HashMap<Object, Object>();
    private Jedis cache = new Jedis("192.168.121.129", 6379);
    public RedisCache(String id) {
        this.id = id;
    }
    // 缓存的id标识
    @Override
    public String getId() {
        return id;
    }
    // 返回缓存中key的数量
    @Override
    public int getSize() {
        Long aLong = cache.dbSize();
        return aLong.intValue();
    }
    // 向缓存存入数据
    @Override
    public void putObject(Object key, Object value) {
        System.out.println("putObject key:"+key);
        // 需要进行序列化
        cache.set(SerializationUtils.serialize(key), SerializationUtils.serialize(value));
    }
    // 从缓存取数据
    @Override
    public Object getObject(Object key) {
        System.out.println("getObject key:"+key);
        byte[] bytes = cache.get(SerializationUtils.serialize(key));
        if (bytes != null) {
            // 将bytes反序列化成对象
            Object obj = SerializationUtils.deserialize(bytes);
            return obj;
        } else {
            return null;
        }
    }

    @Override
    public Object removeObject(Object key) {
        cache.del(SerializationUtils.serialize(key));
        // 要求将移除的对象返回
        return null;
    }
    // 清空缓存
    @Override
    public void clear() {
        cache.flushDB();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (getId() == null) {
            throw new CacheException("Cache instances require an ID.");
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cache)) {
            return false;
        }

        Cache otherCache = (Cache) o;
        return getId().equals(otherCache.getId());
    }

    @Override
    public int hashCode() {
        if (getId() == null) {
            throw new CacheException("Cache instances require an ID.");
        }
        return getId().hashCode();
    }

}