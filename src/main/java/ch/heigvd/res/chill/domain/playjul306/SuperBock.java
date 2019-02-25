package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuperBock implements IProduct {

  public final static String NAME = "Super Bock";
  public final static BigDecimal PRICE = new BigDecimal(1.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
