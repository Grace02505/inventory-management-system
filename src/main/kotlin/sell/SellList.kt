package sell

@Entity
@Table(name = "t_sm_sellList")
class SellList (
        @Id
        @GenericGenerator(strategy = "common.sys.id.IdGenerator")
        private var id: String? = null

        @Column(nullable = false, length = 32)
        private var fkTranNo: String? = null

        @Column(nullable = fale, length = 32)
        private var goodsId: String? = null

        @Column(nullable = false, precision = 24, scale = 2)
        private var priceRetail = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var tranAmount = BigDecimal.ZERO

        @Column(precision = 24, scale = 2)
        private var tranPriceAdded = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var costPrice = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var rebate = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var discount = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var subtotal = BigDecimal.ZERO

        @Column(nullable = false, length = 32)
        private var supplierId: String? = null

        @Column(name = "in_tax")
        private var inTax = BigDecimal.ZERO

        @Column(name = "out_tax")
        private var outTax = BigDecimal.ZERO

        @Column(name = "is_expire", nullable = false)
        private var isExpire = "N"[0]

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @Column(name = "product_date", length = 32)
        private var productDate: Date? = null

        @Column(name = "expire_type")
        private var expireType: Char = ' '

        @Column(name = "expire_range")
        private var expireRange: Int = 0

        @Column(length = 1)
        private var expireRangeUnit: Char = ' '

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @Column(name = "expire_date", length = 25)
        private var expireDate: Date? = null

        @Column(nullable = false, length = 1)
        private var isSn = "N"[0]

        @ManyToOne(optional = false)
        private var sellMain: SellMain? = null

)