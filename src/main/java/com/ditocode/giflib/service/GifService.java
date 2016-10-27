package com.ditocode.giflib.service;

import com.ditocode.giflib.model.Gif;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by hector on 24/10/16.
 */
public interface GifService {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif, MultipartFile file);
    void delete(Gif gif);
    void toggleFavorite(Gif gif);

}
