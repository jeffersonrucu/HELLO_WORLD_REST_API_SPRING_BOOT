CREATE TABLE doctor(
    id bigint not null auto_increment,
    name varchar(120) not null,
    email varchar(100) not null,
    crm varchar (10) not null,
    phone varchar (20) not null,

    primary key(id)
);
