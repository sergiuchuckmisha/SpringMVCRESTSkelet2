package hw.controller;

import hw.domain.MyDataObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

/**
 * Handles and retrieves person request
 * Управляет и возвращает запрос
 */
@Controller
@RequestMapping("/myservice")
public class MainController {

//    @Resource(name="messageService")
//    private MessageService messageService;

    @RequestMapping(value= "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public MyDataObject getMyData(@PathVariable long time) {
        return new MyDataObject(Calendar.getInstance(), "Это ответ метода GET!");
    }


    /**
    * @return just some string
    */
    @RequestMapping(value = "/smth", method = RequestMethod.GET)
    @ResponseBody
    public String getSmth() {
        return "smth";
//        return messageService.getSmth();
    }


}
