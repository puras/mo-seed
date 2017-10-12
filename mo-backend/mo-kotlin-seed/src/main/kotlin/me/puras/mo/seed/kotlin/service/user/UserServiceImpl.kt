package me.puras.mo.seed.kotlin.service.user

import me.puras.common.persistence.CrudRepository
import me.puras.common.service.CrudServiceImpl
import me.puras.mo.seed.kotlin.domain.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(var repository: UserRepository) : CrudServiceImpl<User>(), UserService {
    override fun getRepository(): CrudRepository<User> {
        return repository
    }
}