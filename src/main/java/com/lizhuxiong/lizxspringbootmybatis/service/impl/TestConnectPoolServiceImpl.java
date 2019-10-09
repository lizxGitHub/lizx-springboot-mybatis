package com.lizhuxiong.lizxspringbootmybatis.service.impl;

import com.lizhuxiong.lizxspringbootmybatis.dao.errorDataNMapper;
import com.lizhuxiong.lizxspringbootmybatis.model.errorDataNWithBLOBs;
import com.lizhuxiong.lizxspringbootmybatis.service.TestConnectPoolService;
import com.lizhuxiong.lizxspringbootmybatis.utils.LizxUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/24
 */
@Service
public class TestConnectPoolServiceImpl implements TestConnectPoolService {

    @Resource
    errorDataNMapper errorDataNMapper;

    @Override
    public int insertBatch() {
        List<errorDataNWithBLOBs> recordList = new ArrayList<>();
        /** 获取当前系统时间*/
        long startTime = System.currentTimeMillis();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateformat.format(startTime);
        System.out.println("start====================>>startTime" + dateStr);
        errorDataNWithBLOBs errorDataNWithBLOBs;
        int dataNum = 1; // 数据量
        int loopOld = dataNum / 10000; //理论循环次数
        int loopNew = 0; //考虑到有余数的情况的循环此时
        int yushu = dataNum % 10000; //5次
        if (yushu > 0) {
            loopNew = loopOld + 1;
        } else {
            loopNew = loopOld;
        }
        System.out.println("====================>>loopnew:" + loopNew);
        for (int i = 0; i < loopNew; i++) {
            System.out.println("====================>>loop:" + i);
            long startTimeS = System.currentTimeMillis();
            int lvalue = 10000 * i;
            int rvalue = 10000 * (i + 1);
            if (i == loopOld) {
                rvalue = 10000 * i + yushu;
            }
            for (int j = lvalue; j < rvalue; j++) {
                errorDataNWithBLOBs = new errorDataNWithBLOBs();
                errorDataNWithBLOBs.setFieldCol("xxxx");
                errorDataNWithBLOBs.setId(LizxUtils.creatUUID());
                errorDataNWithBLOBs.setFieldName("xxxx");
                errorDataNWithBLOBs.setTableRealName("xxxx");
                errorDataNWithBLOBs.setTableName("xxxx");
                errorDataNWithBLOBs.setCreateDate(new Date());
                errorDataNWithBLOBs.setTableHierarchy("xxxx");
                errorDataNWithBLOBs.setErrorData("xxxx");
                errorDataNWithBLOBs.setRuleStr("xxxx");
                errorDataNWithBLOBs.setDisposeFeedback("xxxx");
                errorDataNWithBLOBs.setOriginInfo("xxxx");
                errorDataNWithBLOBs.setPrimaryData("xxxx");
                recordList.add(errorDataNWithBLOBs);
            }
            errorDataNMapper.insertBatch(recordList);
            long endTime = System.currentTimeMillis();
            long usedTime = (endTime - startTimeS) / 1000;
            System.out.println("end====================>>endTime10000:" + usedTime);
            recordList.clear();
        }
        /**
         * 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数
         */
        long endTime = System.currentTimeMillis();
        System.out.println("end====================>>endTime:" + endTime);
        long usedTime = (endTime - startTime) / 1000;
        System.out.println("time====================>>usedTime:" + usedTime + "秒");
        return 0;
    }

    /**
     * @param
     * @return
     * @Title: 创建测试数据
     * @Description: TODO
     * @author com.mhout.lizx
     * @time 2019/9/24
     */
    private List<Map<String, Object>> creatData() {
        List<Map<String, Object>> lm = new ArrayList<>();
        int num = 10000;
        for (int i = 0; i < num; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("fieldLogId", "1111111111111");
            map.put("fieldCol", "xxxx");
            map.put("fieldName", "xxxx");
            map.put("tableRealName", "xxxxx");
            map.put("tableName", "xxxx");
            map.put("createDate", new Date());
            map.put("tableHierarchy", "xxxxx");
            map.put("errorData", "xxxxx");
            map.put("ruleStr", "xxxx");
            map.put("disposeFeedback", "xxxx");
            map.put("originInfo", "xxx");
            map.put("primaryData", "xxx");
            lm.add(map);
        }
        return lm;
    }


}
