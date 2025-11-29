package com.saltielv.patterns.structural.adapter.rest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestService implements Rest {
  @Override
  public void sendRestRequest(JsonObject payload) {
    log.info("Sending REST Request - Payload: {}", payload);
  }
}
