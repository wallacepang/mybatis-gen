package com.wallace.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 收单交易表
 *
 * @author fengqingyang
 * @date   2019/09/12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransDO {
    /** 主键ID */
    private Long id;

    /** 订单号 */
    private String transNo;

    /** 终端号 */
    private String terminalId;

    /** 平台号 */
    private String platformNo;

    /** 映射平台号 */
    private String mappingPlatformNo;

    /** 映射终端号 */
    private String mappingTerminalId;

    /** 商户订单号 */
    private String transId;

    /** 订单金额(分) */
    private Long txnAmount;

    /** 交易类型 */
    private String txnType;

    /** 交易日期 */
    private Date tradeDate;

    /** 协议号 */
    private String agreementNo;

    /** 银行卡号 */
    private String bankCardNo;

    /** 证件号 */
    private String certificateNo;

    /** 证件类型 */
    private String certificateType;

    /** 持卡人姓名 */
    private String customerName;

    /** 银行预留手机号 */
    private String bankCardMobile;

    /** 支付方式 */
    private String payId;

    /** 客户端IP */
    private String ip;

    /** 买家 */
    private String buyerNo;

    /** 卖家 */
    private String sellerNo;

    /** 交易手续费 */
    private Long txnFee;

    /** 结算金额 */
    private Long settleAmt;

    /** 订单状态 */
    private String txnStatus;

    /** 提现标识 */
    private String withdrawFlag;

    /** 订单成功时间 */
    private Date successTime;

    /** 创建时间 */
    private Date createdAt;

    /** 创建人 */
    private String createdBy;

    /** 最后更新时间 */
    private Date updatedAt;

    /** 最后更新人 */
    private String updatedBy;

    /** 备注 */
    private String remark;

    /** 宝付订单号 */
    private String orderId;

    /** 登录号 */
    private String loginNo;

    /** 交易返回码 */
    private String respCode;

    /** 交易返回描述 */
    private String respMsg;

    /** 版本号 */
    private Long version;
}