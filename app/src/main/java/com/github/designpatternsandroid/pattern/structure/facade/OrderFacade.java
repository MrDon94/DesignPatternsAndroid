package com.github.designpatternsandroid.pattern.structure.facade;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 订单处理系统的门面类
 * 门面模式：门面模式可以用来封装系统的底层实现，隐藏系统的复杂性，提供一组更加简单易用、更高层的接口。
 * 适用场景：解决易用性问题、解决性能问题、解决分布式事务问题
 * 和适配器模式的区别：
 *      适配器模式是做接口转换，解决的是原接口和目标接口不匹配的问题。
 *      门面模式是做接口整合，解决的是多接口调用带来的问题。
 * @date: 2024/7/25 11:20
 */
public class OrderFacade {
    private InventorySystem inventorySystem;
    private OrderProcessingSystem orderProcessingSystem;
    private PaymentSystem paymentSystem;

    public OrderFacade() {
        this.inventorySystem = new InventorySystem();
        this.orderProcessingSystem = new OrderProcessingSystem();
        this.paymentSystem = new PaymentSystem();
    }

    // 统一的订单处理方法
    public void placeOrder(String product, int quantity, String customer) {
        // 检查库存并更新
        inventorySystem.updateInventory(product, quantity);

        // 创建订单
        orderProcessingSystem.createOrder(product, quantity, customer);

        // 处理支付
        paymentSystem.processPayment(customer, calculateTotalPrice(product, quantity));
    }

    // 计算总价格的辅助方法
    private double calculateTotalPrice(String product, int quantity) {
        // 这里可以根据产品和数量计算出总价
        return 100.0; // 简化计算，实际根据需求实现
    }
}
