package designPattern.structural.adapterPattern.adaptee;

public class WeightMachineImpl implements WeightMachine{
  private double weightInPound;

  public WeightMachineImpl(double weightInPound) {
    this.weightInPound = weightInPound;
  }

  @Override
  public double getWeightInPound() {
    return weightInPound;
  }
}
