package com.bootiful.ws;

import com.bootiful.framework.annotation.Logging;
import com.bootiful.framework.domain.User;
import com.bootiful.framework.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.bootiful.ws.BootifulWS")
public class BootifulWSImpl extends BaseEndpoint implements BootifulWS {

    @Autowired
    UserService userService;

    protected final Log LOG = LogFactory.getLog(BootifulWSImpl.class);

    @Logging(method = "USERS")
    public List<User> users() {

        return userService.findAll();

    }
}
