## Scala与Java的关系

Scala与Java的关系是非常紧密的！！

因为Scala是基于Java虚拟机，也就是JVM的一门编程语言。所有Scala的代码，都需要经过编译为字节码，然后交由Java虚拟机来运行。

所以Scala和Java是可以无缝互操作的。Scala可以任意调用Java的代码。所以Scala与Java的关系是非常非常紧密的。

## 安装Scala

从Scala官方网站下载，http://www.scala-lang.org/download/，windows版本的安装包是scala-2.11.7.msi。
·使用下载下来的安装包安装Scala。
·在PATH环境变量中，配置$SCALA_HOME/bin目录。
·在windows命令行内即可直接键入scala，打开scala命令行，进行scala编程。

## Scala解释器的使用

·REPL：Read（取值）-> Evaluation（求值）-> Print（打印）-> Loop（循环）。scala解释器也被称为REPL，会快速编译scala代码为字节码，然后交给JVM来执行。
·计算表达式：在scala>命令行内，键入scala代码，解释器会直接返回结果给你。如果你没有指定变量来存放这个值，那么值默认的名称为res，而且会显示结果的数据类型，比如Int、Double、String等等。
    ·例如，输入1 + 1，会看到res0: Int = 2
·内置变量：在后面可以继续使用res这个变量，以及它存放的值。
    ·例如，2.0 * res0，返回res1: Double = 4.0
    ·例如，"Hi, " + res0，返回res2: String = Hi, 2
·自动补全：在scala>命令行内，可以使用Tab键进行自动补全。
    ·例如，输入res2.to，敲击Tab键，解释器会显示出以下选项，toCharArray，toLowerCase，toString，toUpperCase。因为此时无法判定你需要补全的是哪一个，因此会提供给你所有的选项。
    ·例如，输入res2.toU，敲击Tab键，直接会给你补全为res2.toUpperCase。

##  声明变量
·声明val变量：可以声明val变量来存放表达式的计算结果。
    ·例如，val result = 1 + 1
    ·后续这些常量是可以继续使用的，例如，2 * result
    ·但是常量声明后，是无法改变它的值的，例如，result = 1，会返回error: reassignment to val的错误信息。
·声明var变量：如果要声明值可以改变的引用，可以使用var变量。
    ·例如，val myresult = 1，myresult = 2
    ·但是在scala程序中，通常建议使用val，也就是常量，因此比如类似于spark的大型复杂系统中，需要大量的网络传输数据，如果使用var，可能会担心值被错误的更改。
    ·在Java的大型复杂系统的设计和开发中，也使用了类似的特性，我们通常会将传递给其他模块 / 组件 / 服务的对象，设计成不可变类（Immutable Class）。在里面也会使用java的常量定义，比如final，阻止变量的值被改变。从而提高系统的健壮性（robust，鲁棒性），和安全性。
·指定类型：无论声明val变量，还是声明var变量，都可以手动指定其类型，如果不指定的话，scala会自动根据值，进行类型的推断。
    ·例如，val name: String = null
    ·例如，val name: Any = "leo"
·声明多个变量：可以将多个变量放在一起进行声明。
    ·例如，val name1, name2:String = null
    ·例如，val num1, num2 = 100


## 数据类型与操作符

·基本数据类型：Byte、Char、Short、Int、Long、Float、Double、Boolean。
    ·乍一看与Java的基本数据类型的包装类型相同，但是scala没有基本数据类型与包装类型的概念，统一都是类。scala自己会负责基本数据类型和引用类型的转换操作。
    ·使用以上类型，直接就可以调用大量的函数，例如，1.toString()，1.to(10)。
·类型的加强版类型：scala使用很多加强类给数据类型增加了上百种增强的功能或函数。
    ·例如，String类通过StringOps类增强了大量的函数，"Hello".intersect(" World")。
    ·例如，Scala还提供了RichInt、RichDouble、RichChar等类型，RichInt就提供了to函数，1.to(10)，此处Int先隐式转换为RichInt，然后再调用其to函数
·基本操作符：scala的算术操作符与java的算术操作符也没有什么区别，比如+、-、*、/、%等，以及&、|、^、>>、<<等。
    ·但是，在scala中，这些操作符其实是数据类型的函数，比如1 + 1，可以写做1.+(1)
    ·例如，1.to(10)，又可以写做1 to 10
    ·scala中没有提供++、--操作符，我们只能使用+和-，比如counter = 1，counter++是错误的，必须写做counter += 1.

## 函数调用与apply()函数
·函数调用方式：在scala中，函数调用也很简单。
    ·例如，import scala.math._，sqrt(2)，pow(2, 4)，min(3, Pi)。
    ·不同的一点是，如果调用函数时，不需要传递参数，则scala允许调用函数时省略括号的，例如，"Hello World".distinct

·apply函数
    ·Scala中的apply函数是非常特殊的一种函数，在Scala的object中，可以声明apply函数。而使用“类名()”的形式，其实就是“类名.apply()”的一种缩写。通常使用这种方式来构造类的对象，而不是使用“new 类名()”的方式。
    ·例如，"Hello World"(6)，因为在StringOps类中有def apply(n: Int): Char的函数定义，所以"Hello World"(6)，实际上是"Hello World".apply(6)的缩写。
    ·例如，Array(1, 2, 3, 4)，实际上是用Array object的apply()函数来创建Array类的实例，也就是一个数组。


##  