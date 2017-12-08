package com.favorites.controller;

import com.favorites.domain.view.CollectSummary;
import com.favorites.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @PostMapping
    public void saveNotice(@RequestParam String collectId, @RequestParam String type, @RequestParam Long userId, @RequestParam String operId){
        noticeService.saveNotice(collectId,type,userId,operId);
    }

    @GetMapping("/getAll")
    public List<CollectSummary> getNoticeCollects(@RequestParam String type, @RequestParam Long userId, @RequestParam Pageable pageable){
       return noticeService.getNoticeCollects(type,userId,pageable);
    }
}
