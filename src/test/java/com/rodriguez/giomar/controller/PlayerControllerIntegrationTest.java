package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.helper.LoadJson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PlayerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findOne() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/players/aglerjo01"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(LoadJson.from("onePlayer.json")));

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/players/noAndId"))
                .andExpect(status().isNotFound())
                .andExpect(content().string(""));
    }

    @Test
    public void findAll() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/players"))
                .andExpect(status().isOk());
    }

    @Test
    public void search() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/players/search?query=nameFirst:pedro"))
                .andExpect(status().isOk());
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/players/search?query=nameFirst:pedro,nameLast:martinez"))
                .andExpect(status().isOk());
    }
}