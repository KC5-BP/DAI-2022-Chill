package ch.heigvd.dai.chill.domain.mromano;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliriumTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Delirium beer = new Delirium();
        assertEquals(beer.getName(), Delirium.NAME);
        assertEquals(beer.getPrice(), Delirium.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.mromano.Delirium";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Delirium.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
