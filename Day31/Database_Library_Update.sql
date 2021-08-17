use library;

SELECT * FROM library.tranbook;

alter table tranbook add tid int auto_increment primary key;

alter table transreturn add tid int auto_increment primary key;