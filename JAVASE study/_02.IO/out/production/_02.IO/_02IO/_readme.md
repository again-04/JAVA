# 字节输出流的换行和续写

- 字节输出流的换行只能直接输出一个'\r\n'。

- FileOutputStream类的构造方法中，append参数表示是否为续写，传入true时，直接在文档中存在的字后续写，否则会清空文档，如：`FileOutputStream fos2 = new FileOutputStream( "./src/_02IO/a.txt", true );`。