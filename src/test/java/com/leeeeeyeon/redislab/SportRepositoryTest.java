package com.leeeeeyeon.redislab;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SportRepositoryTest {

    @Autowired
    SportRepository sportRepository;

    @DisplayName("Redis 저장 및 조회 테스트")
    @Test
    void saveAndFind() {
        // given
        Sport soccer = Sport.builder()
                .id(1L)
                .name("축구")
                .build();

        // when
        sportRepository.save(soccer);
        System.out.println("soccer 저장");

        Sport found = sportRepository.findById(1L).get();
        System.out.println("soccer 조회");

        // then
        assertThat(found.getName()).isEqualTo(soccer.getName());
    }
}
