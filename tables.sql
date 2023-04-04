use secondbook;

-- 书籍信息表
drop table if exists book_info;
create table book_info (
  book_id           bigint(20)      not null auto_increment    comment '书籍id',
  isbn              varchar(13)     not null                   comment '标准书号',
  book_name         varchar(50)     not null                   comment '书名',
  book_cover_img    varchar(200)    default ''                 comment '封面',
  author            varchar(30)     default ''                 comment '作者',
  translator        varchar(30)     default ''                 comment '译者',
  book_desc         varchar(500)    default ''                 comment '简介',
  publishing        varchar(30)     default null               comment '出版社',
  publish_time      varchar(50)     default null               comment '出版时间',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	    datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (book_id)
) engine=innodb comment = '书籍信息表';

-- 初始化-书籍信息表数据
insert into book_info values(1,  '9787301259702', '语言学的邀请', '', '塞缪尔·早川; 艾伦·早川', '柳之元','语言的本质是什么？语言如何塑造我们的想法，影响我们的决策和评判？', '北京大学出版社', '201507', 'admin', sysdate(), '', null);
insert into book_info values(2,  '9780300188226', 'the theory that would not die', '', 'Sharon Bertsch McGrayne', '','How Bayes'' Rule Cracked the Enigma Code, Hunted Down Russian Submarines, and Emerged Triumphant from Two Centuries of Controversy', 'Yale University Press', '20110517', 'admin', sysdate(), '', null);
insert into book_info values(3,  '9787020135639', '我与地坛', '', '史铁生', '','要是有些事我没说，地坛，你别以为是我忘了，我什么也没忘；但是有些事只适合收藏，不能说，不能想，却又不能忘……', '人民文学出版社', '200809', 'admin', sysdate(), '', null);
insert into book_info values(4,  '9787544745239', '数学', '', '高尔斯（Gowers，T.）', '刘熙','从基本的概念，到哲学探究，再到与数学共同体相关的一般社会学问题，本书揭开了空间和数的神秘面纱之一角。', '译林出版社', '201403', 'admin', sysdate(), '', null);
insert into book_info values(5,  '9787535795014', '比天空更宽广', '', 'Gerald M.Edelman', '唐璐','雨果说：世界上最广阔的是大海，比大海更广阔的是天空，比天空更广阔的是人的心灵。', '湖南科学技术出版社', '201801', 'admin', sysdate(), '', null);

-- 作者信息表
drop table if exists author_info;
create table author_info (
  author_id         bigint(20)      not null auto_increment    comment '作者id',
  author_name       varchar(30)     not null                   comment '作者名字',
  author_home       varchar(20)     default ''                 comment '作者国籍',
  author_desc       varchar(100)    default ''                 comment '作者介绍',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (author_id)
) engine=innodb auto_increment=100 comment = '作者信息表';

-- 译者信息表
drop table if exists translator_info;
create table translator_info (
  translator_id     bigint(20)      not null auto_increment    comment '译者id',
  translator_name   varchar(30)     not null                   comment '译者名字',
  translator_home   varchar(20)     default ''                 comment '译者国籍',
  translator_desc   varchar(100)    default ''                 comment '译者介绍',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (translator_id)
) engine=innodb auto_increment=100 comment = '译者信息表';

-- 书籍作者关联表
drop table if exists book_author;
create table book_author (
  book_id           bigint(20)      not null                   comment '书籍id',
  author_id         bigint(20)      not null                   comment '作者id',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (book_id, author_id),
  foreign key (book_id) references book_info(book_id),
  foreign key (author_id) references author_info(author_id)
) engine=innodb comment = '书籍作者关联表';

-- 书籍译者关联表
drop table if exists book_translator;
create table book_translator (
  book_id           bigint(20)      not null                   comment '书籍id',
  translator_id     bigint(20)      not null                   comment '译者id',
  primary key (book_id, translator_id),
  foreign key (book_id) references book_info (book_id),
  foreign key (translator_id) references translator (translator_id)
) engine=innodb comment = '书籍译者关系表';