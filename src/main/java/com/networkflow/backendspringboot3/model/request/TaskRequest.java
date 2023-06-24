package com.networkflow.backendspringboot3.model.request;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class TaskRequest {
    private String taskId;
    private LocalDateTime createTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // mode: 0 为实时流量检测，1 为离线流量检测
    private Integer mode;
    // model: 检测模型
    private String model;
    // PCAP包存储位置
    private String pcapPath;
    // 正常数据包数
    private Integer normal;
    // 异常数据包数
    private Integer abnormal;
    // 总数据包数
    private Integer total;

    // status：0 未启动；1 等待解析中；2 正在解析和检测中；3 完成解析聚合，正在检测中；4 正在汇总中；5 已完成。
    private Integer status;

}
