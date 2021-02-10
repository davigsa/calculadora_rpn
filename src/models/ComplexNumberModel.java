package models;

public class ComplexNumberModel {
  private double realPart;
  private double complexPart;

  public ComplexNumberModel(double _realPart, double _complexPart) {
    this.realPart = _realPart;
    this.complexPart = _complexPart;
  }

  public double getRealPart() {
    return realPart;
  }

  public double getComplexPart() {
    return complexPart;
  }

  public void printComplexNumber() {
    System.out.printf("( %s, %s )", realPart, complexPart);
  }
}
