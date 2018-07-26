package com.limitip.make.service.serviceImp;

import com.limitip.make.mapper.DoubanMovieMapper;
import com.limitip.make.pojo.DoubanMovie;
import com.limitip.make.pojo.DoubanMovieExample;
import com.limitip.make.pojo.User;
import com.limitip.make.service.DoubanMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoubanMovieServiceImpl implements DoubanMovieService {

    @Autowired
    DoubanMovieMapper doubanMovieMapper;


    @Override
    public List findByUser(User user, int status) {
        DoubanMovieExample ex = new DoubanMovieExample();
        DoubanMovieExample.Criteria criteria = ex.createCriteria();
        criteria.andUseridEqualTo(user.getId());
        criteria.andStatusEqualTo(status);
        return doubanMovieMapper.selectByExample(ex);
    }


    /**
     * 返回0表示已存在
     */
    @Override
    public int addDBMoive(DoubanMovie doubanMovie) {
        DoubanMovieExample ex = new DoubanMovieExample();
        DoubanMovieExample.Criteria criteria = ex.createCriteria();
        criteria.andTitleEqualTo(doubanMovie.getTitle());
        criteria.andUseridEqualTo(doubanMovie.getUserid());
        criteria.andStatusEqualTo(doubanMovie.getStatus());
        if (doubanMovieMapper.selectByExample(ex).size() > 0) {
            return 0;
        }
        return doubanMovieMapper.insertSelective(doubanMovie);
    }

    @Override
    public int deleteByUser(DoubanMovie doubanMovie, User user) {
        DoubanMovieExample ex = new DoubanMovieExample();
        DoubanMovieExample.Criteria criteria = ex.createCriteria();
        criteria.andUseridEqualTo(user.getId());
        criteria.andTitleEqualTo(doubanMovie.getTitle());
        criteria.andStatusEqualTo(doubanMovie.getStatus());
        return doubanMovieMapper.deleteByExample(ex);

    }

    @Override
    public int updateDBMovie(DoubanMovie doubanMovie, User user) {
        DoubanMovieExample ex = new DoubanMovieExample();
        DoubanMovieExample.Criteria criteria = ex.createCriteria();
        criteria.andUseridEqualTo(user.getId());
        criteria.andTitleEqualTo(doubanMovie.getTitle());
        return doubanMovieMapper.updateByExampleSelective(doubanMovie, ex);
    }

}
