create table ambow_order(
id number primary key,
name varchar2(20)
);
create table ambow_item(
id number primary key,
product varchar2(20),
orderid number
);
alter table ambow_item add constraints ambow_order_item
foreign key(orderid) references ambow_order(id);


