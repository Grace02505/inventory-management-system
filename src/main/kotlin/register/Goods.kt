package module

import javax.persistence.*

/**
 * Created by zhanxd on 2017-10-09.
 */

@Entity
@Table(name="t_sm_reg_goods")
class Goods (
        private var number: String,
        private var code: String,
        private var salesCode: String,
        private var goodsName: String,
        private var registerTime: java.util.Date,
        private var isSerial: Char,
        private var serialNumber: String,
        private var goodsCategory: String,
        private var goodsState: Char,
        private var isExpired: Char,
        private var overDate: java.util.Date,
        private var isInputTax: Char,
        private var isOutputTax: Char,
        private var inputTax: java.math.BigDecimal = java.math.BigDecimal.ZERO,
        private var outputTax: java.math.BigDecimal = java.math.BigDecimal.ZERO,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @GenericGenerator(strategy = "common.sys.id.IdGenerator")
        private var id:Long
)

{

}

