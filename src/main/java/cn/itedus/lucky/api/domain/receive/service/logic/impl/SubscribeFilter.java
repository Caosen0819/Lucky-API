package cn.itedus.lucky.api.domain.receive.service.logic.impl;

import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lucky.api.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * @description: 关注微信公众号
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {

    @Override
    public String filter(BehaviorMatter request) {
        return "感谢关注，快来回复抽奖，参与小傅哥的活动吧！";
    }

}
