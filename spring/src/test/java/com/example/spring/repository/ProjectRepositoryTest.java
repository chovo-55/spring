package com.example.spring.repository;

import com.example.spring.entities.Common;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
@ActiveProfiles("test")
class ProjectRepositoryTest {

    @Autowired
    protected ProjectRepository underTest;

    @Test
    void checkIfProjectExistsByName() {
    // given
        Common common = new Common("meno",12.2, LocalDate.now(),123.312);
        String name = "meno";

    // when
        underTest.save(common);

    // then
        assertThat(underTest.commonFindByName(name)).isEqualTo("meno");
    }
}