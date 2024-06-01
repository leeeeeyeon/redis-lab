package com.leeeeeyeon.redislab;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Builder
@RedisHash(value = "sport")
public class Sport {

    @Id
    public Long id;
    public String name;
}
