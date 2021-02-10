package controllers;

import models.*;

public class MultiplicationController extends OperatorModel {
  private final ComplexNumberModel firstComplex;
  private final ComplexNumberModel secondComplex;

  public MultiplicationController(ComplexNumberModel _firstComplex, ComplexNumberModel _secondComplex) {
    this.firstComplex = _firstComplex;
    this.secondComplex = _secondComplex;
  }

  @Override
  public ComplexNumberModel complexOperator() {
    double a = firstComplex.getRealPart();
    double b = firstComplex.getComplexPart();
    double c = secondComplex.getRealPart();
    double d = secondComplex.getComplexPart();

    double realProduct = (a * c - d * b);
    double complexProduct = (c * b + a * d);

    return new ComplexNumberModel(realProduct, complexProduct);
  }

}
