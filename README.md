项目结构图

|——stage-cloud————————	springcloud项目结构图
|		|
|		|
|		|—————stage-common	(公共)
|		|			|
|		|			|———————stage-common-core	公共类（统一CRUD抽象、基础Base封装，统一入参请求）
|		|			|
|		|			|———————stage-common-model	业务实体
|		|			|
|		|			|———————stage-common-util	查询、结果集、通用工具类
|		|
|		|						
|		|—————stage-provider	（业务）
|		|			|
|		|			|——————stage-provider-order	订单服务
|		|			|
|		|			|——————stage-provider-storage	库存
|		|			|
|		|			|——————stage-provider-user		用户
|		|
|		|—————stage-provider-api (Feign调用)
|		|			|
|		|			|——————stage-provider-user-api		user feign
|		|			|
|		|			|——————stage-provider-storage-api	storage-feign
|		|			|
|		|			|——————stage-provider-order-api		order-feign			
|		|	
|		|—————stage-server	（原生组件）
|		|			|
|		|			|——————server-seata	分布式事务
|		|			|
|		|			|——————server-eureka	注册中心
|		|
|		|