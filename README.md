# 可靠事件系统（tevent）

## 简介
可靠事件系统，用于保证消息生产者的可靠消息投递             
client: 客户端，服务端连接管理和事务消息发送  
cluster: 集群策略和负载均衡    
common: 公用的代码      
registry: 注册中心，提供注册和自动发现  
rpc: 远程通讯框架，基于NIO  
server: 服务端，消息接受和代理发送，事务控制和事务状态回查  
store: 服务端的数据存储  
mq: 各类mq客户端，集成到应用  

## 架构图  
![架构图](https://github.com/beston123/tevent/blob/master/doc/Architecture.png)  

## 生产者事务消息  
![生产者事务消息](https://github.com/beston123/tevent/blob/master/doc/TransactionMessage.png)  
