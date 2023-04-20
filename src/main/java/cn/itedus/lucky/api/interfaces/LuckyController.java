package cn.itedus.lucky.api.interfaces;

import cn.itedus.lucky.api.domain.lucky.model.Prize;
import cn.itedus.lucky.api.domain.lucky.model.Strategy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 抽奖接口
 * @author: Lucky
 * @date: 2021/12/25
 * @github: Lucky
 * @Copyright: Lucky
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class LuckyController {

    /**
     * 作业
     * http://localhost:9001/api/queryPrizeList
     */
    @GetMapping(value = "queryPrizeList", produces = "application/json;charset=utf-8")
    public List<Prize> queryPrizeList() {

        List<Prize> list = new ArrayList<>();
        list.add(new Prize(new Strategy("MacBook Pro", "1%"), "#e9e8fe"));
        list.add(new Prize(new Strategy("iPhone 13", "8%"), "#b8c5f2"));
        list.add(new Prize(new Strategy("iPad", "11%"), "#e9e8fe"));
        list.add(new Prize(new Strategy("坚果投影仪", "25%"), "#b8c5f2"));
        list.add(new Prize(new Strategy("任天堂 Switch", "25%"), "#e9e8fe"));
        list.add(new Prize(new Strategy("HHKB 键盘", "30%"), "#b8c5f2"));

        return list;
    }

}
