package com.eastwoo.houseutils.controller;

import com.eastwoo.houseutils.constants.ActionType;
import com.eastwoo.houseutils.policy.BrokeragePolicy;
import com.eastwoo.houseutils.policy.BrokeragePolicyFactory;
import com.eastwoo.houseutils.policy.PurchaseBrokeragePolicy;
import com.eastwoo.houseutils.policy.RentBrokeragePolicy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        log.info("actionType: " + actionType);
        log.info(("price: " + price));

        // TODO:중개수수료 계산하는 로직
        BrokeragePolicy policy= BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
