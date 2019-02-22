package com.ofzc.common;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 已冻结
     */
    NOTVALID(402),

    /**
     * 未认证（签名错误）
     */
    UNAUTHORIZED(401),
    /**
     * 接口不存在
     */
    NOT_FOUND(404),
    /**
     * 访问被拒绝(没有权限)
     */
    ACCESS_IS_DENIED(403),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500),


    /** ================================== 业务code =============================  */


    /**
     * 积分不足
     */
    POINT_NOT_ENOUGH(1000),

    /**
     * 每日每车一次刷新机会已使用
     */
    EVERYDAY_REFRESHCAR_OPPORTUNITY_USED(1001),

    /**
     * 尚未通过企业认证不能发布车源
     */
    Enterprise_Audited_Not_Pass(1002);


    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
