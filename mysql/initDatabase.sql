drop table if exists book_in_bookcase;
drop table if exists bookcase;
drop table if exists book;
drop table if exists user;


create table user
(
	user_id			int auto_increment,
    password_hash	varchar(40) not null,
    user_name		varchar(20) not null,
    primary key (user_id),
    unique (user_name)
);

create table book
(
	isbn			varchar(13) not null,
    book_title		varchar(80) not null,
    author			varchar(60) not null,
    primary key (isbn)
);    

create table bookcase
(
	bookcase_name	varchar(60) not null,
    user_id			int not null,
    bookcase_id		int auto_increment,
    primary key (bookcase_id),
    foreign key (user_id) references user(user_id) on delete cascade
);
    
create table book_in_bookcase
(
	isbn			varchar(13) not null,
    bookcase_id		int not null,
    primary key (isbn, bookcase_id),
    foreign key (isbn) references book(isbn) on delete cascade,
    foreign key (bookcase_id) references bookcase(bookcase_id) on delete cascade
);

insert into user (password_hash, user_name) values ('password', 'user');
insert into book values ('1234567890123', 'Over het water', 'Van den Brink');
insert into bookcase (bookcase_name, user_id) values ('kast',1);
insert into book_in_bookcase values ('1234567890123',1);