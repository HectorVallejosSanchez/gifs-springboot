package com.ditocode.giflib.dao;

import com.ditocode.giflib.model.Gif;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by hector on 24/10/16.
 */
public interface GifDao {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif);
    void delete(Gif gif);
}
