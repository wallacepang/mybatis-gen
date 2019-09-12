# mybatis-gen
mybatis-generator 自动生成lombok注解、自动生成数据库字段注释

本代码并未把自定义插件代码使用独立的model编译，所以使用mybatis-generator-maven-plugin会报错

注意：

1、所有引用的外部jar包，必须指定依赖, 比如mysql驱动

   在generator之前，必须先生成jar并存放在本地仓库或私服

2、dependencies，每个依赖的jar必须指定version

3、如果generatorConfig.xml文件使用了自定义的插件，在指定依赖前，请先编译，确定生成了jar包（不然会报错提示无法初始化该对象）

4、如果generatorConfig.xml没有放在resources下，请指定generatorConfig.xml配置文件的路径
