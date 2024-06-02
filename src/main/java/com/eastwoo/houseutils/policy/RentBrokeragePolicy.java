package com.eastwoo.houseutils.policy;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : PurchaseBrokeragePolicy
 * author         : dongwoo
 * date           : 2024-06-03
 * description    : 임대차일 때 중계 수수료를 계산해주는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
public class RentBrokeragePolicy implements BrokeragePolicy{

    // 룰을 만들어주는 걸 만들어보자
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;
        if (price < 50_000_000) {
            rule = new BrokerageRule(0.5, 200_000L);
        } else if (price < 100_000_000) {
            rule = new BrokerageRule(0.4, 300_000L);
        } else if (price < 300_000_000) {
            rule = new BrokerageRule(0.3, null);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        } else {
            rule = new BrokerageRule(0.8, null);
        }
        return rule;
    }

}
