
首先来看一下String中hashCode方法的实现源码  

```
public int hashCode() {
    int h = hash;
    if (h == 0 && value.length > 0) {
        char val[] = value;

        for (int i = 0; i < value.length; i++) {
            h = 31 * h + val[i];
        }
        hash = h;
    }
    return h;
}
```

在String类中有个私有实例字段hash表示该串的哈希值，在第一次调用hashCode方法时，字符串的哈希值被计算并且赋值给hash字段，之后再调用hashCode方法便可以直接取hash字段返回。

 

String类中的hashCode计算方法还是比较简单的，就是以31为权，每一位为字符的ASCII值进行运算，用自然溢出来等效取模。

哈希计算公式可以计为s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

关于为什么取31为权，可以参考[StackOverflow](https://stackoverflow.com/questions/299304/why-does-javas-hashcode-in-string-use-31-as-a-multiplier)上的这个问题

主要是因为31是一个奇质数，所以31*i=32*i-i=(i<<5)-i，这种位移与减法结合的计算相比一般的运算快很多。

 

字符串哈希可以做很多事情，通常是类似于字符串判判断相等。

但是仅仅依赖于哈希值来判断相等其实是不严谨的，除非能够保证不会有哈希冲突，通常这一点很难做到。

 

就拿jdk中String类的哈希方法来举例，字符串"gdejicbegh"与字符串"hgebcijedg"具有相同的hashCode()返回值-801038016，并且它们具有reverse的关系。这个例子说明了用jdk中默认的hashCode方法判断字符串相等或者字符串回文，都存在反例。

当然了 经典的 hash 算法这 一种，会在其他地方补充。