package ch.heigvd.dai.chill.domain.p_gillet;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperMousseTest {

  @Test
  void thePriceAndNameForSuperMousseShouldBeCorrect() {
    SuperMousse beer = new SuperMousse();
    assertEquals(beer.getName(), SuperMousse.NAME);
    assertEquals(beer.getPrice(), SuperMousse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSuperMousse() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.p_gillet.SuperMousse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SuperMousse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
