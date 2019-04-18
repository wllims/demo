package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping("selectAll")
    public Map selectAll(int page, int rows) {
        /*System.out.println(page);
        System.out.println(rows);
        System.out.println(bannerService.selectAllBanner(page, rows));*/
        Map map = bannerService.selectAllBanner(page, rows);
        return map;

    }

    @RequestMapping("insert")
    public Map insert(Banner banner, MultipartFile file) throws IOException {
        String uuid = UUID.randomUUID().toString();
        String s = uuid + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        file.transferTo(new File("D:\\web\\maven_springBoot\\cmfz_hjd\\src\\main\\webapp\\img\\" + s));
        banner.setImagePath(s);
        //SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        banner.setCreatDate(new Date());
        Map map = new HashMap();
        //System.out.println(banner);
        try {
            bannerService.insert(banner);
            map.put("flag", true);
        } catch (Exception e) {
            map.put("flag", false);
        }
        return map;
    }

    @RequestMapping("update")
    public Map update(Banner banner) {
        //System.out.println(banner);
        Map map = new HashMap();
        try {
            bannerService.update(banner);
            map.put("flag", true);
        } catch (Exception e) {
            map.put("flag", false);
        }
        return map;
    }

    @RequestMapping("delete")
    public Map delete(Banner banner) {
        Map map = new HashMap();
        try {
            bannerService.update(banner);
            map.put("flag", true);
        } catch (Exception e) {
            map.put("flag", false);
        }
        return map;
    }
}
