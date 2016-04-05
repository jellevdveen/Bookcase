drop table if exists user;
drop table if exists book;
drop table if exists bookcase;
drop table if exists book_in_bookcase;

create table user
(
	user_id			int auto_increment,
    password_hash	varchar(40) not null,
    user_name		varchar(20) not null,
    primary key (user_id)
);

create table book
(
	isbn			varchar(13) not null,
    title			varchar(80) not null,
    author			varchar(60) not null,
    primary key (isbn)
);    

create table bookcase
(
	title			varchar(60) not null,
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