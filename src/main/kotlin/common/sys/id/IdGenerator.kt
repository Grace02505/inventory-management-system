package common.sys.id



class IdGenerator : AbstractUUIDGenerator(), Configurable {

    private var code: String? = null
    private var type: String? = null

    @Throws(MappingException::class)
    fun configure(type: Type, properties: Properties, serviceRegistry: ServiceRegistry) {
        this.code = properties.getProperty("code")
        this.type = properties.getProperty("type")
    }

    @Throws(HibernateException::class)
    fun generate(sessionImplementor: SessionImplementor, o: Any): Serializable? {
        return if (code == null || code?.isEmpty()) {
            if (type == null) NoUtil.getAtuoId() else NoUtil.getNo()
        } else null
    }
}