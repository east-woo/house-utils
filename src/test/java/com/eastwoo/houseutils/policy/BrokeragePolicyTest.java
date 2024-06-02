package com.eastwoo.houseutils.policy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : BrokeragePolicyTest
 * author         : dongwoo
 * date           : 2024-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
public class BrokeragePolicyTest {
    PurchaseBrokeragePolicy purchaseBrokeragePolicy;
    RentBrokeragePolicy rentBrokeragePolicy;

    @BeforeEach
    public void setUp(){
        purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();
        rentBrokeragePolicy = new RentBrokeragePolicy();
    }
    @Test
    public void testPurchaseBrokeragePolicy(){
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calculate(30_000_000L),180_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calculate(100_000_000L),500_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calculate(500_000_000L),2_000_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calculate(800_000_000L),4_000_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calculate(1_000_000_000L),9_000_000L);
    }

    @Test
    public void testRentBrokeragePolicy(){
        Assertions.assertEquals(
                rentBrokeragePolicy.calculate(30_000_000L),150_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calculate(100_000_000L),300_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calculate(500_000_000L),2_000_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calculate(800_000_000L),4_000_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calculate(1_000_000_000L),9_000_000L);
    }

}
