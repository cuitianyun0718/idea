package com.itdr.test;

import java.sql.ResultSet;

/**
 * @Author:cty
 * @Date:2019/2/27 21:01
 * @Description:不负自己
 */
public interface RowMap<T> {
        public T RowMapping(ResultSet rs);

}
