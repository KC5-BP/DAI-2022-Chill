package ch.heigvd.dai.chill.domain.hugoducom;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.hugoducom.Placebo;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaceboTest {

  @Test
  void thePriceAndNameForPlaceboShouldBeCorrect() {
    Placebo beer = new Placebo();
    assertEquals(beer.getName(), Placebo.NAME);
    assertEquals(beer.getPrice(), Placebo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPlacebo() {
    Bartender alexis = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.hugoducom.Placebo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = alexis.order(request);
    BigDecimal expectedTotalPrice = Placebo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
