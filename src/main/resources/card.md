## web manage部分
### 产品
* 相关表结构
> indiana.product 产品主表 \
  indiana.product_img 产品图片表
* 相关缓存
> yydb-product-map 更新产品信息会触发 \
  


* 注意细节
> 列表需要查询product_card表获取已售数量 \
  product/uploadImage 添加图文/删除图文
  删除/更新产品信息需要判断是否关联活动 \
  

### 商品
* 相关表结构
> indiana.goods 商品主表
* 相关缓存
> b2c-goods-map   更新goods, \
  b2c-goods-list-map 更新goods，删除goods \

### 订单
* 相关表结构
> indiana.order 订单主表 \
  indiana.user 用户表 \
  indiana.staff_info 内部员工信息表 \
  indiana.refund_record 退款记录表 \
* 相关缓存
> 暂无

### 卡密
* 相关表结构
> indiana.product_card 卡密主表
* 相关缓存
> 不涉及


## webservice部分
### 会员购买
* 相关表结构
> hc_user 
> hcwechatopenid
> hcdevicemember

* 相关缓存
> yydb-user-map 通过userid 获取对应User信息 \
> wx-unionmap 通过unionId 获取 openid \
> wx-openmap 通过openid获取HcUser \
> wx-muser-'openid' 通过openid获取MUser \
> b2c-client-videotype-map 通过clientType获取videoType \
> b2c-user-videotype-map 通过userId获取clienttype \
> b2c-goods-list-map key:goodsType,value:List<Goods>
> b2c-goods-map key:goodId ,value: Goods
> wechat-type-configs-'serverType'  配置缓存





### 我的订单
* 相关表结构
> order 订单主表
> unified_order_record 微信支付接口记录主表

* 相关缓存
> wechat-configs 
  *  ‘upgradeMode’ 升级状态               
  *  ‘service-white-unionids’ 服务白名单   
  *  ‘stop-servcie-tip’ 停止服务提示语句
  *  'b2c_pay_items'    应该是支付的模板，可以在数据库中配置
> b2c-goods-map \
> b2c-productstat-map key:left-'productId',value:数量 \
> b2c-prod-card-queue-map'productId'  cardId->ProductCard \
> b2c-productstat-map key: left-'productId', value: leftNum \
> b2c-productstat-'productId' 用作锁 \
> server_type_ws   b2c.users.whites 活动ID和用户在白名单内免支付 \
> yydb-order-map  key:orderId value:Order 订单缓存 

### 支付回调
* 相关表
> unified_order_record
> order 
> hcwechatopenid 
* 相关缓存
> b2c-productstat-map key: left-'productId', value: leftNum \
  支付成功后check 产品库存  \
>   


