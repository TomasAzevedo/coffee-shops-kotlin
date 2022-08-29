package com.first.kotlin.infrastructure.repository

import com.first.kotlin.model.CoffeeShop
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeShopRepository : CrudRepository<CoffeeShop, Long> {
}
