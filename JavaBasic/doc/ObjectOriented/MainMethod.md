## 类的主函数 

## main函数
main函数也称为主函数 主函数是静态的，只能访问静态的成员 主函数是被虚拟机所调用的
public static void main(String[] args)
public:jvm调用的函数必须权限足够大，所以使用public修饰
static:主函数随着类加载，jvm丌需要创建该类对象就可以对该函数调 用，所以是静态
void:主函数没有返回值。返回给虚拟机是没有意义的
main:函数名，固定的，jvm认识。
(String[] args):主函数的参数列表，参数类型是:一个字符串数组类型 的参数
  
 main函数
如何向主函数传递参数?
 
