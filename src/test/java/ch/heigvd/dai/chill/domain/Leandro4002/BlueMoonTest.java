package ch.heigvd.dai.chill.domain.Leandro4002;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlueMoonTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        BlueMoon beer = new BlueMoon();
        assertEquals(beer.getName(), BlueMoon.NAME);
        assertEquals(beer.getPrice(), BlueMoon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.Leandro4002.BlueMoon";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BlueMoon.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
