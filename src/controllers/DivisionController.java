package controllers;

import models.*;

public class DivisionController extends OperatorModel {
  private final ComplexNumberModel firstComplex;
  private final ComplexNumberModel secondComplex;

  public DivisionController(ComplexNumberModel _firstComplex, ComplexNumberModel _secondComplex) {
    this.firstComplex = _firstComplex;
    this.secondComplex = _secondComplex;
  }

  @Override
  public ComplexNumberModel complexOperator() {
    double a = firstComplex.getRealPart();
    double b = firstComplex.getComplexPart();
    double c = secondComplex.getRealPart();
    double d = secondComplex.getComplexPart();

    double denominator = Math.pow(c, 2) + Math.pow(d, 2);
    double realNumerator = (a * c + b * d) / denominator;
    double complexNumerator = (c * b - a * d) / denominator;

    return new ComplexNumberModel(realNumerator, complexNumerator);
  }

}
