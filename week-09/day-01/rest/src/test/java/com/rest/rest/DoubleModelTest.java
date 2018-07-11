//package com.rest.rest;
//import com.rest.rest.models.DoubleModel;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import java.nio.charset.Charset;
//import static org.hamcrest.core.Is.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(DoubleModel.class)
//public class DoubleModelTest {
//
//  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
//          MediaType.APPLICATION_JSON.getSubtype(),
//          Charset.forName("utf8"));
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  // if an additional service layer is used
//  // - meaning not all logic is added to the controller and you have Autowired fields in it -
//  // then you have to mock out the service class like below
//  //
//  //@MockBean
//  //private UserService userService;
//
//  @Test
//  public void addNewUser_succesfull() throws Exception {
//    mockMvc.perform(post("/doubling")
//            .contentType(MediaType.APPLICATION_JSON)
//            .content("{\"received\": 10, \"result\": 20}"))
//            .andExpect(status().isOk())
//            .andExpect(content().contentType(contentType))
//            .andExpect(jsonPath("$.result", is("success")))
//            .andExpect(jsonPath("$.message", is("User is added")));
//  }
//
//}
//
//
