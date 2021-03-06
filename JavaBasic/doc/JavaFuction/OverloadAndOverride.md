## 如果在子类中定义某方法与其父类有相同的名称和参数，我们说该方法被重写 (Overriding)。  
如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型，则称为方法的重载 (Overloading)。本文介绍的是 Overload 和 Override 的区别。

Overload 是重载的意思，Override 是覆盖的意思，也就是重写。

* 重载 (Overload)  表示同一个类中可以有多个名称相同的方法，但这些方法的参数列表各不相同（即参数个数、类型或顺序不同）。  
* 重写 (Override)  表示子类中的方法可以与父类中的某个方法的名称 和参数完全相同，通过子类创建的实例对象调用这个方法时，将调用子类中的定义方法，这相当于把父类中定义的那 个完全相同的方法给覆盖了，这也是面向对象编程的多态性的一种表现。（备注：子类覆盖父类的方法时，只能比父类抛出更少的异常，或者是抛出父类抛出的异常 的子异常，因为子类可以解决父类的一些问题，不能比父类有更多的问题。子类方法的访问权限只能比父类的更大，不能更小。如果父类的方法 是 private 类型，那么，子类则不存在覆盖的限制，相当于子类中增加了一个全新的方法。）
至于 Overloaded 的方法是否可以改变返回值的类型这个问题，要看你倒底想问什么呢？这个题目很模糊。如果几个 Overloaded 的方法的参数列表不一样，它们的返回者类型当然也可以不一样。

但我估计你想问的问题是：如果两个方法的参数列表完全一样，是否可以让它们的返回值不同来实现重 载 Overload。这是不行的，我们可以用反证法来说明 这个问题，因为我们有时候调用一个方法时也可以不定义返回结果变量，即不要关心其返回结果，例如，我们调用map.remove(key) 方法时，虽 然 remove 方法有返回值，但是我们通常都不会定义接收返回结果的变量，这时候假设该类中有两个名称和参数列表完全相同的方法，仅仅是返回类型不 同，java就无法确定编程者倒底是想调用哪个方法了，因为它无法通过返回结果类型来判断。

### Override  可以翻译为覆盖，从字面就可以知道，它是覆盖了一个方法并 且对其重写，以求达到不同的作用。对我们来说最熟悉的覆盖就是对接口方法的实现，在接口中一般只是 对方法进行了声明，而我们在实现时，就需要实现接口声明的所有方法。除了这个典型的用法以外，我们在继承中也可能会在子类覆盖父类中的方法。在覆盖要注意 以下的几点：

覆盖的方法的标志必须要和被覆盖的方法的标志完全匹配，才能达到覆盖的效果；
覆盖的方法的返回值必须和被覆盖的方法的返回值一致；
覆盖的方法所抛出的异常必须和被覆盖方法的所抛出的异常一致，或者是其子类；
被覆盖的方法不能为 private，否则在其子类中只是新定义了一个方法，并没有对其进行覆盖。
### Overload  可以翻译为重载，它是指我们可以定义一些名称相同的方法，通过定义不同的输入参数来区分这些方法，然后再调用时，VM就会根据不同的参数样式，来选择合适的方法执行。在使用重载要注意以下的几点：

在使用重载时只能通过不同的参数样式。例如，不同的参数类型，不同的参数个数，不同的参数顺序（当然，同一方法内的几个参数类型必须不一样，例如可以是 fun(int,float)，但是不能为 fun(int,int)）；
不能通过访问权限、返回类型、抛出的异常进行重载；
方法的异常类型和数目不会对重载造成影响；
对于继承来说，如果某一方法在父类中是访问权限是 private，那么就不能在子类对其进行重载，如果定义的话，也只是定义了一个新方法，而不会达到重载的效果。
总之，重写 Overriding 是父类与子类之间多态性的一种表现，重载 Overloading 是一个类中多态性的一种表现。很重要的一点就是，Overloaded 的方法是可以改变返回值的类型。

另 外：在Java语言规范中，一个方法的特征仅包括方法的名字，参数的数目和种类，而不包括方法的返回类型，参数的名字以及所抛出来的异常。在Java编译 器检查方法的重载时，会根据这些条件判断两个方法是否是重载方法。但在Java编译器检查方法的置换时，则会进一步检查两个方法（分处超类型和子类型）的 返还类型和抛出的异常是否相同。