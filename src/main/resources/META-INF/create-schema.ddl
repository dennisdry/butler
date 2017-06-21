create table User (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table User (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Message (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
