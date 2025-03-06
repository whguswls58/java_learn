select * from tab;			-- 테이블 목록 확인
select * from seq;			-- 시퀀스 목록 확인

select * from member01;

-- 임시 테이블 삭제
purge recyclebin;

-- 테이블 삭제(purge까지 붙여줘야 깔끔하게 삭제가능)
drop table customer purge;

-- 예1. 회원관리
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장해야 함(NULL값도 x)
create table customer( no number(4) primary key,
					   name varchar2(20),
					   email varchar2(20),
					   tel varchar2(20));

-- address와 reg_date 컬럼 추가
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

-- address와 reg_date 컬럼 삭제
alter table customer drop column address;
alter table customer drop column reg_date;

select * from CUSTOMER;

-- 총 데이터 갯수 구하기
select count(*) from CUSTOMER;

-- 시퀀스 생성 : no(번호)를 1부터 1씩 자동으로 증가 시켜서 처리해주는 역할
create sequence customer_no_seq
		start with 1				-- 시작값
		increment by 1;				-- 증가치(감소는 되지않음, 중복도 발생하지 않음)

create table board(
	no number primary key,
	writer varchar2(20) not null,
	passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );

create sequence board_seq
	start with 1
	increment by 1;


select * from board;