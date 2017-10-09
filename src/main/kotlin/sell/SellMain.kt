package sell


@Entity
@Table(name = "t_sm_sellMain")
class SellMain (
        @Id
        @GenericGenerator(strategy = "common.sys.id.IdGenerator")
        private var id: Long? = null

        @Column(nullable = false, length = 32)
        private var tranNo: String? = null

        @Column(length = 32)
        private var oldTranNo: String? = null

        @Column(nullable = false, length = 2)
        private var tranType: String? = null //LS-TH

        @Column(length = 32)
        private var customer: String? = null

        @Column(nullable = false, length = 32)
        private var salesMan: String? = null

        @Column(nullable = false, length = 32)
        private var cashier: String? = null

        @Column(nullable = false, length = 32)
        private var operator: String? = null

        @Column(nullable = false, precision = 24, scale = 2)
        private var totalAmount = BigDecimal.ZERO

        @Column(nullable = false, precision = 24, scale = 2)
        private var totalPrice = BigDecimal.ZERO

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private var createTime: Date? = null

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private var paymentTime: Date? = null

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private var tranTime: Date? = null

        @Column(precision = 24, scale = 2)
        private var tranPriceAdded: Long = BigDecimal.ZERO

        @Column(length = 1)
        private var payType: String? = null

        @Column(length = 1)
        private var payState: String? = null

        @Column(length = 1)
        private var tranState: String? = null

        @Column(nullable = false, length = 32)
        private var storeId: String? = null

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "sellMain")
        private var sellList: List<SellList>? = null
)