# 字符集详解

- GB 2312-80，简体汉字编码国家标准，收录了六千多个简体汉字。

- BIG5，台湾地区繁体汉字标准字符集，收录一万三千多个中文字。
- GBK，2000年发布，收录两万一千多个汉字，其中包括，GB13000-1中的全部中日韩汉字和BIG5中的所有汉字。

在windows系统中，简体中文系统默认使用GBK，繁体中文系统默认使用BIG5，韩文系统默认使用EUC-KR，日文系统默认使用Shift-JS，以上微软最后统称ANSI。

- Unicode字符集：国际标准字符集，将世界各种语言的每个字符定义为一个唯一的编码，以满足跨语言，跨平台的文本信息转化。

## ASCII字符集

用于存储英文，总共128个字符（0~127），存储一个字符只需要一个字节。



## GBK

- 英文字母用一个字节存储，GBK中完全兼容ASCII码。
- 汉字需要两个字节存储，第一个字节叫做高位字节，第二个字节叫做低位字节，高位字节二进制一定以1开头，转化为十进制之后一定是一个负数。 



## Unicode

- UTF就是Unicode Transfer Format的缩写
- UTF-8编码规则：用1~4个字节保存，ASCII内的英文字母一个字节，中文汉字三个字节表示。
- ![image-20240927141458667](C:\Users\周鹏\AppData\Roaming\Typora\typora-user-images\image-20240927141458667.png)
- UTF-16编码规则：通常使用16个比特位，用2~4个字节保存
- UTF-32编码规则：固定使用四个字节保存。



## 乱码

1. 读取数据时未读取完整个数字
2. 编码和解码的方式不统一。



## 编码和解码

Idea默认使用UTF-8字符集。

```
public byte[] getBytes()
public byte[] getBytes(String charsetName)

String(byte[] bytes)
String(byte[] bytes, String charsetName)
```

