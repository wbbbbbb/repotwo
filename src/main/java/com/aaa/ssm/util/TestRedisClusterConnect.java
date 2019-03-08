package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * fileName:TestRedisClusterConnect
 * description:
 * author:zz
 * createTime:2019/3/4 17:22
 */
public class TestRedisClusterConnect {

    public static void main(String[] args) {
        Set<HostAndPort> hps = new HashSet();
        hps.add(new HostAndPort("192.168.27.20",7001));
        hps.add(new HostAndPort("192.168.27.20",7002));
        hps.add(new HostAndPort("192.168.27.20",7003));
        hps.add(new HostAndPort("192.168.27.21",7004));
        hps.add(new HostAndPort("192.168.27.21",7005));
        hps.add(new HostAndPort("192.168.27.21",7006));

        JedisCluster jedisCluster = new JedisCluster(hps);
       // System.out.println(jedisCluster.ping());
        jedisCluster.set("eee","555");
        String eee = jedisCluster.get("eee");
        System.out.println(eee);
    }
}
