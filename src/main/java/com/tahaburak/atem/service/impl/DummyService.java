package com.tahaburak.atem.service.impl;

import com.github.javafaker.Faker;
import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IDummyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Created by burak on 25.11.2019
 */
@Slf4j
@Service
public class DummyService implements IDummyService {
  private Faker faker;

  @PostConstruct
  private void fill() {
    this.faker = generateFaker();
  }

  private Faker generateFaker() {
    return new Faker(new Locale("en-US"));
  }

  @Override
  public User getDummyUserById(Long id) {
    log.info("generating the dummy user with id: " + id);
    return User.builder().name(faker.name().firstName()).surname(faker.name().lastName()).build();

  }
}
