## 1.JS引入方式

- 内部脚本：将JS代码定义在HTML页面中
- - JS代码必须位于script标签之间
  - 在HTML文档中，可以在任意地点，放置任意数量的<script>
  - 一般会把脚本置于<body>元素的地步，可改善显示速度。

- 外部脚本：将JS代码定义在外部JS文件中，然后引入到HTML页面中

- - 外部JS文件中只包含JS代码，不包含<script>标签

  - <script>标签不能自闭合



## 2.输出语句

- window.alert()写入警告框
- document.write()写入HTML输出
- console.log()写入浏览器控制台



## 3.变量

- JS中可以用var关键字来声明变量，通过var声明的变量作用域较大，是全局变量，且变量名可以重复定义。
- JS是一门弱类型语言，变量可以存放不同类型的值
- 变量名需要遵循的规则：
- - 组成字符可以是任何字母、数字、下划线或者美元符号
  - 数字不能是开头
  - 建议使用驼峰命名法
- ECMAScript 6新增了let关键字来定义变量，它的用法类似于var，但是所声明的变量，只在let关键字所在的代码块内有效，且不允许重复定义。
- ECMAScript 6新增了const关键字，用来声明一个只读的常量，一旦声明，常量的值就不能更改。



## 4.数据类型

JS中分为原始类型和引用类型。

##### 原始类型：

- number：数字（整数、小数、NaN（Not a Number））
- string：字符串，单双引都可
- boolean：布尔，true，false
- null：对象为空
- undefined：当声明的变量未初始化时，该变量的默认值是undefined。



## 5.运算符

![image-20240928195401179](C:\Users\周鹏\AppData\Roaming\Typora\typora-user-images\image-20240928195401179.png)



## 6.函数

- JS中的函数通过function关键字来进行定义。
- 注意形参不需要类型，因为JS是弱类型语言，返回值也不需要类型，直接使用return就行。
- 调用：函数名（实参列表）

------



## 7.对象

### 1.Array数组

JS的Array对象用于定义数组。

```
// 定义，定义出来的数组长度可变，类型可变，可以存储不同类型的变量
var 变量名 = new Array(元素列表);
Var 变量名 = [元素列表]
// 访问
arr[索引] = 值
```

- 属性：length，设置或者返回数组中元素的数量
- 方法：forEach()，遍历数组中的每个有值的元素，并调用一次传入的函数
- 方法：push()，将新元素添加到数组的末尾，并返回新的长度
- 方法：splice()，从数组中删除元素，参数为起始下标和删除的元素个数



### 2.String

```
// String的创建方式有两种
var 变量名 = new String("-");
var 变量名 = "-";
```

- 属性：length，字符串长度
- 方法：charAt()，返回指定位置的字符
- 方法：indexOf()，检索字符串
- 方法：trim()，去除字符串两边的空格
- 方法：substring()，提取字符串中两个指定索引号之间的字符，含头不含尾

------



### 3.JSON

- JSON就是通过JS对象标记法书写的文本。
- 由于其语法简单，层次结构鲜明，现多用于数据载体，在网络中进行数据传输。
- JSON数据以键值对的形式存在，多个键值对之间用逗号隔开，键值对的键和值之间用冒号连接，如：{"name":"admin","age":18}
- 

#### JSON的基础语法

key必须在双引号内。

value的数据类型为数字和逻辑值、null时，不需要双引号，为字符串时，需要在双引号中，为数组时，需要在方括号内，为对象时，需要在花括号内。



#### JSON与JS对象的转化

##### JSON字符串转化为JS对象

```
var jsObject = JSON.parse(userStr);
```

##### JS对象转化为JSON字符串

```
var jsonStr = JSON.stringify(jsObject);
```



### 4.BOM

BOM是浏览器对象模型，允许JS与浏览器对话，JS将浏览器的各个组成部分封装为对象：

- Window：浏览器窗口对象
- Navigator：浏览器对象
- Screen：屏幕对象
- History：历史记录对象
- Location：地址栏对象



#### 4.1.Window

属性：

- history：对History对象的只读引用
- Location：用于窗口或框架的Location对象
- navigator：对于Navigator对象的只读引用

方法：

- alert()：显示带有一段消息和一个确认按钮的警告框。
- confirm()：显示带有一段消息以及确认按钮和取消按钮的对话框。
- setInterval()：按照指定周期（毫秒）来调用函数或计算表达式，总共两个参数，第一个参数是需要执行的函数或计算表达式，第二个是时间长短。
- setTimeout()：在指定的毫秒数后调用函数或计算表达式，参数和setInterval()一致。



### 5.DOM