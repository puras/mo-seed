package me.puras.mo.seed.moboot.controller;

import me.puras.common.json.Response;
import me.puras.common.json.ResponseHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:he@puras.me">puras</a>
 * @version $Revision 1.0 $
 * Created On 2017-08-02 10:31
 */
@RestController
@RequestMapping("demos")
public class DemoController {
    @RequestMapping
    public Response sayHello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return ResponseHelper.createSuccessResponse("Hello " + name);
    }
}
