package org.carbon.sample.heroku.web.message;

import org.carbon.web.annotation.Action;
import org.carbon.web.annotation.Controller;
import org.carbon.web.core.response.HtmlResponse;
import org.carbon.web.def.HttpMethod;

/**
 * @author Shota Oda 2017/02/12.
 */
@Controller
public class MessageController {

    @Action(url = "/message", method = HttpMethod.GET)
    public HtmlResponse messageGet() {
        return new HtmlResponse("/message/room");
    }
}
