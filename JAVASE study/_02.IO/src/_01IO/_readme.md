# IO流的体系和字节输出流基本用法

![、](C:\Users\周鹏\AppData\Roaming\Typora\typora-user-images\image-20240925215324479.png)



## 1.字节输出流的细节

```
FileOutputStream fos = new FileOutputStream( "./src/_01IO/a" );
```

### 1.1.创建字节输出流对象

- 当文件不存在时会创建一个新的文件，但是要保证父级路径存在。

- 文件存在时，则会清空文件。

### 1.2.写数据

- write方法的参数都是正数，但是写到文件中的是整数在ASCII码中对应的字符。

### 1.3.释放资源

- 每次使用完后需要释放资源，解除资源的占用

------



## 1.2.字节流写出数据的三种方式