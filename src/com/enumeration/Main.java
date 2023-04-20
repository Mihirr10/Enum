package com.enumeration;

import com.enumeration.trafficsignal.TrafficSignal;

public class Main {
  public static void main(String[] args) {
    TrafficSignal trafficSignal[] = TrafficSignal.values();

    for (TrafficSignal signal : trafficSignal) {
      System.out.println("SIGNAL IS " + signal.name() + " SO " + signal.getAction());
    }
  }
}