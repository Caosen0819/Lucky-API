package cn.itedus.lucky.api.application;

import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 处理接收信息
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
public interface IWxReceiveService {

    /**
     * 接收信息
     *
     * @param behaviorMatter    入参
     * @return                  出惨
     * @throws Exception        异常
     */
    String doReceive(BehaviorMatter behaviorMatter) throws Exception;

}
