package com.itdr.utils;

import java.sql.ResultSet;

/**
 * @Author:cty
 * @Date:2019/2/27 14:40
 * @Description:不负自己
 */
public interface RowMap<T> {
    public T Rowmapping (ResultSet rs);
}
