package com.tahaburak.atem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** Created by burak on 4.11.2019 */
@RestController
@RequestMapping("")
public class BaseController {
  @GetMapping(value = "ping")
  @ResponseBody
  public String ping() {
    return "pong";
  }
}
