package com.cc.eldercare.service.impl;

import com.cc.eldercare.entity.Article;
import com.cc.eldercare.mapper.ArticleMapper;
import com.cc.eldercare.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
