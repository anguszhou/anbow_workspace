create table ambow_car(
id number primary key,
name varchar2(20)
);
create table ambow_engine(
id number primary key,
nu number,
carid number
);

alter table ambow_engine add constraints ambow_car_engine1
foreign key(carid) references ambow_car(id);


create table ambow_car_pk(
id number primary key,
name varchar2(20)
);
create table ambow_engine_pk(
id number primary key,
nu number
);

alter table ambow_engine_pk add constraints ambow_car_engine3
foreign key(id) references ambow_car_pk(id);