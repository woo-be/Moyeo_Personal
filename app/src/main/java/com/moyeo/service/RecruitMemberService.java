package com.moyeo.service;

import com.moyeo.vo.RecruitMember;
import java.util.List;

public interface RecruitMemberService {

  void add(int recruitBoardId, int memberId); // 모집 신청하기

  void delete(int recruitBoardId, int memberId); // 모집 신청 취소하기

  RecruitMember findBy(int memberId, int recruitBoardId);

  List<RecruitMember> findAllApplicant(int recruitBoardId);
}
