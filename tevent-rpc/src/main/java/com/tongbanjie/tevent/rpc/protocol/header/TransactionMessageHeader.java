package com.tongbanjie.tevent.rpc.protocol.header;

import com.tongbanjie.tevent.common.message.MQType;
import com.tongbanjie.tevent.common.message.TransactionState;
import com.tongbanjie.tevent.rpc.exception.RpcCommandException;


/**
 * 事务消息请求 协议头 <p>
 * 〈功能详细描述〉
 *
 * @author zixiao
 * @date 16/9/28
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TransactionMessageHeader extends SendMessageHeader implements CustomHeader {

    private Long transactionId;

    private TransactionState transactionState;

    protected MQType mqType;

    @Override
    public void checkFields() throws RpcCommandException{
        if(transactionState == TransactionState.COMMIT || transactionState == TransactionState.ROLLBACK){
            if(transactionId == null){
                throw new RpcCommandException("TransactionId can not be null, when transactionType is " + transactionState);
            }
        }
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionState getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(TransactionState transactionState) {
        this.transactionState = transactionState;
    }

    @Override
    public MQType getMqType() {
        return mqType;
    }

    @Override
    public void setMqType(MQType mqType) {
        this.mqType = mqType;
    }

    @Override
    public String toString() {
        return "TransactionMessageHeader{" +
                "transactionId=" + transactionId +
                ", transactionState=" + transactionState +
                ", mqType=" + mqType +
                '}';
    }
}
