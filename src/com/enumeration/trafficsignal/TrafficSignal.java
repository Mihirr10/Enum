package com.enumeration.trafficsignal;

public enum TrafficSignal {

  RED("WAIT !!"), ORANGE("SLOW DOWN !!"), GREEN("GO !!");

  private String action;

  public String getAction() {
    return this.action;
  }

  TrafficSignal(String action) {
    this.action = action;
  }
}
