# Hipeople 소개팅앱

 #### <img src="https://github.com/AnMyungwoo94/BeautyIdea_Shopping_App/assets/126849689/d0ba6eb9-f5c2-4839-ad30-6f8bf65c7452" alt="구글 플레이 이미지" width="20" height="20" style="float:left"> [구글플레이 스토어에서 다운로드 받기](https://play.google.com/store/apps/details?id=com.myungwoo.hipeople)

#### 프로젝트 소개 
```sh
"Hipeople"는 "Hi(안녕) 사람들"이라는 뜻이며, 사람들간의 소통을 도와주는 소개팅, 친목도모 앱입니다.
이 앱의 주요 목표는 사람들이 서로 소통하고 새로운 관계를 형성하는 것을 돕는 것입니다.
사용자들은 채팅, 그룹 대화, 익명 커뮤니티 포럼 등 다양한 방식으로 서로 소통할 수 있으며
특히, 익명성을 제공함으로써 사용자들이 자신의 생각과 감정을 자유롭게 표현할 수 있는 환경을 조성합니다.
```

#### 개발 환경
```sh
-운영체제 : Windows 10 home 64bit
-개발언어 : java – Java JDK 11.0.9
-개발 툴 / UI 설계 : Android Studio 3.5.3 
-DB 서버 구축 : FireBase
-형상관리 : GitHub
-API : noman.placesapi:placesAPI:1.1.3
```

#### DB 및 체크리스트
[hipeople DB.docx](https://github.com/AnMyungwoo94/Hipeople_App/files/13539174/hipeople.DB.docx)

[hipeople 체크리스트_안명우.docx](https://github.com/AnMyungwoo94/Hipeople_App/files/13539175/hipeople._.docx)


#### 맡은 역할
```sh
- 전체 UI 디자인 작업
- 채팅관련 (채팅창, 채팅목록) 화면 구현
- 회원정보 관리 화면 구현
- 이성추천 카드 화면 구현
```

#### 회고록 및 개선사항
```sh
팀 프로젝트 작업 기간 : 3월 20일 ~ 4월 10일
처음 진행해 본 팀프로젝트였다. 시간에 쫒겨 가장 편하고 빠른 방법으로 프로젝트를 진행하고자 했고,
여러가지 시행착오를 겪으면서 이를 통해 많은 것을 배우고 얻었다.

< 좋았던 점 >
1. 자유 주제로 팀원들과 같이 이야기하며 여러가지 주제를 놓고 의논하였다.
여러가지 주제에서 하나를 선정하기까지 각자의 생각을 나누며, 다양한 의견을 들어보고 말할 수 있어서 좋았다.

2. 여러가지 기술 학습
주제가 정해지면서 맡은 기술을 구현하기 위해 여러 정보를 찾아보았다.
이성추천 카드를 만들기 위해 어떻게 하면 사용자가 재미있게 할 수 있을지 생각해보고, 리사이클러뷰 + 카드뷰를 활용해서
직접 만들어볼 수 있었지만 더 다양한 기능을 제공하는 카드스텍뷰 라이브러리를 찾아서 적용시켜 보았다.
이 때 카드를 활용한 라이브러리도 정말 많다는 것을 깨달았고, 라이브러리는 언제 중단될지 모르니 사용시 대체할 수 있는
플랜B 를 찾아보고 적용하는게 좋겠다 라는 생각이 들었다.

3. 의사소통 능력
구현을 하면서 막혔던 부분이 있었다. 혼자서 해결해 보고 싶었지만 팀프로젝트의 기간은 정해져 있었기에 욕심을 버리고
팀원들에게 도움을 구하였다. 내가 구현하고 있는 코드였기에 해당 코드에 대해 설명해보면서 내 머릿속에서도 정리해볼 수 있었다.
또한, 도움을 구할때는 내가 해보았던 부분을 정확하게 이야기를 하고 오류가 나는 부분이 정확이 어디인지 알려주어야
다른 팀원들에게 빠르게 도움을 받을 수 있다는 것도 깨달을 수 있었다.

4. 많은 오류 경험
정말 많은 오류를 경험하고 해결하면서 중복되는 오류는 더 이상 구글링해서 찾아 보지 않아도 되어 시간을 줄일 수 있었다.


< 개선사항 >
1. 깃허브 협업경험을 하지 못하여 아쉬움이 남는다.
깃허브를 통해 각자의 브랜치를 생성, 코드리뷰, PR, 네이밍 컨벤션 정하기 등 팀원들끼리 같이 하지 못하였다.
아무래도 프로젝트 파일의 크기가 작아 알집으로 묶어서 서로 공유해도 충분했다고 생각했다.
다음 팀 프로젝트 때는 꼭 이러한 부분을 개선해야겠다.

2. 구현하고자 했던 페이지를 다 만들지 못했던 점
여러가지를 구현하고 싶었고, 그 대부분의 구현을 끝냈지만 그래도 구현이 남은 부분이 있다.
이 부분을 내가 따로 구현할 예정이다.

- 앱 배포하기 (9월 완료)
- 카드뷰 좋아요 내역 확인하기 (8/27 완료)
- 채팅방 알림 구현하기 (8/19 완료)
- 단체 채팅방 구현하기
- MBTI 유형별 검색기능 구현하기
- 채팅시 비속어, 성적단어 거르기
- 채팅시 이미지 첨부 가능하게 하기
```

### :memo:화면 설명
![Frame 4](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/0077e866-fc34-47ca-9574-f51fed5a645f)
![3  프로젝트 소개](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/d13dce5b-31e0-4e2f-959e-9bc06c893f96)
![4  프로젝트 소개](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/907f59ec-2972-4d7d-8877-2494ac6dae34)
![5   프로젝트 소개](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/8dc3bb1c-ba3a-4483-8ef5-ea70b956ee6e)
![6   프로젝트 소개](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/06ef1f0f-0643-4944-a35f-7a103af1e739)
![7   프로젝트 소개](https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/daadc4d3-b915-44b3-8b41-ed627c15a26d)


#### 동영상
https://github.com/AnMyungwoo94/Hipeople_App/assets/126849689/1760c682-1130-4567-b66e-c18c55252d3d


 

