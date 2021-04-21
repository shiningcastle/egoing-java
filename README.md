---

### 🏙️ 살다 아파트 입주예약 시스템

---

> **🙋🏻‍♂️ 개발자 : 권희성**
> **📆 소요기간 : 4일**

---

## :speech_balloon: 입주예약 시스템 설명

<br>

<iframe width="640" height="360" src="https://youtu.be/0iiAOEoLz_0" frameborder="0" gesture="media" allowfullscreen=""></iframe>

<br>

---

#### 1. 구조

1. DB [사용스택 : MySQL] <br>

  - ![MySQL ERD](https://user-images.githubusercontent.com/54968463/115487573-f2a93600-a293-11eb-99bd-42a9a6b1b7b9.PNG) <br>


2. Spring (src/main/java/heeseong/) [사용스택 : Spring Boot, Spring Batch, Maven] <br>

  - batch/ApartmentProcessor.java <br>
  : ItemReader로 읽어 온 배치 데이터를 변환하는 역할. <br>
    읽어온 배치 데이터와 씌여질 데이터의 타입이 다를 경우에 대응. <br>
      
  - configuration/ApartmentBatchConfig.java <br>
  : Batch에 필요한 ItemReader, Job, Step, Writer 등 구현. <br>
    
  - controller/MovingReceiptController.java <br>
  : MVC 디자인 패턴에서 Controller 역할. <br>
    모든 View(Vue.js)의 요청을 받고 Model과 View를 제어. <br>
    
  - service/MovingReceiptService.java, MovingReceiptServiceImpl.java  <br>
  : MVC 디자인 패턴에서 Model 역할. 비즈니스 로직 처리. <br>
    
  - entitity/Apartment.java, MovingReceipt.java <br>
  : JPA에서 테이블에 대응하는 하나의 클래스. <br>
    (Apartment는 아파트 정보 테이블, MovingReceipt는 예약 정보 테이블) <br>
      
  - dto/ReservationDto.java, Confirmation.java <br>
  : MVC 디자인 패턴에서 Model 역할. <br>
      View, Controller, Service가 서로 정보 교환을 위한 객체. <br>
      각 상황에서 필요한 요소들만 Dto로 정의해서 사용. <br>
    
  - repository/ApartmentRepository.java, MovingReceiptRepository.java <br>
  : DB와 필요 정보를 교환하는 인터페이스.  <br>
  

3. Vue.js [사용스택 : Vue CLI, ESLint & Prettier, Buefy] <br>

  - 
  
  
---

#### 2. HOME

---

1. 사이트 목적 및 취지 소개

2. 팀원 찾기 및 모집글 페이지 이동 버튼

3. 오른쪽 상단 로그인 / 회원가입

---

#### 3. 프로필

---

1. 프로젝트를 구하는 타 유저들의 정보를 보고 팀원으로 추가

2. 지역 및 포지션에 따른 필터링 기능 (DROP DOWN)

3. 기술 검색 기능
 
4. 로그인을 하지않고 유저 클릭 시, 로그인 페이지 이동
 
5. 유저 클릭 시, 조회 가능
    - 유저 정보
    - 포트폴리오
    - 해당 유저가 작성한 모집글 및 트래킹

---

#### 4. 이주의 멘토

---

1. 일주일에 한번 업계에 몸담은 멘토를 초빙해 온라인으로 만날 수 있는 기회 제공

2. 그 주에 해당하는 멘토에 대한 소개 페이지

3. 강연을 듣고, 질문 시간에 프로젝트에 대한 조언을 구할수 있음

---
#### 5. 프로젝트

---

1. 프로젝트 모집

    - 지역 및 카테고리에 따른 필터링 기능 (DROP DOWN)
    - 프로젝트 타이틀 검색 기능
    - 모집글 클릭 시, 본인이 작성한 글이면 '지원하기'버튼이 보이지 않음
    - 모집글 클릭시, 본인이 지원한 글이면 지원했다는 메세지가 뜸
    - '지원하기'버튼 클릭해 각오 한마디 작성 및 포지션 선택 후 지원 완료 시, 메인페이지 이동
    

2. 프로젝트 트래커

    - 카테고리에 따른 필터링 기능
    - 프로젝트 타이틀 검색 기능
    - 트래커 글 클릭 시, 본인이 작성한 글이면 본인의 글 임을 알리는 Notification 뜨도록 설정
    - 타 유저들과의  활발한 소통을 위한 댓글 기능
    - 작성된 tracking 글에 좋아요 기능 (프로젝트의 인기도) 및 이를 이용한 스크랩 기능 추가 예정


---
#### 6. 마이페이지

---

1. 마이페이지

 * 유저 정보
        - 내가 설정한 유저 정보 조회
        - 정보 수정 및 회원 탈퇴 기능
        
 * 포트폴리오 관리
       - 포트폴리오 제목 클릭시 상세 정보 조회 가능
       - 이곳에 적은 포트폴리오는 타 유저가 프로필 페이지에서 내 정보 클릭시 조회 가능
       
 * 프로젝트 관리
      - 프로젝트 제목 클릭시 프로젝트 상세 페이지로 이동
      - 지원 현황의 '지원자'클릭해 현재 지원자 목록 조회 가능<br>
           1. 수락 및 거절 선택 해 프로젝트 참여자 선정 기능<br>
           2. 처음 내가 설정한 모집 인원 수 만큼 수락하면 프로젝트 트래커글 작성 가능하다는 Notification과 함께 버튼을 클릭해 트래커 작성 페이지 이동 <br>
           3. 프로젝트 모집글의 정보를 기반으로 프로젝트 트래커글 작성됨과 동시에 모집글은 모집완료로 설정되어 프로젝트 모집글 조회에서는 조회불가  <br>

2. 모집글 작성
    - 작성 완료 후, 마이페이지 및 프로젝트 모집에서 조회 가능

3. 포트폴리오 작성
    - 작성 완료 후, 마이페이지에서 조회 가능
    - Title 선택시 상세페이지 이동
    - 이동시 본인 글에만 수정 버튼 생성
    - 삭제 기능


4. 로그아웃

---
#### 7. 포트폴리오

---

1. 특정 ID로 로그인 후, 마이페이지에서 포트폴리오를 작성할 수 있음
    - 마이페이지 이동
    - 포트폴리오 작성
 
2. 포트폴리오를 작성하면 마이페이지 메뉴에서 작성한 포트폴리오를 조회할 수 있음 
    - 마이페이지 이동
    - 포트폴리오 관리 탭으로 이동
  
3. 특정 포트폴리오의 제목을 클릭하면 프로젝트 설명과 참여도, 관련 링크 등을 확인할 수 있음
    - 특정 포트폴리오의 제목을 클릭
    - 포트폴리오 항목에서 작성된 여러 내용들을 확인
   
4. 포트폴리오 관리 탭에서는 로그인한 유저의 포트폴리오를 수정 및 삭제를 처리할 수 있음

5. 다른 사용자가 작성한 포트폴리오를 조회하고 싶으면 상단의 프로필 메뉴에서 확인하는 것이 가능함
    - 프로필 메뉴로 이동
    - 조회를 하고 싶은 사용자의 유저 ID를 클릭

---

## :wrench: Project Setup

---

#### 1. 사용한 Spring Boot 2.3.8.RELEASE Dependencies 

---
[참조] Spring Boot + Vue CLI 3.0 프로젝트 구성하기 | Mr.spock(https://mr-spock.tistory.com/3)
<br>
* Lombok
* Oracle Driver
* Spring Boot DevTools
* Spring Data JPA
* Spring Web


---

#### 2. 개발환경

---
1. Front End
* Bootstrap
* Buefy | 0.9.4
* CSS
* JS
* HTML

2. Back End
* node.js | v14.15.4
* npm | 6.14.11
* axios | 0.21.1
* vue | 2.6.11
* vue-axios | 3.4.5
* vue-router | 3.2.0
* vue-session | 1.0.0
* vuex | 3.4.0

* babel-eslint | 10.1.0
* eslint | 6.7.2
* prettier | 1.19.1

3. Configuration Management
* Github
* Github Desktop


---

## :thumbsup: 구현 과정 - 깃허브 프로젝트 기능 이용

---

![todo](https://user-images.githubusercontent.com/73862504/108649430-a72b1380-7500-11eb-859b-9c0ddf2a4628.PNG)

---

## 💡 Technologies Used

---

![used](https://user-images.githubusercontent.com/73862504/108652398-5ff45100-7507-11eb-8d0d-a83bdae2bfb9.png)

---

## :eyes: ERD Structure

---

![erd](https://user-images.githubusercontent.com/73862504/108644701-81e3d880-74f3-11eb-8127-6a360b40cd0f.PNG)
<br><br>

**테이블 구조 특징**
프로젝트 모집글이 작성 되고, 같은 프로젝트에 대한 프로젝트 트래킹 글을 생성하기 위해 중간에 프로젝트 테이블에서 각각의 id를 Join 했습니다.

---

## :fire: ISSUE

---

#### 1. 협업과 GitHub

---

GitHub Organization 활용으로 main repository 와 backup repository를 생성하여 main repository에 프로젝트 공통 코드를 기반으로한 구조적 설계를 마치고 각 팀원들이 branch를 생성하여 본인의 branch에서 작업하고 commit을 하였습니다. 그리고 메인으로 commit을 할때는 서로와 소통 후 conflict가 안생기는것을 확인 후 merge를 시도했습니다. 
컨플릭트의 수는 현저히 줄어들었지만 매번 확인하는 작업에는 시간이 소모되었습니다.
백업 리포지토리에 이슈가 없는 코드를 백업해두는 작업을 하였습니다. 
Vue.js로 작업하는 프로젝트 구조에서는 node modules를 gitignore로 업로드 하지 않아서 각팀에서 추가적으로 설치하는 dependency가 생기는 경우와 관련 파일에 수정이 있을 경우에 커밋 후 각각 설치했습니다. 


---

#### 2. 순환참조

---
ERD를 그리면서 굉장히 많은 의견을 나누고 수정하였지만 평소에 개발을 하면서 도움이 된다고 생각했던 양방향 관계가  Axios호출시 순환참조를 일으켜 오류가 발생됬고 결국 @JsonIgnore 등을 이용하여 해결하였지만 양방향 관계의 장점을 사용하지 못하는 상황도 있었기에 그 점이 아쉬웠습니다. 
하지만 이번 기회를 통해 cascade , fetch 등 Entity 관계에 대하여 더 많은 공부 할수 있어 좋았습니다. 


---

#### 3. EventBus

---
EventBus를 활용해 Input과 List를 나누어 댓글 기능을 구현하였는데, Input할 시에 그 값이 중복해서 List에 담기는 현상이 있었다. EventBus를 해제하지 않아서 나타났던 현상이었고, $off를 선언해줌으로써 문제를 해결할 수 있었다.


---

#### 4. 세션 적용

---
model attribute를 이용해 session에 저장하는 방법으로는 브라우저에서 vue페이지 간에 이동할때 정보를 계속 갖고 있지 않아서 브라우저 안에서 저장하는 localstorage, sessionstorage 를 사용했습니다. 처음에는 유저 객체를 Json형태로 localstorage에 저장했는데 보안상의 이유로 비밀번호 정보 컬럼만  JsonIgnore해준 후 sessionstorage에 저장해서 사용했습니다.


---

## :zap: 프로젝트 후기

---
:poop: 아정
1. 전체적 프로젝트 구조, UI/UX와 Backend를 Vue.js로 연결하는 과정을 파악하고  지속적으로 오류사항이 없는지 확인하는 작업이 도전적이였습니다. 
2. 팀원들과 하루 세번 미팅을 하면서 각자 진행상황이 어떤지 확인하고자 했지만, 더 많은 부분들을 미리 캐치하고 더욱 소통했었으면 좋았겠다고 생각했고, technical한 부분에서 원하는 만큼의 도움을 주지 못해서 아쉬웠습니다. 그래도...행복했죠, 우리?   


<br><br>
:smiley: 문희 
1. Join컬럼이 어렵게 느껴지고, 그 때문에 발생한 에러도 많았지만 시행착오 과정에서 그만큼 많이 배웠다고 생각합니다.
2. 프론트 단을 Buefy로 구현하며 처음엔 낯설었지만 나중엔 일반 html보다 더 큰 매력을 느낄 수 있었습니다.
3. 처음으로 2주라는 긴 시간동안 한 프로젝트에만 집중하며 흔들릴때가 많았지만 팀원들이 잡아주어 잘 끝마칠 수 있었습니다. 좋은 팀원들을 만나 힘들지만 인류애가 넘치는 프로젝트였습니다.


<br><br>
:satisfied: 민재
1. 처음으로 진행한 대규모(?) 단위의 이번 프로젝트를 마무리 지으면서 느낀 점은 팀원간의 소통도 중요하지만, 무엇보다 중요한 점은 "개개인의 기본기"가 얼마나 잘 갖춰져 있나 하는 부분이었습니다. 다음에 있을 최종 프로젝트에는 이번 프로젝트보다 소규모(?) 단위로 진행될 것으로 예상되는데, 보다 좋은 결과를 얻기 위해서 기본기를 더욱 연마할 수 있도록 하는 마음가짐을 가지게 되었습니다.


<br><br>
:octocat: 희성
1. 처음으로 긴 프로젝트를 참여했는데  배운 점과 느낀 점이 정말 많았습니다. 힘든 순간들이 많았지만 멋진 조원들이 있어서 웃으면서 씩씩하게 이겨냈던 것 같습니다. 매번 프로젝트를 할 때마다 뿌듯함보다 아쉬움이 더 크게 느껴졌지만 이번 프로젝트는 아쉬움보다는 뿌듯함이 더 컸던 프로젝트였습니다. 고마워요 모두들^^


<br><br>
:blush: 다영
1. 웹 구조와 흐름에 대한 지식이 부족했던 탓에 파악하는데에 시간이 많이 걸렸습니다.  프로젝트 시작 전에 공부를 게을리했던 저를 반성하며 스스로 보완해야 할 점을 확실히 알게되었고 더 큰 의지를 가질 수 있게 되었습니다.
2. 아쉬움도 많았지만 배운게 더 많았던 프로젝트였습니다. 문제에 대해 서로 의논하며 도출해나가고 해결할 수 있어서 좋았고, 모든 팀원들에게 너무 감사합니다. 


<br><br>
:laughing: 연식
1. 평소에 하던 삽질이 많이 부족했구나를 많이 느꼈고 더 많은 노력과 검색이    필요하다는걸 느꼈습니다 ..^^..
2. 2주동안 하나하나 찾아가며 가시밭길을 걷고 실제로 원하던 기능이 구현될때 그 희열감.. 그리고 다시 오류가 생기고 좌절.. 이렇게 매일을 반복했던것 같습니다..^^..
3. 평소 Vue 부분에 있어서 굉장히 많이 부족함을 느꼈고 프로젝트를 통해 조금은 더 이해하게 된것같아 좋았습니다. 하지만 아직도 Vue는 넓고 크다…..
4. 개발시간보다 검색하는 시간이 더 길었지만 그래서 더 힘들고 의미있는 시간이었습니다!! 모두들 너무 수고하셨고 고생하셨습니다!!




---




## ✍️ Author 
 Team GAEPOM
  - 염아정 [(AJngYeom)](https://github.com/ajdeve)
  - 이민재 [(MinJaeLee)](https://github.com/Dowonna)
  - 권희성 [(HeeSeongKwon )](https://github.com/shiningcastle)  
  - 김연식 [(YeonSikKim)](https://github.com/yeonsikkim317)
  - 박다영 [(DaYoungPark )](https://github.com/Da-0)
  - 장문희 [(MoonheeJang)](https://github.com/JANGMOONHEE)
  
 

## :hammer_and_wrench: 참고

:mag: [ERDCLOUD 링크 ](https://www.erdcloud.com/d/uguFpsRksS59CvsJr)

:mag: [카카오 오븐 페이지 설계](https://ovenapp.io/view/KyjteLZHW6jUMXGeVmcNdXDxOywmgvr4) 
