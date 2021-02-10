package controllers;

import models.*;

public class AdditionController extends OperatorModel {
  private final ComplexNumberModel firstComplex;
  private final ComplexNumberModel secondComplex;

  public AdditionController(ComplexNumberModel _firstComplex, ComplexNumberModel _secondComplex) {
    this.firstComplex = _firstComplex;
    this.secondComplex = _secondComplex;
  }

  @Override
  public ComplexNumberModel complexOperator() {
    double realAddition = firstComplex.getRealPart() + secondComplex.getRealPart();
    double complexAddition = firstComplex.getComplexPart() + secondComplex.getComplexPart();

    return new ComplexNumberModel(realAddition, complexAddition);
  }
}
