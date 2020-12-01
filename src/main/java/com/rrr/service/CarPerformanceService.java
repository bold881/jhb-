package com.rrr.service;

import com.rrr.model.CarPerformance;

import java.util.List;

/**
 * @author daifeng
 */
public interface CarPerformanceService {

    /**
     * 获取所有的指标名称
     * @return 指标名称列表，不重复
     */
    List<String> getCarIndexNames();

    /**
     * 添加指标名称
     * @param carIdxName 指标名称
     * @param carServiceName 竞品车系名称
     * @param carIdxValue 指标值
     * @return
     */
    List<CarPerformance> addPerformanceIdx(String carIdxName, String carServiceName, String carIdxValue);
}
