package org.chengbing.controller;

import org.chengbing.util.LanguageDetector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Harold澂冰
 * @Date: 2021/6/19 14:04
 */
@Controller
public class CategoryController {

    @Autowired
    LanguageDetector detector;

    @RequestMapping("talkBack")
    @ResponseBody
    public String talkBack(String input)
    {
        String dialog = detector.shouldUseDialog(input);
        if(dialog==null)
            dialog = detector.useRandomReply(input);
        return dialog;
    }
}
