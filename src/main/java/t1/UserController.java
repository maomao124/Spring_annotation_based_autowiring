package t1;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Project name(项目名称)：Spring基于注解的自动装配
 * Package(包名): t1
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class UserController
{
    @Resource
    private UserService userService;

    public UserService getUserService()
    {
        return userService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    public void doStr()
    {
        userService.out();
        System.out.println("UserController");
    }
}
