package cn.itedus.lucky.api.domain.receive.service.engine;

import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 消息引擎接口
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
public interface Engine {

    /**
     * 过滤器
     * @param request       入参
     * @return              出参
     * @throws Exception    异常
     */
    String process(final BehaviorMatter request) throws Exception;

}
