# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 별 구현목록
1. (컴퓨터의 수)1부터 9까지 서로 다른 3자리 수를 생성한다.
2. (사용자 입력 수)사용자로부터 3자리 값을 입력받고 적절한 값인지 검증한다. 3자리 숫자가 아닌 경우 ERROR MESSAGE 출력 후 게임을 계속 진행한다. 
3. (컴퓨터의 수)와 (사용자 입력 수)가 스트라이크/볼/낫싱인지 검증한다.
4. 컴퓨터의 수와 사용자 입력 수가 동일할 경우(3스트라이크), 게임을 종료한다.
5. (입력 1)게임을 다시 시작할지 (입력 2)완전히 종료할 지 사용자 입력으로 확인한다. 입력 1과 2가 아닐 경우 ERROR MESSAGE 출력 후 다시 입력을 받는다.

## 클래스 설계
* Class1. (Controller & UI) 사용자 입력 및 System 출력을 담당 
* Class2. (Model) 컴퓨터의 수를 생성하는 기능을 담당
* Class3. (Model) 게임의 핵심로직인 스트라이크/볼/낫싱 검증
* Class4. (Model) 스트라이브/볼을 관리하는 VO
* Class5. (Model) 사용자 입력이 적절한지 검증

## 구현내용 점검
1. baseball 
* Application.java : 사용자 입력에 따른 서비스 호출 및 결과 값을 출력
* GameMessage.java : 게임 중에 노출되는 메세지 정보 관리
* GameRule.java : 게임 관련 룰 정보 관리

2. baseball.domain
* Client.java : 사용자의 행위에 관한 역할을 담당
* Computer.java : 컴퓨터의 행위에 관한 역할을 담당
* GameManager.java : 게임진행관련 주된 역할(스트라이크/볼/낫싱 판정)을 담당

3. baseball.dto
* BaseBall.java : 진행되는 게임의 상태를 관리하는 역할을 담당

4. baseball.validation
* InputValidationCheck.java : 사용자 입력이 적절함을 판단하는 기능을 담당