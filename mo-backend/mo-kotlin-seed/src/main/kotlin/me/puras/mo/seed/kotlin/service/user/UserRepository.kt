package me.puras.mo.seed.kotlin.service.user

import me.puras.common.persistence.CrudRepository
import me.puras.mo.seed.kotlin.domain.User
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserRepository : CrudRepository<User>