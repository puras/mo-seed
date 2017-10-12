package me.puras.mo.seed.kotlin.controller

import me.puras.common.json.Response
import me.puras.common.json.ResponseHelper
import me.puras.common.util.ListSlice
import me.puras.common.util.Pagination
import me.puras.mo.seed.kotlin.domain.User
import me.puras.mo.seed.kotlin.service.user.UserService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(var service : UserService) : BaseController() {
    @GetMapping("/")
    fun sayHello(pagination : Pagination, model : Model) : Response<List<User>> {
        var slice : ListSlice<User> = service.findAll(getBounds(pagination))
        pagination.totalCount = slice.total
        return ResponseHelper.createSuccessResponse(slice.list)
    }
}