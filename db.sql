create table tb_Vip_users
(
  item_id int not null primary key,
  item_name varchar2(50) not null,
  item_price number(9,2) not null,
  create_time date not null,
  status int not null
);
create sequence my_seq;

insert into tb_Vip_users values(my_seq.nextval,'三星s7',6999,sysdate,0);
insert into tb_Vip_users values(my_seq.nextval,'魅蓝5s',999,sysdate,0);
insert into tb_Vip_users values(my_seq.nextval,'华为p9',5999,sysdate,0);
insert into tb_Vip_users values(my_seq.nextval,'iPhone7',6999,sysdate,0);
insert into tb_Vip_users values(my_seq.nextval,'iPhone4',800,sysdate,1);
commit;
select * from tb_Vip_users;
--drop table tb_Vip_users purge;
select * from tb_Vip_users
date tb_Vip_users set status=1 where item_id=3911;


