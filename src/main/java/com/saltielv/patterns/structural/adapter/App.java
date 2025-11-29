package com.saltielv.patterns.structural.adapter;

import com.saltielv.patterns.structural.adapter.rest.RestClient;
import com.saltielv.patterns.structural.adapter.rest.JsonObject;
import com.saltielv.patterns.structural.adapter.rest.RestService;
import com.saltielv.patterns.structural.adapter.soap.SoapAdapter;
import com.saltielv.patterns.structural.adapter.soap.SoapService;

public class App {
  public static void main(String[] args) {

    JsonObject payload1 = new JsonObject(1, "JSON");
    RestClient restClient1 = new RestClient(new RestService());
    restClient1.callAPI(payload1);

    JsonObject payload2 = new JsonObject(2, "XML");
    RestClient restClient2 = new RestClient(new SoapAdapter(new SoapService()));
    restClient2.callAPI(payload2);
  }
}
