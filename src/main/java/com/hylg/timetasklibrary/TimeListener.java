package com.hylg.timetasklibrary;

/**
 * 创建时间 ：2017/10/9.
 * 作者 ：红叶岭谷
 * 倒计时回调方法
 */
public class TimeListener {
    public interface CountDownListener {
        /**
         * 计时时间到
         *
         * @param tag 返回计时时间的唯一识别号
         */
        void countTimeEnd(int tag);
    }
    public interface HandlerDownListener{
        /**
         * 计时时间到
         */
        void countTimeEnd();
    }
}
