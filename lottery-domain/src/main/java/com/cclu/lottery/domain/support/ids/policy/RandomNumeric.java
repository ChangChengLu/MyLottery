package com.cclu.lottery.domain.support.ids.policy;

import com.cclu.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @author ChangCheng Lu
 * @date 2023/11/7 16:08
 * @description 工具类生成 org.apache.commons.lang3.RandomStringUtils
 * @copyright ChangChengLu
 */
@Component
public class RandomNumeric implements IIdGenerator {
    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }
}
