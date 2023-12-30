package com.solo.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            .formLogin(login -> login	// form 방식 로그인 사용
                    .defaultSuccessUrl("/articles", true)
                    .permitAll()	// 대시보드 이동이 막히면 안되므로 얘는 허용
            )
            .build();
  }
}
