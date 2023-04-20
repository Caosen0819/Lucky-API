package cn.itedus.lucky.api.domain.receive.service.engine;

import cn.itedus.lucky.api.domain.receive.service.logic.LogicFilter;
import cn.itedus.lucky.api.domain.receive.service.logic.impl.SubscribeFilter;
import cn.itedus.lucky.api.domain.receive.service.logic.impl.UnsubscribeFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 消息配置
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
public class EngineConfig {

    @Resource(name = "luckylogic")
    private LogicFilter LuckyLogicFilter;

    @Resource
    private SubscribeFilter subscribeFilter;

    @Resource
    private UnsubscribeFilter unsubscribeFilter;

    protected static Map<String, Map<String, LogicFilter>> logicFilterMap = new HashMap<>();

    @PostConstruct
    public void init() {

        logicFilterMap.put("text", new HashMap<String, LogicFilter>() {{
            put("Lucky", LuckyLogicFilter);
        }});

        logicFilterMap.put("event", new HashMap<String, LogicFilter>() {
            {
                put("subscribe", subscribeFilter);
                put("unsubscribe", unsubscribeFilter);
            }
        });
    }

}
