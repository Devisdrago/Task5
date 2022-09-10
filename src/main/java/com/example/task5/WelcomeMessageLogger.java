package com.example.task5;

import jdk.jfr.Enabled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

  @Value("${pl.sdacademy.welcome.text.value:portocala}")
  private String text;
  @Value("${pl.sdacademy.welcome.text.enable}")
  private Boolean shouldLog;

  @Override
  public void run(String... args) throws Exception {
    if (TRUE.equals(shouldLog)){
      log.info(text);
    }
  }
}