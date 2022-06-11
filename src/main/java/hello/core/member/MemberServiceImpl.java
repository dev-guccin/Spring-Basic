package hello.core.member;

public class MemberServiceImpl implements MemberService{
    // MemberServiceImpl은 MemberRepository인 인터페이스를 의존한다.
    // 그러나 MemoryMemberRepository는 구현체임에도 의존하는 상황이 발생하여 DIP를 위배한다. 즉, 구현체가 구현체를 의존하는 상황
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
