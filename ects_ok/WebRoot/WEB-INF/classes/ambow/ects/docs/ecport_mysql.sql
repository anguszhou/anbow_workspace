##   ɾ�����ݿ�
drop  database  ecport;

##   �������ݿ�
create   database   ecport;

##   ʹ�����ݿ�
use   ecport;


##   ���ұ�ṹ
create   table COUNTRY(
               country_id     int  primary key auto_increment,
               name           varchar(64)
              
               );
##   ģ����ұ�����               
INSERT INTO COUNTRY( name ) VALUES ('�й�');

create   table PROVINCE(
               province_id     int  primary key auto_increment,
               name           varchar(64),
               country_id      int  references   COUNTRY(country_id)
               );
//    ģ��ʡ�ݱ�����
INSERT INTO province (province_id , name , country_id ) VALUES (1, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (2, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (3, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (4, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (5, '�㶫', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (6, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (7, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (8, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (9, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (10, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (11, '�ӱ�', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (12, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (13, '���', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (14, '������', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (15, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (16, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (17, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (18, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (19, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (20, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (21, '���ɹ�', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (22, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (23, '�ຣ', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (24, '�Ĵ�', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (25, 'ɽ��', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (26, '�Ϻ�', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (27, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (28, 'ɽ��', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (29, '���', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (30, '̨��', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (31, '�½�', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (32, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (33, '����', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (34, '�㽭', 1);
INSERT INTO province (province_id , name , country_id ) VALUES (35, '����', 1);
  
  ##    �û�������Ϣ��ṹ
  create  table  USER(
                   user_id     int   primary key  auto_increment,
                   name        varchar(64),
                   passwd      varchar(16)
                   );
                   
  ##    �û���Ϣ������Ϣ��ṹ
 create  table  CONTCATINFO(
                    contcatinfo_id   int  references USER(user_id ),
                    street1          varchar(128),
                    street2          varchar(128),    
                    city             varchar(128), 
                    zip              varchar(12),    
                    email            varchar(128), 
                    homePhone        varchar(32),
                    cellPhone        varchar(32),
                    officePhone      varchar(32),
                    country_id   int   references COUNTRY(country_id),
                    province_id  int   references PROVINCE(province_id),
                    primary key(contcatinfo_id)
                    );
 
## ������Ʒ���ͱ�ṹ
create   table   Category(
                 category_id   int  primary key auto_increment,
                 name          varchar(64),
                 descriptions  varchar(256)
                  );  
##  ģ����Ʒ����  
INSERT INTO  Category (category_id , name ,descriptions )  values  (1, '�����', '��������������');
INSERT INTO  Category (category_id , name ,descriptions )  values (2, 'Ӣ��', 'Ӣ�����ͼ��');
INSERT INTO  Category (category_id , name ,descriptions )  values (3, '��ѧ', '��ѧ��Ʒͼ�鼯');
                 
## ������Ʒ��ṹ
create   table   Product(
                 product_id    int  primary key auto_increment,
                 name          varchar(64),
                 author        varchar(64),
                 publish       varchar(128),
                 pages         int,
                 images        varchar(128),
                 basePrice     double,
                 descriptions  varchar(4000),
                 category_id   int  references Category(category_id)
                  );              
                             
##  ģ����Ʒ���� 

INSERT INTO  product(name,descriptions,basePrice,category_id,author,publish,pages, images)  VALUES ( 'JAVA���˼�룺��3��', '�ӱ����õĸ�����Լ�����������صĶ��������У����ѿ�������һ������֮�������������ж���Ľ�ѧ���飬��C��C++��Java���Զ��ж������������⡣������ǳ��˽���ν���Java�������ſγ̣�Ҳ�ǳ��������Խ�ѧ�е��ѵ㼰���ǵ�����������ͨ���׶���С��ֱ�ӵ�ʾ��������һ������ɬ����ĸ������ѡȡ���Զ������Java������˵��Ϊ��Ҫ���Ĳ��ֱ�д���顣ͬʱ��������������ṩ�˴����ο����ϡ���Ҳ�Ǳ�������ﳬ��ֵ�ĵط���\r\n�������û�а��������Դ���루���Դ�֧����վwww.MindView.net������أ��������ṩ�˴������߽��ڵ����ۿ����ݼ������ǰ2�����ݡ�\r\n�������ݷḻ����Java�Ļ����﷨����߼����ԣ��ʺϸ���ε�Java����Ա�Ķ���ͬʱҲ�Ǹߵ�ԺУ��������������������Լ�Java���Եľ��ѽ̲ġ�', '95.00', '1', '������Bruce Eckel', '��е��ҵ������', '796', 'images/product/zcover.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images)  VALUES ( '��ͨHibernate��Java����־û��������', '���������ٵļ�����鼮 �����ĵ�:<br>\r\n�������˵��Ľṹ�ñȷ��ݵĿ�ܣ����������ñȷ��ݵľ������Ԫ�ء������������ݵ���ʽ��Ϊ�����֡� ���ͼ�ͷ�����Ϊ�˰�ĳ��֪ʶ�������������Ҫ�ۺ�ʹ����������ʽ��Ԫ��......\r\n:<br>\r\n�����̡�Tomcat �� Java Web�����������(������)���͡���ͨStruts������MVC��Java Web����뿪��(������)��֮��Ӧ�����ߵ�ǿ��Ҫ�������ٵ���һ��������ͨHibernate��Java����־û�������⡷��������ӭ�����е�׼�����С�\r\nHibernate��һ������Java�Ŀ���Դ����ĳ־û��м��������JDBC������������װ�������ṩORMӳ����񣬻��ṩ���ݲ�ѯ�����ݻ��湦�ܣ�Java������Ա���Է����ͨ��Hibernate API���������ݿ⡣\r\n���ڣ�Խ��Խ���Java������Ա��Hibernate��Ϊ��ҵӦ�ú͹�ϵ���ݿ�֮����м�����Խ�ʡ�Ͷ���־û��йص�30%��JDBC��̹������� 2005�꣬Hibernate��Ϊ���������������ٻ��˵�15��Jolt�󽱡�Hibernate֮�����ܹ����У��鹦�������е����ơ�<br>\r\n���������ϴ������͵�ʵ������ϸ����������Ŀǰ������Hibernate2.1�汾����Java����־û��ļ�����Hibernate������Java ����ģ�ͺ͹�ϵ����ģ�͵�������ͨ�����飬���߲�����������Hibernate���߶�������ģ�ͽ���ӳ��ļ��������ܻ������뿪��Java����ģ�ͺ͹�ϵ����ģ�͵��Ƚ����顣', '59.00', '1', '������', '���ӹ�ҵ������', '600', 'images/product/zcover2.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images)  VALUES ( 'Java 2���ļ�������6�棩 ��I������֪ʶ ', '    ������Ѿ���Java����Ա�����˽�Java���������ԣ�����ô����?ȥ��һ����ߵ�Javaר�ң����ǻ�����㣺��Java���ļ�����ͨ���ṩʵսָ�����ܹ�ʹ���������Java���裬��������ս�Ե�������Ҳ������������7�������緶Χ�ڳ�Ϊ����鼮��ԭ��<br>\r\n��������ȫ�潲���˱�׼ Java 2 1��4�汾�Ļ���֪ʶ�������˴�������ʽ��������I��O��������Ҫ�����ԡ������ܹ�����������������Javaƽ̨�����ľ���������Լ�ȫ������˵� Swing�û����濪���������������ݡ�����Ҫ���ǣ���6������˸���ֵ��������ʵ�ó���(����һֱ��������Щʵ�ó��������)�����ҽ����˸��£���ӳ�������SDK���Ժͷ�չ!<br>\r\n��������ΪJavaƽ̨�������ṩ����������Ϣ��<br>\r\n������Swing GUI������������������֤��������ǿ����<br>\r\n�����񿪷��ɿ����롪��������ʽ�쳣��ջ֡�����Ժ���־<br>\r\n�������µĸ����ܵ�I��O API�����ڴ�ӳ���ļ����ļ��������ַ������룯����<br>\r\n������ʹ�����µĹ���ǿ���java��utiI��regex����������ʽ<br>\r\n������Java 1��4ƽ̨���������ࣺ�µĿ�ƽ̨��������Ϣ�洢��<br>\r\n������̬�����ࡢ�ڲ��ࡢJavaƽ̨�¼�ģ�͡������ļ������Լ���������<br>\r\n���߼�飺<br>\r\n����CayS��Horstmann��ʥ����������ѧ�ļ������ѧ���ڣ���C++��Java��������󿪷������Ѿ���6�������� GaryCornell�ǿ����Ҹ��ѧ�Ľ��ڣ�Ҳ�ǹ�󿪷���Աϲ���ļ������ң�������������ܺ������������������˴����������ļ��������ͼ������� Apress��', '75.00', '1', '(��)Gary Cornell', '��е��ҵ������', '698', 'images/product/zcover3.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images) VALUES ( 'Effective Java���İ�', '���������������Java�����57������ʵ�ü�ֵ�ľ��������Щ������򺭸��˴����������Աÿ�������ٵ�����Ľ��������ͨ����Javaƽ̨���ר����ʹ�õļ�����ȫ����������ʾ��Ӧ����ʲô����Ӧ����ʲô���ܲ�����������׳�͸�Ч�Ĵ��롣 �����е�ÿ�������Լ�̡�������С������ʽ���֣���ЩС���°�������ϸ����ȷ�Ľ��飬�Լ������������ϸ΢֮���������������ͨ�����Ӵ�����Խ�һ��˵�����ᴩȫ�����ͨ�õ������÷������ģʽ���Լ�һЩ������������ļ��ɺͼ�����<br>\r\n<br>\r\n����������ϣ��10��ǰ�Ҿ���ӵ���Ȿ�顣�������˻���Ϊ�Ҳ���Ҫ�κι���Java���鼮��������ȷʵ��Ҫ�Ȿ�顣��<br> ����������������������������������������James Gosling��Java֮����Sun��˾���ܲ�<br>\r\n<br>\r\n��������һ���ǳ�������飬�����˸��ֹ���ʹ��Java����������Ժ�������������ƵĺõĽ��顣��<br>\r\n���������������������������������������� ����Gilad Bracha, Sun��˾�������ѧ�ң���The Java TM Language Specificationy����Second Edition��������֮һ ', '39.00', '1', '(��)Joshua Bloch', '��е��ҵ������', '214', 'images/product/zcover4.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images) VALUES ( 'Java��ģʽ', '������һ���������ԭ���Լ���Ϊ���������ģʽ��ʵ�ý̲ģ�Ŀ����Ϊ������æ��Javaϵͳ���ʦ�ṩһ�����ٶ�׼ȷ�����ԭ������ģʽ�ĸ����������Ϊ55�£�ÿһ���½ڽ���һ�����ģʽ��˵����ģʽ�����⡢�ṹ���Լ���һģʽ�ʺ���ʲô��������ȡ�ÿһ���½ڶ����ж�����Ӻ���ϰ�⣬��ϰ��Щ���ӡ������Щ��ϰ����԰������߸��õ�������������ݡ���������½ڶ�����Զ����ģ����߿��Դ򿪱��飬���κ�һ�¿�ʼ����Ϊ�����㲻ͬ�̶ȵĶ��ߵ���Ҫ�������ṩ��һЩ��Ϊ��ר�⡱���½ڣ����Ķ���Щ�½ڣ����Ķ�����ı�׼�½�û��Ӱ�졣��������֮�󣬶��߿��Ժ��������ĵ����Լ���ϵͳ��ƹ�����ʹ��ѧ�������ݣ���ͬ�½�������������ƾ��飬������ҵ��չ���и�����ջ񡣱����ʺ���Java����Ա���ܹ����ʦ�����ģʽ�����ߣ���һ��ʵ�õ����ԭ������ģʽ����ѧ�̲ĺ�ʹ���ֲ�', '88.00', '1', '�ֺ�', '���ӹ�ҵ������', '1024', 'images/product/zcover5.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images)  VALUES ( '����ǳ��Hibernate', '�����ɻ�������Ӱ��㷺�Ŀ����ĵ�OpenDocϵ�����������׷��ĵ���Hibernate����ָ�ϡ���չ�������ڱ�д�����У����������¹�˼����֯��ͬʱ�����ݵ�������Ƚ������ص�ǿ��������ӳ־ò����֣���������/��ϵ���ݿ�ӳ����������������۽���Ŀǰ�����ơ���ǿ����ORM��Ʒ���� Hibernate����һ�������������֣�����Hibernate�Ļ����﷨�����ã��������ߵ����桢�ӳټ��صȸ߼����ԡ�������������ǳ�����Ƚ����־ò������ORM������Hibernate������Hibernate����Hibernate�߼�����˳��չ����ֱ��Hibernateʵս���ص㽲���� Hibernate�Ļ����﷨���������á�O/Rӳ�䡢���ݹ��������ݼ�����HQLʵ�ü������Զ���־û�ʵ�֡�Hibernate�ص������ء� Hibernate��ҳ��ʵ�ü�����Hibernateʵս��������һ����ʵ��̳�Ĵ�����ʾ��Hibernate��ǿ���ܡ������зḻ�ĸ�¼�����ڸ�¼�н�����Hibernate���õ�ӳ�����ã�Hibernate���ߡ�XDocletģ�������Լ�Hibernate������iBatis�÷������Կ�Ƭ����ʽ�г��˱��������õĹ��߼��������¼���һ�����ǡ������������롱�������߶Ա���ο���Ҳ����ѧ���ṩ��һ������𲽵Ļ����������ʺ���Hibernate�ĸ����ײ�Ķ��ߡ�', '59.00', '1', '��� ������ ����', '���ӹ�ҵ������', '512', 'images/product/zcover6.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images) VALUES ( 'Tomcat��Java Web�����������', '���� ������ϸ������������Tomcat 5�汾�Ͽ���Java WebӦ�õĸ��ּ�������Ҫ���ݰ�����Tomcat��Java Web�����Ļ���֪ʶ��Java Web�����ĸ߼�������Tomcat�뵱ǰ����ͨ������ļ��ɣ��Լ�Tomcat�ĸ��ָ߼����ܡ���������ע��������ʵ�����ϣ��о��˴������е����Ժ�ʵ�ü�ֵ��WebӦ��ʵ�������ṩ����ϸ�Ŀ����Ͳ����衣����Java Web������SUN��˾��Java Servlet�淶�������ͨ�ü�������˱��齲���Java WebӦ�����ӿ����������κ�һ��ʵ��SUN��Servlet�淶��Java Web�������ϡ����鸽����������Ϊ�������з���Դ�����Լ������漰����������������°汾�İ�װ���򡣱�����������ǳ����ͨ���׶������۶���Java Web���������ֻ����м���˵�����鶼�Ǿ�ͨTomcat�����Ϳ���Java WebӦ�õıر���ʵ���ֲᡣ', '45.00', '1', '������ ����', '���ӹ�ҵ������', '438', 'images/product/zcover7.gif');
INSERT INTO  product (name,descriptions,basePrice,category_id,author,publish,pages, images) VALUES ( '��ͨSpring', '�����������������˵�ǰ���е��������������Spring�������ܹ��ֳ�3���֡���һ���֣��ص����Spring�ļܹ����ⲿ������ѭ�򽥽����쿪���߽���Spring�С���Ҫ���ڲ���Spring IOC��Spring AOP���ڶ����֣��ص����Spring��ʹ�á��ⲿ�����ݴӼ�Java/J2EE�ĽǶȳ�������J2EEƽ̨����������������������������о�ʵ������Spring�ṩ��API���в�������Ҫ���ڲ���Spring��J2EE API�ṩ�ķ�����󡣵������֣��ص����Spring�߼�ר�⡣�ⲿ�������ص����ͼ�����������о�����Ϊ���ڿ���WebӦ�ö��ԣ�ǰ�˽���Ŀ��������������ܴ���ˣ�ʹ�ú������ͼ��������WebӦ�ö�����Ŀ�ĳɹ����ܹؼ������⣬WebӦ�õİ�ȫ������Ҳ����ҵӦ������Ϊ��Ҫ������֮һ�������� Spring��Acegi��ȫ��ܺܺõؽ����������⣬��Ҳ�ǵ��������ص��о�������֮һ�������׸����е�Java��J2EE�������Ķ���', '39.00', '1', '��ʱ��', '���ӹ�ҵ������', '425', 'images/product/zcover8.gif');


##����Ϊ�����촴����ṹ
##  �������ʽ��ṹ

 create   table  PAYWAY(
                   payway_id  int  primary key auto_increment,
                   payStyle   varchar(36)
                   );
## ģ�⸶�ʽ����
insert  into   PAYWAY(payway_id , payStyle) values(1, "�ֽ𸶿�");
insert  into   PAYWAY(payway_id , payStyle) values(2, "��������");
insert  into   PAYWAY(payway_id , payStyle) values(3, "��㸶��");

## ��������״̬��ṹ
  create   table  OrderStatus(
            orderStatus_id   int  primary key auto_increment,
            name    varchar(36),
            descriptions  varchar(128)
            );
##  ģ�ƶ���״̬����
insert into  OrderStatus(orderStatus_id,name, descriptions) values
(1,'���״̬','�����������״̬�����ڽ�����');
insert into  OrderStatus(orderStatus_id,name, descriptions) values
(2,'�ɹ�״̬','�����Ѿ��ɹ����ͻ���');
insert into  OrderStatus(orderStatus_id,name, descriptions) values
(3,'����;��','���������ͻ�״̬');
insert into  OrderStatus(orderStatus_id,name, descriptions) values
(4,'ȱ��״̬','�����漰��Ʒ��ʱȱ��');             

## ����������ṹ
 create  table  myOrder(
                order_id  int  primary key auto_increment,
                name      varchar(32),
                cost      double,
                user_id   int  references USER(user_id),
                payWay_id int  references PAYWAY(payWay_id),
                orderStatus_id  int  references ORDERSTATUS(orderStatus_id)
                );     

## ����������ϸ��
 create   table OrderLine(
                orderLine_id  int primary key auto_increment,
                amount        int ,
                product_id    int  references PRODUCT(product_id),
                order_id      int  references MYORDER(order_id)
                );                                                                                    