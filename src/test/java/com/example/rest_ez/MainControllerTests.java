package com.example.rest_ez;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
public class MainControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello_ShouldReturnGreeting() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }

    @Test
    public void getGoodBye_ShouldReturnGoodBye() throws Exception {
        mockMvc.perform(get("/goodbye"))
                .andExpect(status().isOk())
                .andExpect(content().string("Goodbye World!"));

    }

    @Test
    public void simpleTest() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk());
    }
}
