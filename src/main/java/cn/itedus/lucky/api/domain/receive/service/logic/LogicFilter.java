package cn.itedus.lucky.api.domain.receive.service.logic;

import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 逻辑接口
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
public interface LogicFilter {

    String filter(BehaviorMatter request);

}
