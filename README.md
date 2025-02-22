# 편의점

### 🎯 기능 요구 사항
**재고 관리**
- 각 상품의 재고 수량을 고려하여 결제 가능 여부를 확인한다.
- 고객이 상품을 구매할 때마다, 결제된 수량만큼 해당 상품의 재고에서 차감하여 수량을 관리한다.
- 재고를 차감함으로써 시스템은 최신 재고 상태를 유지하며, 다음 고객이 구매할 때 정확한 재고 정보를 제공한다.
<br>

**프로모션 할인** 
- 오늘 날짜가 프로모션 기간 내에 포함된 경우에만 할인을 적용한다.
- 프로모션은 N개 구매 시 1개 무료 증정(Buy N Get 1 Free)의 형태로 진행된다.
- 1+1 또는 2+1 프로모션이 각각 지정된 상품에 적용되며, 동일 상품에 여러 프로모션이 적용되지 않는다.
- 프로모션 혜택은 프로모션 재고 내에서만 적용할 수 있다.
- 프로모션 기간 중이라면 프로모션 재고를 우선적으로 차감하며, 프로모션 재고가 부족할 경우에는 일반 재고를 사용한다.
- 프로모션 적용이 가능한 상품에 대해 고객이 해당 수량보다 적게 가져온 경우, 필요한 수량을 추가로 가져오면 혜택을 받을 수 있음을 안내한다.
- 프로모션 재고가 부족하여 일부 수량을 프로모션 혜택 없이 결제해야 하는 경우, 일부 수량에 대해 정가로 결제하게 됨을 안내한다.
<br>

**멤버십 할인**
- 멤버십 회원은 프로모션 미적용 금액의 30%를 할인받는다.
- 프로모션 적용 후 남은 금액에 대해 멤버십 할인을 적용한다.
- 멤버십 할인의 최대 한도는 8,000원이다.
<br>

**영수증 출력**
- 영수증은 고객의 구매 내역과 할인을 요약하여 출력한다.
- 영수증 항목은 아래와 같다.
- 구매 상품 내역: 구매한 상품명, 수량, 가격
- 증정 상품 내역: 프로모션에 따라 무료로 제공된 증정 상품의 목록
<br>

**금액 정보**
- 총구매액: 구매한 상품의 총 수량과 총 금액
- 행사할인: 프로모션에 의해 할인된 금액
- 멤버십할인: 멤버십에 의해 추가로 할인된 금액
- 내실돈: 최종 결제 금액
- 영수증의 구성 요소를 보기 좋게 정렬하여 고객이 쉽게 금액과 수량을 확인할 수 있게 한다.

### 🎯 프로그래밍 요구 사항
- indent depth를 최대 2까지
- 3항 연산자 금지
- 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게. 1개는 10라인을 넘지 않게
- else 쓰지 않기
- Enum 사용
- JUnit 5와 AssertJ를 이용한 단위 테스트 작성
- 입출력 담당 클래스 별도 구현
<br><br>

### 🔧 구현할 기능
- [x] 파일 데이터 읽기
  - [x] 상품 목록 리스트 가져오기
  - [x] 프로모션 정보 가져오기
- [x] 재고 목록 출력
- [x] 구매할 상품명, 수량 입력
  - [x] 형식에 맞게 입력했는지 검사
  - [x] 판매하는 상품을 입력했는지 검사
  - [x] 재고를 초과하여 입력했는지 검사
- [x] 멤버십 할인 여부 입력
- [x] 프로모션
  - [x] 프로모션 계산
  - [x] 프로모션 추가 적용 안내
  - [x] 프로모션 불가 안내
- [x] 재고 관리
  - [x] 일반 재고 차감
  - [x] 프로모션 재고 차감
- [x] 영수증 출력
  - [x] 상품 내역 출력
  - [x] 증정 내역 출력
  - [x] 가격 출력
- [x] 추가 구매 여부 확인
  - [x] 추가 구매를 원한다면 처음으로

<br><br>

### 🔧 명시되지 않은 기능 처리
- 1회 품목 당 최대 구매 수량은 999개

<br><br>

### 💡 구현 시 노력한 점
- 객체는 객체답게 사용하기. getter 대신 객체에 메시지 보내기
- 필드 수 최대한 줄이기
- 메소드 시그니처를 수정하여 테스트하기 좋게 만들기
- 디자인 패턴 사용해보기