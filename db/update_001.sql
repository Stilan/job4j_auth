create table person (
    id serial primary key not null,
    login varchar(2000),
    password varchar(2000),
    employee_id integer not null references employee (id)
);

create table employee (
   id serial primary key not null,
   name varchar(2000),
   surname varchar(2000),
   iNN int,
   hire_date timestamp without time zone not null default now()
);
insert into employee (name, surname, iNN)
values ('Petr', 'parsentev', '123456');
insert into employee (name, surname, iNN)
values ('Alex', 'Vens', '654321');
insert into employee (name, surname, iNN)
values ('Ivan', 'Ivanov', '121212');

select * from person;

drop table employee;
drop table person;
insert into person (login, password, employee_id) values ('parsentev', '123', 1);
insert into person (login, password, employee_id) values ('ban', '123', 1);
insert into person (login, password, employee_id) values ('ivan', '123', 2);