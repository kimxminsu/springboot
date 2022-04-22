create user minsu IDENTIFIED BY minsu
default tablespace users
temporary tablespace temp;
grant connect, dba to minsu;

--select dbms_xdb.gethttpport() from dual; //8080
--exec dbms_xdb.sethttpport(8080);

CREATE TABLE MINSU (
    USERCODE varchar(255),
    USERNAME varchar(255)
);

INSERT INTO MINSU(USERCODE, USERNAME)
VALUES('1','둘리');
INSERT INTO MINSU(USERCODE, USERNAME)
VALUES('2','또치');
INSERT INTO MINSU(USERCODE, USERNAME)
VALUES('3','희동이');
INSERT INTO MINSU(USERCODE, USERNAME)
VALUES('4','마이콜');
INSERT INTO MINSU(USERCODE, USERNAME)
VALUES('5','고길동');