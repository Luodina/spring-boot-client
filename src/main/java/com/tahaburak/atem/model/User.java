package com.tahaburak.atem.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by burak on 24.11.2019
 */
@Data
@Builder
public class User {

  private Long id;

  private String name;
  private String surname;
  private Date birthDate;
}
