package com.example.spring.web;

import com.example.spring.repository.ProjectRepository;
import com.example.spring.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest()
@ActiveProfiles("dev")
@AutoConfigureMockMvc(addFilters = false)
public class ProjectControllerTest {

    @MockBean
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    @Test
    public void test() {

        Mockito.when(projectService.getProject()).thenReturn(null);
    }




   /* private static final String ENDPOINT = "/endpoint";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getProject() throws Exception {

        projectRepository.findAll();
    }*/

        /*
        mockMvc.perform(get(ENDPOINT + "/" + 1)
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
    }

    @Test
    void registerNewCommon() {
    }

    @Test
    void deleteCommon() {
    }*/
}