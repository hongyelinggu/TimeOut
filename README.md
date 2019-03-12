# LG Android倒计时封装API 

标签： Androi倒计时

---

### 1. 简述

该包封装android开发过程中常常用到的倒计时



### 2. 如何快速使用

导入蓝牙开发包 ![此处输入图片的描述][1]

示例：

```
//Gradle
--------------------------------------------------
compile 'com.chaoqianhong.TimeOut:timetasklibrary:1.0.0'
============================

Maven
--------------------------------------------------
<dependency>
  <groupId>com.chaoqianhong.TimeOut</groupId>
  <artifactId>timetasklibrary</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

### 3. 初始封装组件

```
 CountDownTimerHY.startCount(1, 1000, new TimeListener.CountDownListener() {
            @Override
            public void countTimeEnd(int tag) {
                //记时结束
            }
        });
//或者
        HandlerDownTimerHY handlerDownTimerHY = new HandlerDownTimerHY(1000, new TimeListener.HandlerDownListener() {
            @Override
            public void countTimeEnd() {
                //记时结束
            }
        });
        
        
```
以上方法均提供计时终止方法
```
CountDownTimerHY.stopCount();
//或
 handlerDownTimerHY.stopTime();
```

### 5.方法概要

| 限定符和类型 |  方法和说明 |
| --------   | -----  |
|startCount(int TaskTag, long millisInFuture, TimeListener.CountDownListener downTimeListener) |启动计时器 |
|stopCount(int TaskTag) |终止计时器 |

//或

| 限定符和类型 |  方法和说明 |
| --------   | -----  |
|startTime() |启动计时器 |
|stopTime() |终止计时器 |



更多信息请下载文档查看[帮助文档API][2]


  [1]: https://img.shields.io/badge/%20Gradle-V%201.0.0-brightgreen.svg
  [2]: https://download.csdn.net/download/male09/11013717
