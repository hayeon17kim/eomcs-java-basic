package com.eomcs.mybatis.ex03;

import java.util.List;

public interface BoardDao {
    List<Board> selectList();
    int insert(Board board);
}









