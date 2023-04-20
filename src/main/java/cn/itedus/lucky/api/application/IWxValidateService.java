package cn.itedus.lucky.api.application;

/**
 * @description: 验证
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
public interface IWxValidateService {

    /**
     * 验签
     * @param signature 签名
     * @param timestamp 时间
     * @param nonce     当前
     * @return          结果
     */
    boolean checkSign(String signature, String timestamp, String nonce);

}
