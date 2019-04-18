package com.baizhi.service;

import com.baizhi.entity.Banner;

import java.util.Map;

public interface BannerService {
    Map selectAllBanner(int page, int rows);

    void insert(Banner banner);

    void update(Banner banner);
}
