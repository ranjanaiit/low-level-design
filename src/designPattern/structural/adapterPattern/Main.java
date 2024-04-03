package designPattern.structural.adapterPattern;

import designPattern.structural.adapterPattern.adaptee.WeightMachineImpl;
import designPattern.structural.adapterPattern.adapter.WeightAdapterImpl;

public class Main {
  public static void main(String[] args) {
    WeightAdapterImpl weightAdapterImpl = new WeightAdapterImpl(new WeightMachineImpl(10));
   System.out.println(weightAdapterImpl.getWeightInKG());
  }
}
