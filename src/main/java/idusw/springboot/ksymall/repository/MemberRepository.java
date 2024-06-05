package idusw.springboot.ksymall.repository;

import  idusw.springboot.ksymall.model.Member;

import java.util.List;

public interface MemberRepository {
    // C.R.U.D : Data Basic Operation
    // Create -> insert
    // Read -> select
    // Update -> update
    // Delete -> delete
    int insert(Member member);
    Member selectById(Member member); // identifier : 식별자
    List<Member> selectAll();
    int update(Member member);
    int delete(Member member);
    /*
    Member selectByEmail(Member member);
    List<Member> sort(String direction);
    List<Member> selectListByCondition(String condition, String direction);
     */
}