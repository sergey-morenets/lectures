package capgemini.nosql.redis.jedis;

import redis.clients.jedis.Jedis;

public class JedisStarter {

    public static void main(String[] args) {
        try (Jedis jedis = new Jedis()) {
            jedis.set("item:1", "1");
        }

    }
}
