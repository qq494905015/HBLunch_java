package com.hblunch.order.manual.dto;/**
 * Created by kong on 2017-11-01.
 */

import com.hblunch.base.BaseEntity;

import javax.persistence.Transient;

/**
 * <pre>
 *
 * </pre>
 *
 * @author kong@foresee.com.cn
 * @version 1.00.00
 *          <p>
 *          <pre>
 *          修改记录
 *             修改后版本:     修改人：  修改日期:     修改内容:
 *                   </pre>
 * @date 2017-11-01
 */
public class OrderChartDTO extends BaseEntity {
    @Transient
    private String totalOrderPrice; //营业额
    @Transient
    private String totalOrderCount;//订单数
    @Transient
    private String avgOrderPrice;//客单价
    @Transient
    private String menuName;//客单价


    public String getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(String totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public String getTotalOrderCount() {
        return totalOrderCount;
    }

    public void setTotalOrderCount(String totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
    }

    public String getAvgOrderPrice() {
        return avgOrderPrice;
    }

    public void setAvgOrderPrice(String avgOrderPrice) {
        this.avgOrderPrice = avgOrderPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
