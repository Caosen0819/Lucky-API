package cn.itedus.lucky.api.domain.receive.service;

import cn.itedus.lucky.api.application.IWxReceiveService;
import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lucky.api.domain.receive.service.engine.Engine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 处理接收信息
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
@Service
public class WxReceiveServiceImpl implements IWxReceiveService {

    @Resource(name = "msgEngineHandle")
    private Engine msgEngineHandle;

    @Override
    public String doReceive(BehaviorMatter behaviorMatter) throws Exception {
        return msgEngineHandle.process(behaviorMatter);
    }

}
