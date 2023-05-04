create table animals (
                        id bigint not null auto_increment,
                        name varchar(100) not null,
                        species varchar(100) not null,
                        gender varchar(3) not null unique,
                        age varchar(2) not null,
                        habitat varchar(100) not null,

                        primary key(id)
);