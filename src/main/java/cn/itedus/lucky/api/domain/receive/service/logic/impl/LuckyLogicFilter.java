package cn.itedus.lucky.api.domain.receive.service.logic.impl;

import cn.itedus.lucky.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lucky.api.domain.receive.service.logic.LogicFilter;

import cn.sen.lucky.rpc.activity.booth.ILuckyActivityBooth;
import cn.sen.lucky.rpc.activity.booth.dto.AwardDTO;
import cn.sen.lucky.rpc.activity.booth.req.DrawReq;
import cn.sen.lucky.rpc.activity.booth.res.DrawRes;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @description: 抽奖服务
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
@Service("luckylogic")
public class LuckyLogicFilter implements LogicFilter {

    @DubboReference
    private ILuckyActivityBooth LuckyActivityBooth;

    @Override
    public String filter(BehaviorMatter request) {

        DrawReq drawReq = new DrawReq();
        drawReq.setuId(request.getOpenId().substring(1, 11));
        drawReq.setActivityId(100001L);

        DrawRes drawRes = LuckyActivityBooth.doDraw(drawReq);
        AwardDTO awardDTO = drawRes.getAwardDTO();

        if (!"0000".equals(drawRes.getCode())) {
            return "抽奖💐 提示：" + drawRes.getInfo();
        }

        return "恭喜💐 您已中奖：" + awardDTO.getAwardName() + " - Lucky 抽奖系统测试";
    }

}
