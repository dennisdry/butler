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
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table Item_Tag add constraint UK_cyfb693d62m5vyxrxgime6yq3 unique (tags_id)
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table Message (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table Item_Tag add constraint UK_cyfb693d62m5vyxrxgime6yq3 unique (tags_id)
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
create table butler_message (id  bigserial not null, name varchar(255), messageType_id int8, primary key (id))
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table MessageType (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), tagType_id int8, primary key (id))
create table TagType (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table Item_Tag add constraint UK_cyfb693d62m5vyxrxgime6yq3 unique (tags_id)
alter table butler_message add constraint FK1bhf7p0pqlfd77dkyjpt7pmlv foreign key (messageType_id) references MessageType
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
alter table Tag add constraint FKqokv6002yh7lonnks9yy1yj2k foreign key (tagType_id) references TagType
create table butler_message (id  bigserial not null, name varchar(255), messageType_id int8, primary key (id))
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table MessageType (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), tagType_id int8, primary key (id))
create table TagType (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table Item_Tag add constraint UK_cyfb693d62m5vyxrxgime6yq3 unique (tags_id)
alter table butler_message add constraint FK1bhf7p0pqlfd77dkyjpt7pmlv foreign key (messageType_id) references MessageType
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
alter table Tag add constraint FKqokv6002yh7lonnks9yy1yj2k foreign key (tagType_id) references TagType
create table butler_message (id  bigserial not null, name varchar(255), messageType_id int8, primary key (id))
create table butleruser (id  bigserial not null, firstName varchar(255), lastName varchar(255), userName varchar(255), primary key (id))
create table butleruser_email (butleruser_id int8 not null, email varchar(255))
create table butleruser_Item (butleruser_id int8 not null, items_id int8 not null)
create table butleruser_phone (butleruser_id int8 not null, phone varchar(255))
create table Item (id  bigserial not null, name varchar(255), stock int4 not null, user_id int8, primary key (id))
create table Item_Tag (Item_id int8 not null, tags_id int8 not null)
create table MessageType (id  bigserial not null, name varchar(255), primary key (id))
create table Tag (id  bigserial not null, name varchar(255), tagType_id int8, primary key (id))
create table TagType (id  bigserial not null, name varchar(255), primary key (id))
alter table butleruser_Item add constraint UK_lrpy0ts8chdg8cd7kkyfrxiwa unique (items_id)
alter table Item_Tag add constraint UK_cyfb693d62m5vyxrxgime6yq3 unique (tags_id)
alter table butler_message add constraint FK1bhf7p0pqlfd77dkyjpt7pmlv foreign key (messageType_id) references MessageType
alter table butleruser_email add constraint FKas7xs5e3nav45yvcstv7i7qog foreign key (butleruser_id) references butleruser
alter table butleruser_Item add constraint FKqs9d7qevfnkhv1vi77b0mg5xc foreign key (items_id) references Item
alter table butleruser_Item add constraint FKf8maxug2t9osm2wi3ahahplnh foreign key (butleruser_id) references butleruser
alter table butleruser_phone add constraint FKsbs8crc6p4s24kbjwv5ujxytc foreign key (butleruser_id) references butleruser
alter table Item add constraint FKmioxo9tpystfquu5n9yqcilos foreign key (user_id) references butleruser
alter table Item_Tag add constraint FKckhs8di97uxakip6p9nstu9m foreign key (tags_id) references Tag
alter table Item_Tag add constraint FK2hb206ylh1yxn62psfd8op5qa foreign key (Item_id) references Item
alter table Tag add constraint FKqokv6002yh7lonnks9yy1yj2k foreign key (tagType_id) references TagType
