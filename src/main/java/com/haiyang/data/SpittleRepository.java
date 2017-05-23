package com.haiyang.data;


import spittr.Spittle;

import java.util.List;

/**
 * Created by hhy on 2017/5/19.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
