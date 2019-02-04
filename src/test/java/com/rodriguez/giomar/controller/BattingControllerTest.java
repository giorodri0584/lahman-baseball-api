package com.rodriguez.giomar.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BattingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findAll() {
    }

    @Test
    public void findTop() throws Exception{
        String[] properties = {"G", "AB", "R", "H", "2b", "3B", "HR", "RBI", "SB", "CS", "BB", "SO","IBB", "HBP", "SH", "SF", "GIDP"};
        for (String property : properties) {
            this.mockMvc.perform(MockMvcRequestBuilders.get("/api/battings/search/top?size=1&top="+property))
                    .andDo(print())
                    .andExpect(status().isOk());
        }
    }
}