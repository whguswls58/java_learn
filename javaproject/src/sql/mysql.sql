show databases;
show tables;

select * from member;

create table boardtest(
	no int auto_increment primary key,
	writer varchar(20),
	subject varchar(100),
	content varchar(1000),
	register date );
	
-- 데이터 입력
-- auto_increment : 1부터 1씩 증가된 값이 자동으로 입력되도록 해주는 속성
-- no 컬럼은 1부터 1씩 증가된 값이 자동으로 입력된다.
insert into boardtest(writer, subject, content, register)
		values('홍길동', '게시판 연습', '게시판 내용입니다.', sysdate());

-- 최신글 5개 검색
-- limit 추출할데이터의 인덱스번호, 추출할 데이터 갯수
-- desc -> 내림차순 정렬 : 최근에 입력한 값부터 출력
select * from boardtest order by no desc limit 0, 5;