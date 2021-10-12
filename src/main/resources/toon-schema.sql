drop table if exists realm CASCADE;
create table realm
(id integer generated by default as identity,
   name varchar(255),
   region varchar(255),
   primary key (id)
   );
   
drop table if exists toon CASCADE;
create table toon (id integer generated by default as identity, clazz varchar(255), gold integer, level integer, name varchar(255), race varchar(255), realm_id integer, primary key (id));