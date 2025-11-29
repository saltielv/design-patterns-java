package com.saltielv.patterns.structural.adapter.soap;

import com.saltielv.patterns.structural.adapter.rest.JsonObject;
import com.saltielv.patterns.structural.adapter.rest.Rest;

public class SoapAdapter implements Rest {
  SoapService soapService;

  public SoapAdapter(SoapService soapService) {
    this.soapService = soapService;
  }

  @Override
  public void sendRestRequest(JsonObject payload) {
    XmlObject xmlPayload = new XmlObject(payload.requestId(), payload.metadata());
    this.soapService.sendSoapRequest(xmlPayload);
  }
}
