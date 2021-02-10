package controllers;

import models.*;

public class SubtractionController extends OperatorModel {
  private final ComplexNumberModel firstComplex;
  private final ComplexNumberModel secondComplex;

  public SubtractionController(ComplexNumberModel _firstComplex, ComplexNumberModel _secondComplex) {
    this.firstComplex = _firstComplex;
    this.secondComplex = _secondComplex;
  }

  @Override
  public ComplexNumberModel complexOperator() {
    double realSubtraction = firstComplex.getRealPart() - secondComplex.getRealPart();
    double complexSubtraction = firstComplex.getComplexPart() - secondComplex.getComplexPart();

    return new ComplexNumberModel(realSubtraction, complexSubtraction);
  }

}
