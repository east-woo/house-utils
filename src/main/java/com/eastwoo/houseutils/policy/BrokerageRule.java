package com.eastwoo.houseutils.policy;

import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;

/**
 * packageName    : com.eastwoo.houseutils.policy
 * fileName       : BrokerageRule
 * author         : dongwoo
 * date           : 2024-06-03
 * description    : 가격이 특정 범위일 때 상한효율과 상한금액 가지는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03        dongwoo       최초 생성
 */
@AllArgsConstructor
public class BrokerageRule {
    private Double brokeragePercentage;

    @Nullable
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price){
        if(limitAmount == null){
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price) ,limitAmount);
    }

    private Long multiplyPercent(Long price){
        return Double.valueOf(Math.floor(brokeragePercentage / 100 * price)).longValue();
    }
}
