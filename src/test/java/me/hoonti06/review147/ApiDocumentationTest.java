package me.hoonti06.review147;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.hoonti06.review147.api.controller.UserController;
import me.hoonti06.review147.api.controller.UserControllerV1;
import me.hoonti06.review147.api.controller.api.controller.EnumViewController;
import me.hoonti06.review147.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {
        UserController.class,
        UserControllerV1.class,
        EnumViewController.class
})
@AutoConfigureRestDocs
public abstract class ApiDocumentationTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    // @Autowired
    @MockBean
    protected UserService userService;
}
