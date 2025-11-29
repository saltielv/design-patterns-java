package com.saltielv.patterns.structural.adapter.rest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public record RestClient(Rest rest) {

  public void callAPI(JsonObject payload) {
    log.info("Calling API");
    this.rest.sendRestRequest(payload);
  }
}
