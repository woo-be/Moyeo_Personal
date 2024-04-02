package com.moyeo.service;

import com.moyeo.vo.ReviewBoard;
import java.util.List;

public interface ReviewBoardService {

  void add(ReviewBoard reviewBoard);

  List<ReviewBoard> list(int pageNo, int pageSize);
  ReviewBoard get(int reviewBoardId);
  int countAll();
}
