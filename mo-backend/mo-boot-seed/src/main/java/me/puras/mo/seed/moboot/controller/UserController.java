package me.puras.mo.seed.moboot.controller;

import me.puras.mo.seed.moboot.domain.User;
import me.puras.mo.seed.moboot.service.user.UserService;
import me.puras.common.json.Response;
import me.puras.common.json.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:he@puras.me">puras</a>
 * @version $Revision 1.0 $
 * Created On 2017-08-02 11:24
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Response<List<User>> list() {
        List<User> list = service.findAll();
        return ResponseHelper.createSuccessResponse(list);
    }
}
