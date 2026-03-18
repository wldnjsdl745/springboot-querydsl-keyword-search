# springboot-querydsl-keyword-search
Spring Boot와 QueryDSL을 사용해 키워드가 포함된 게시글 목록을 검색하는 프로젝트

## 학습 내용
- QueryDSL 설정
- 키워드 검색 기능 구현
- Spring Data JPA와 QueryDSL 함께 사용
- 엔티티, 리포지토리, 서비스, 컨트롤러 구조 연습

## 프로젝트 구성
- `config`
- `controller`
- `domain`
- `repository`
- `service`

## 핵심 개념
- `QueryDSL` : 타입 안정성을 가진 쿼리를 작성할 수 있는 기술
- `keyword search` : 제목, 내용 등에서 특정 키워드가 포함된 데이터를 조회하는 검색 방식
- `JPA + QueryDSL` : 기본 CRUD는 JPA, 복잡한 조건 검색은 QueryDSL로 처리
- `layered architecture` : controller, service, repository 역할을 나누어 구조적으로 개발

## 기술 스택
- Java 21
- Spring Boot
- Spring Data JPA
- QueryDSL
- MySQL
- Gradle
- Lombok

## 프로젝트 목표
- 게시글 목록을 키워드로 검색하는 기능 구현
- Query Method보다 복잡한 검색을 QueryDSL로 처리하는 방식 이해
- Spring Boot 프로젝트에서 검색 기능 흐름 익히기
