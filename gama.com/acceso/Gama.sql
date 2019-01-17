/*CREATE USER 'gamachicas'@'localhost' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON * . * TO 'gamachicas'@'localhost';
FLUSH PRIVILEGES;
CREATE DATABASE Gamachicas;
use Gamachicas

CREATE TABLE color (
  idcolor      NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  CHECK (STATUS BETWEEN 0 and 1)
);

alter table color add  code varchar(50)*/

CREATE TABLE IF NOT EXISTS color (
    idcolor INT AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
	DESCRIPTION VARCHAR(255) NOT NULL,
	STATUS TINYINT(1),
    createdate  DATETIME ,
    updatedate  DATETIME ,
    PRIMARY KEY (idcolor)
)  ENGINE=INNODB;




CREATE TABLE clothingline (
  idclothingline    INT AUTO_INCREMENT,
  NAME   VARCHAR(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
	STATUS TINYINT(1),
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
primary key(idclothingline)
);



CREATE TABLE clothing (
  idclothing     INT AUTO_INCREMENT,
  idclothingline  numeric ,
  idcolor numeric ,
  NAME   VARCHAR(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
	STATUS TINYINT(1),
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
primary key(idclothing)
);



CREATE TABLE Groupparameter (
  idGroupparameter  INT AUTO_INCREMENT,
  DESCRIPTION  VARCHAR(500) NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
  primary key(idGroupparameter)
);


ALTER TABLE Groupparameter
ADD CONSTRAINT constraint_Groupparameter PRIMARY KEY (idGroupparameter);


CREATE TABLE parameter (
  idparameter    int auto_increment,
  NAME   VARCHAR(100) NOT NULL,
  STATUS  tinyint(1),
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
  primary key(idparameter)
);

ALTER TABLE parameter
ADD CONSTRAINT constraint_Gidparameter PRIMARY KEY (idparameter);

CREATE TABLE parameter (
  idparameter    int auto_increment,
  NAME   VARCHAR(100) NOT NULL,
  STATUS   numeric NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
  primary key(idparameter)
  
);

create table sizes
(  idsize int auto_increment,
  CODE  VARCHAR(5) NOT NULL,
  NAME  VARCHAR(50)  NOT NULL,
  STATUS   numeric NOT NULL,
 primary key (idsize)
)
;


 
 CREATE TABLE stock
 (
 idstock  int auto_increment,
 idclothingline      numeric  not null ,
 idclothing     numeric    not null,
 idcolor      numeric   not null,
 iddescription numeric  not null,
 price decimal  null,
 count numeric ,
 description varchar(200) null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status tinyint(1),
 idusercreate numeric,
primary key(idstock)
 
 );
  ALTER TABLE stock
ADD CONSTRAINT constraint_stock PRIMARY KEY (idstock);

 CREATE TABLE temptpayheader
 (
 
 idtemptpayheader  int auto_increment,
 idvaucher numeric,
 totalprice decimal  null,
 totalitem numeric ,
 description varchar(200) null,
 idstatus numeric not null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status tinyint(1),
 idusercreate numeric,
 primary key(idtemptpayheader)
 
 )
   ALTER TABLE temptpayheader
ADD CONSTRAINT constraint_temptpayheader PRIMARY KEY (idtemptpayheader);
 
  CREATE TABLE Detailtemptpay
 (
 idDetailtemptpay int auto_increment,
 idclothingline      numeric  not null ,
 idclothing     numeric    not null,
 idcolor      numeric   not null,
 iddescription numeric  not null,
 price decimal  null,
 idvaucher numeric,
 totalprice decimal  null,
 totalitem numeric ,
 description varchar(200) null,
 idstatus numeric not null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status tinyint(1),
 idusercreate numeric,
primary key(idDetailtemptpay)
 
 );

 create table users
 ( iduser int auto_increment,
   name varchar(200) not null,
   email varchar(100) not null,
   password varchar(100) not null,
   createdate timestamp not null,
   updatedate timestamp null,
  status tinyint(1),
   primary key(iduser)
 );
ALTER TABLE users
ADD CONSTRAINT constraint_iduser PRIMARY KEY (iduser);

   ALTER TABLE Detailtemptpay
ADD CONSTRAINT constraint_idDetailtemptpay PRIMARY KEY (idDetailtemptpay);
 create table parentMenu
 ( idparentMenu int auto_increment,
   idmenu int,
   name varchar(200) not null,
   path varchar(100) not null,
   createdate timestamp not null,
   updatedate timestamp null,
    status tinyint(1),
   primary key(idparentMenu)
 );
 ALTER TABLE `Gamachicas`.`parentMenu` 
DROP COLUMN `idmenu`;
  
  create table Menu
 ( 
 idmenu int auto_increment,
   idparentMenu int ,
   name varchar(200) not null,
   path varchar(100) not null,
   createdate timestamp not null,
   updatedate timestamp null,
    status tinyint(1),
   primary key(idmenu)
 );
  select `name`,
`path` from parentMenu where status=1
insert into  parentMenu values(1,'Home','src/main/webapp/WEB-INF/views/pages/home.jsp',now(),now(),1);

INSERT INTO `Gamachicas`.`parentMenu`
(
`name`,
`path`,
`createdate`,
`updatedate`,
`status`)
values('Boys','src/main/webapp/WEB-INF/views/boys/home.jsp',now(),now(),1);
INSERT INTO `Gamachicas`.`parentMenu`
(
`name`,
`path`,
`createdate`,
`updatedate`,
`status`)
values('Girls','src/main/webapp/WEB-INF/views/boys/girls.jsp',now(),now(),1);

DELIMITER //
create PROCEDURE SelectMenuParent ()
 BEGIN
  select `name`,
`path` from parentMenu where status=1;
 END;
//
DELIMITER ;

CALL SelectMenuParent();



