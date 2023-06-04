package com.fabriciomuniz.playground

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource
import io.quarkus.panache.common.Page
import io.quarkus.panache.common.Sort
import io.quarkus.rest.data.panache.MethodProperties
import io.quarkus.rest.data.panache.ResourceProperties
import jakarta.persistence.*


@Entity(name = "avenger")
@Cacheable
open class Avenger : PanacheEntityBase() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open val id: Long? = null

    @Column(name = "character", nullable = false)
    open val character: String? = null

    @Column(name = "name", nullable = false)
    open val name: String? = null
}

@ResourceProperties(hal = true, path = "avengers")
interface AvengerResource : PanacheEntityResource<Avenger, Long> {
    @MethodProperties
    override fun list(page: Page, sort: Sort): List<Avenger>

    @MethodProperties(exposed = false)
    override fun delete(id: Long): Boolean
}

