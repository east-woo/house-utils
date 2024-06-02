package com.eastwoo.houseutils.policy;

import com.eastwoo.houseutils.constants.ActionType;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : BrokeragePolicyFactory
 * author         : dongwoo
 * date           : 2024-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT :
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("Unknown action type: " + actionType);
        }
    }
}
