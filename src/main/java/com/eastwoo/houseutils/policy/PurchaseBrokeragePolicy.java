package com.eastwoo.houseutils.policy;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : PurchaseBrokeragePolicy
 * author         : dongwoo
 * date           : 2024-06-03
 * description    : 매매일 때 중계 수수료를 계산해주는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
public class PurchaseBrokeragePolicy implements BrokeragePolicy {



    // 룰을 만들어주는 걸 만들어보자
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;
        if (price < 50_000_000) {
            rule = new BrokerageRule(0.6, 250_000L);
        } else if (price < 200_000_000) {
            rule = new BrokerageRule(0.5, 800_000L);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        } else if (price < 900_000_000) {
            rule = new BrokerageRule(0.5, null);
        } else {
            rule = new BrokerageRule(0.9, null);
        }
        return rule;
    }

}
