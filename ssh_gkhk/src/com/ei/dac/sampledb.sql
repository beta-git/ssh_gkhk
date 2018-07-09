alter table MultiMedia drop foreign key FKC048E24BC6A8170E;
alter table ResourceElement drop foreign key FK874E9EEE1702AC12;
alter table UserInfo drop foreign key FKF3F34B3937B946E7;
alter table UserResources drop foreign key FK2E7C367A37B946E7;
drop table if exists MultiMedia;
drop table if exists ResourceElement;
drop table if exists User;
drop table if exists UserInfo;
drop table if exists UserResources;
create table MultiMedia (id bigint not null, userResourcesID bigint not null, subType varchar(255), primary key (id));
create table ResourceElement (multiMediaID bigint not null, content varchar(255) not null, subType varchar(255) not null, primary key (multiMediaID, subType));
create table User (id bigint not null, name varchar(20), password varchar(20), primary key (id));
create table UserInfo (id bigint not null, iconURL varchar(255), signature varchar(100), gender bit, birthday date, address varchar(255), email varchar(50), primary key (id));
create table UserResources (id bigint not null, balance integer, primary key (id));
alter table MultiMedia add index FKC048E24BC6A8170E (userResourcesID), add constraint FKC048E24BC6A8170E foreign key (userResourcesID) references UserResources (id);
alter table ResourceElement add index FK874E9EEE1702AC12 (multiMediaID), add constraint FK874E9EEE1702AC12 foreign key (multiMediaID) references MultiMedia (id);
alter table UserInfo add index FKF3F34B3937B946E7 (id), add constraint FKF3F34B3937B946E7 foreign key (id) references User (id);
alter table UserResources add index FK2E7C367A37B946E7 (id), add constraint FK2E7C367A37B946E7 foreign key (id) references User (id);
