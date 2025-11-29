package com.saltielv.patterns.structural.adapter.soap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoapService implements Soap {
  @Override
  public void sendSoapRequest(XmlObject payload) {
    log.info("Sending SOAP Request - Payload: {}", payload);
  }
}
