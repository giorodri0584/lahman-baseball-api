package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.helper.LoadJson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PitchingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findAll() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get(EndpointUrl.PITCHINGS))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(LoadJson.from("pitchingsFindAll.json")));
    }

    @Test
    public void findByPlayerId() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/martipe02/pitchings"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(LoadJson.from("onePitcher.json")));
    }

    @Test
    public void findTop() {
    }
}