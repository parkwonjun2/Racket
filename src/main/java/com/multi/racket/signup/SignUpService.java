package com.multi.racket.signup;

import com.multi.racket.domain.MemberDTO;

public interface SignUpService {
	public MemberDTO member_insert(MemberDTO member);
	public MemberDTO findMemberByMemberId(String memberId);
}
