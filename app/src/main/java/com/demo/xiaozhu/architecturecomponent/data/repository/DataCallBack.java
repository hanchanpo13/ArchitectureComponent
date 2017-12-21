package com.demo.xiaozhu.architecturecomponent.data.repository;

/**
 * @Description:
 * @Author: fengzeyuan
 * @Date: 17/12/21 下午2:39
 * @Version: 1.0
 */
public interface DataCallBack<T> {
    void onDataBack(T t);
}
