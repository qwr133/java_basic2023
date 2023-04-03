package day05.member;

// 데이터처리는레파짓토리 담당
public class Test {

    public static void main(String[] args) {

        memberRepository mr = new memberRepository();


        member thief = new member(4, "uuu@eee.com",
                "3243", "밥도둑",
                Gender.MALE, 22);

        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();

        boolean flag = mr.isDuplicateEmail("uuu@eee.com");
        System.out.println("flag = " + flag);

        // 수정 테스트
        String targetEmail = "hhh@qwe.com";
        boolean updateFlag
                = mr.changePassword(targetEmail, "8888");

        if (updateFlag) {
            member updateMember = mr.findByEmail(targetEmail);
            System.out.println("updateMember = " + updateMember.password);
        } else {
            System.out.println("이메일이 잘못됨!");
        }

        mr.showMembers();
        mr.removeMember("abc@def.com");
    }
}
