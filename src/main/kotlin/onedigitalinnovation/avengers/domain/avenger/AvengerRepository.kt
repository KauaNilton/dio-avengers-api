package onedigitalinnovation.avengers.domain.avenger

interface AvengerRepository {
    fun getDatail(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger): Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger): Avenger
}