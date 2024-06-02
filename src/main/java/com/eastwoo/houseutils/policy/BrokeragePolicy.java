package com.eastwoo.houseutils.policy;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : BrokeragePolicy
 * author         : dongwoo
 * date           : 2024-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price) {
        // TODO : 가격을 받아서 중개수수료를 계산한다.
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
