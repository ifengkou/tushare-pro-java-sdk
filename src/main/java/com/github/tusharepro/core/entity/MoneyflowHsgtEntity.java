package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.MoneyflowHsgt;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 沪深港通资金流向
 */
@Data
@Entity
@Table(name = "moneyflow_hsgt")
public class MoneyflowHsgtEntity implements MoneyflowHsgt {

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "ggt_ss") protected String ggtSs;  // 港股通（上海）
    @Column(name = "ggt_sz") protected String ggtSz;  // 港股通（深圳）
    @Column(name = "hgt") protected String hgt;  // 沪股通（百万元）
    @Column(name = "sgt") protected String sgt;  // 深股通（百万元）
    @Column(name = "north_money") protected String northMoney;  // 北向资金（百万元）
    @Column(name = "south_money") protected String southMoney;  // 南向资金（百万元）

}