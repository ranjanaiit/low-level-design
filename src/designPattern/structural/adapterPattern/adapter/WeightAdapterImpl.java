package designPattern.structural.adapterPattern.adapter;

import designPattern.structural.adapterPattern.adaptee.WeightMachine;

public class WeightAdapterImpl implements AbstrateWeightAdapter {

  WeightMachine weightMachine;
   public WeightAdapterImpl(WeightMachine weightMachine) {
    this.weightMachine = weightMachine;
  }
  @Override
  public double getWeightInKG() {
    return weightMachine.getWeightInPound() * 0.453592;
  }
}
