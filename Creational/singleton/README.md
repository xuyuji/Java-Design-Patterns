# Singleton(单例模式)

## 饿汉单例

在类加载时就初始化单例。

- [HungerSingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/HungerSingleton.java)
- [HungerStaticSingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/HungerStaticSingleton.java)

### 优点

无线程安全问题

### 缺点

消耗内存

## 懒汉单例

在使用时再实例化

- [LazySingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/LazySingleton.java)

  普通的懒加载，不考虑线程安全问题。

  用于验证。见[ConcurrentTest.testDestroyLazySingleton()](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/test/java/org/xuyuji/pattern/singleton/ConcurrentTest.java)

- [LazyThreadSafeSingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/LazyThreadSafeSingleton.java)

  在LazySingleton基础上增加synchronized、volatile，保证线程安全。

  PS：创建类在底层有三步：1、分配地址 2、初始化 3、返回地址

  ​	编译期间可能因为指令重排导致2、3顺序颠倒，会出现对象引用不为null，但是内部没有初始化完成的情况。

  ​	故加上volatile关键字禁止指令重排。

- [DoubleLockingSingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/DoubleLockingSingleton.java)

  LazyThreadSafeSingleton每次获取单例都需要加锁，在初始化后这一处理没意义，平白增加资源消耗。

  因为增加双重判断加锁，外层判断单例是否已经初始化，内层判断保证初始化时的线程安全问题。

  性能比LazyThreadSafeSingleton高。

- [InnerClassSingleton](https://github.com/xuyuji/Java-Design-Patterns/blob/master/Creational/singleton/src/main/java/org/xuyuji/pattern/singleton/InnerClassSingleton.java)

  利用内部类初始化单例，这一过程由虚拟机来保证线程安全问题。

