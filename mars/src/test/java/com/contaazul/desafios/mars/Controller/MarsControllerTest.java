package com.contaazul.desafios.mars.Controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by pablo on 09/01/18.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class MarsControllerTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mock;

    @Before
    public void setup() {
        mock = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void postMMRMMRMM() throws Exception {
        String command = "MMRMMRMM";
        this.mock.perform(post("/rest/mars/" + command))
            .andExpect(status().isOk())
            .andExpect(content().string("(2,0,S)"));
    }

    @Test
    public void postMML() throws Exception {
        String command = "MML";
        this.mock.perform(post("/rest/mars/" + command))
                .andExpect(status().isOk())
                .andExpect(content().string("(0,2,W)"));
    }

    @Test
    public void postMMLTwice() throws Exception {
        String command = "MMRMMRMM";
        this.mock.perform(post("/rest/mars/" + command));
        this.mock.perform(post("/rest/mars/" + command))
                .andExpect(status().isOk())
                .andExpect(content().string("(2,0,S)"));
    }

    @Test
    public void postAAA() throws Exception {
        String command = "AAA";
        this.mock.perform(post("/rest/mars/" + command))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void postMMMMMMMMMMMMMMMMMMMMMMMM() throws Exception {
        String command = "MMMMMMMMMMMMMMMMMMMMMMMM";
        this.mock.perform(post("/rest/mars/" + command))
                .andExpect(status().isBadRequest());
    }
}
