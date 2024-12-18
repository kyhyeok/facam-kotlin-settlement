package com.kotlin.facamkotlinsettlement.domain.entity.order

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.ZonedDateTime

@Entity
data class OrderItemSnapshot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_snapshot_no") val id: Long,

    val createdAt: ZonedDateTime? = ZonedDateTime.now(),
    val updatedAt: ZonedDateTime? = ZonedDateTime.now(),
    val deletedAt: ZonedDateTime? = null,

    var productNo: Long,
    var sellerNo: Long,


    val sellPrice: BigDecimal? = BigDecimal.ZERO,
    val supplyPrice: BigDecimal? = BigDecimal.ZERO,
    val promotionAmount: BigDecimal? = BigDecimal.ZERO,
    val defaultDeliveryAmount: BigDecimal? = BigDecimal.valueOf(3000),


    var itemCategory: Int? = 0, // TODO: Enum으로 변경
    var taxRate: Int? = 3,
    var taxType: String = "TAX", // TODO: Enum으로 변경
)