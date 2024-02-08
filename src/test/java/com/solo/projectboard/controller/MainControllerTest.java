package com.solo.projectboard.controller;

import com.solo.projectboard.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Import(SecurityConfig.class)
@WebMvcTest(MainController.class)
class MainControllerTest {

  private final MockMvc mvc;

  public MainControllerTest(@Autowired MockMvc mvc) {
    this.mvc = mvc;
  }

  @Test
  void givenNothing_whenRequestingRootPage_thenRedirectsToArticlesPage() throws Exception {
    // Given

    // When & Then
    mvc.perform(get("/"))
            .andExpect(status().is3xxRedirection()) // 리다이렉션 상태 코드 검증
            .andExpect(redirectedUrl("/articles")) // 리다이렉션 대상 URL 검증
            .andDo(MockMvcResultHandlers.print());
  }

}
