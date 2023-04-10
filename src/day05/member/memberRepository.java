package day05.member;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

//역할: 회원저장소 역할(like 데이터저장소)
public class memberRepository {

    public static final int NOT_FOUND = -1; //psfi (단축키)
    member[] memberList;

    public memberRepository() {
        this.memberList = new member[3];
        memberList[0] = new member(1, "abc@def.com",
                "1234", "콩벌레",
                Gender.MALE, 50);
        memberList[1] = new member(2, "xxx@zzz.com",
                "9999", "팥죽이",
                Gender.FEMALE, 30);
        memberList[2] = new member(3, "hhh@qwe.com",
                "5678", "카레왕",
                Gender.FEMALE, 44);
    }


    //모든 회원의 정보를 출력해주는 메서드

    void showMembers() {
        System.out.printf("=====현재 회원 정보 (총%d명)=========", memberList.length);

        for (member m : memberList) {
            System.out.println(m.inform()); //inform이 자기 정보알려주는 얘

        }
    }

    //회원 가입 기능
    //@param1 - newMember: 새롭게 회원가입하는 회원의 정보
    //@return : 회원가입 성공 여부
    //            성공시 true, 이메일이 중복되어 실패시 false
    boolean addMember(member newMember) {
        //이메일이 중복인가?
        if (isDuplicateEmail(newMember.email)) return false;

        //실제로 멤버를 추가하는 코드
        member[] temp = new member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }

        //회원가입 시간 등록
        newMember.regDate = LocalDate.now();


        temp[temp.length - 1] = newMember;
        memberList = temp;

        //save 파일 생성
        try(FileWriter fw = new FileWriter("D:/exercise/member.txt")) {

            String saveInfo = "";
            saveInfo += newMember.memberId;
            saveInfo += newMember.email;
            saveInfo += newMember.memberName;
            saveInfo += newMember.password;
            saveInfo += newMember.gender;
            saveInfo += newMember.age;

            fw.append(saveInfo + "\n");


        } catch (IOException e) {
            System.out.println("파일 저장 실패!");
        } ;



        return true;

    }

    //이메일의 중복여부를 확인하는 기능
//    @param targetEmail: 검사 대상 메일
    //@return 중복되었을 시 true, 사용가능할 시 false

    public boolean isDuplicateEmail(String targetEmail) {
        for (member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    //이메일을 통해 특정회원 객체를 찾아서 반환하는 기능
//    @param email: 찾고싶은 회원의 이메일
//    @return: 찾은 회원의 객체정보, 못찾으면 null 반환
//
    member findByEmail(String email) {
        for (member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    public int getLastMemberId() {
        return memberList[memberList.length - 1].memberId;

    }

    /**
     *
     * @param email - 탐색대상의 이메일
     * @return: 찾아낸 인덱스, 못찾으면 -1 리턴
     */
    int findIndexByEmail(String email){
        for (int i = 0; i < memberList.length; i++) {
            if(memberList[i].email.equals(email))
                return i;
        }
        return NOT_FOUND;
    }

    void removeMemberViewProcedss(){

    }



    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email:       수정 대상의 이메일
     * @param newPassword: 변경할 새로운 비밀번호
     */
    Boolean changePassword(String email, String newPassword) {

        //인덱스 탐색
        int index = findIndexByEmail(email);

        //수정진행
        if(index == NOT_FOUND) return false;

        memberList[0].password = newPassword;
    return true;
    }

    void removeMember(String email){
        //인덱스 찾기
        int delIndex =findIndexByEmail(email);
        //앞으로 땡기기
    for(int i = delIndex; i<memberList.length-1; i++){
        memberList[i] = memberList[i+1];
    }
        //베열 마지막칸 없애기
        member[] temp = new member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }

    //멤버가 비었는지 확인
    boolean isEmpty(){
        return memberList.length==0;

    }


    }

