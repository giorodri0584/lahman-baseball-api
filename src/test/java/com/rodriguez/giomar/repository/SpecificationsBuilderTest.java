package com.rodriguez.giomar.repository;

import org.junit.Test;
import org.springframework.data.jpa.domain.Specification;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class SpecificationsBuilderTest {

    @Test
    public void build() {
        String[] query = new String[]{"nameFirst:Pedro", "nameLast:martines"};
        Specification specification = SpecificationsBuilder.build(query);

        assertThat(specification).isNotNull();
    }
}