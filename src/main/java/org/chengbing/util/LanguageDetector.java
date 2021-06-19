package org.chengbing.util;

import org.chengbing.entity.Dialog;
import org.chengbing.entity.NewSmsDownloadZh;
import org.chengbing.entity.OnlineShopping10Cats;
import org.chengbing.entity.WeiboSenti100k;
import org.chengbing.service.IDialogService;
import org.chengbing.service.INewSmsDownloadZhService;
import org.chengbing.service.IOnlineShopping10CatsService;
import org.chengbing.service.IWeiboSenti100kService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @Author: Harold澂冰
 * @Date: 2021/6/19 14:04
 */
@Component
public class LanguageDetector {

    @Autowired
    IDialogService dialogService;
    @Autowired
    INewSmsDownloadZhService newSmsDownloadZhService;
    @Autowired
    IOnlineShopping10CatsService onlineShopping10CatsService;
    @Autowired
    IWeiboSenti100kService weiboSenti100kService;

    public String shouldUseDialog(String question)
    {
        List<Dialog> questions = dialogService.list();
        for(Dialog dialog : questions)
        {
            if(dialog.getQuestion().contains(question) || question.contains(dialog.getQuestion()))
            {
                return dialog.getAnswer();
            }
        }
        return null;
    }

    public String useRandomReply(String question)
    {
        Random random = new Random();
        int index = random.nextInt(4);
        if(index == 1 || index == 0)
        {
            NewSmsDownloadZh news = newSmsDownloadZhService.selectRandom();
            return news.getContent();
        }
        if(index == 2)
        {
            OnlineShopping10Cats cats = onlineShopping10CatsService.selectRandom();
            return cats.getReview();
        }
        if(index == 3)
        {
            WeiboSenti100k weiboSenti100k = weiboSenti100kService.selectRandom();
            return weiboSenti100k.getReview();
        }
        return "别告诉我我们已经没话说了......";
    }
}
