use secondbook;

-- 书籍信息表
drop table if exists book_info;
create table book_info (
  book_id           bigint(20)      not null auto_increment    comment '书籍id',
  isbn              varchar(13)     not null                   comment '标准书号',
  book_name         varchar(50)     not null                   comment '书名',
  book_cover_img    varchar(200)    default ''                 comment '封面',
  author            varchar(30)     default ''                 comment '作者',
  book_desc         varchar(500)    default ''                 comment '简介',
  if_translation    int(1)          default 0                  comment '是否为译本',
  initial_title     varchar(50)     default ''                 comment '原书题目',
  initial_lang      int(3)          default 0                  comment '原书语言',
  translator        varchar(30)     default ''                 comment '译者',
  lang              int(3)          default 0                  comment '语言',
  publishing        varchar(30)     default null               comment '出版社',
  publish_time      varchar(50)     default null               comment '出版时间',

  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	    datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (book_id)
) engine=innodb comment = '书籍信息表';

-- 初始化-书籍信息表数据
insert into book_info values(1,  '9787301259702', '语言学的邀请', '', '塞缪尔·早川; 艾伦·早川', '语言的本质是什么？语言如何塑造我们的想法，影响我们的决策和评判？', 1, 'Language in Thought and Action', 3, '柳之元', 1, '北京大学出版社', '201507', 'admin', sysdate(), '', null);
insert into book_info values(2,  '9780300188226', 'the theory that would not die', '', 'Sharon Bertsch McGrayne', 'How Bayes'' Rule Cracked the Enigma Code, Hunted Down Russian Submarines, and Emerged Triumphant from Two Centuries of Controversy', 0, '', 0, '', 2, 'Yale University Press', '20110517', 'admin', sysdate(), '', null);
insert into book_info values(3,  '9787020135639', '我与地坛', '', '史铁生', '要是有些事我没说，地坛，你别以为是我忘了，我什么也没忘；但是有些事只适合收藏，不能说，不能想，却又不能忘……', 0, '', 0, '', 1, '人民文学出版社', '200809', 'admin', sysdate(), '', null);
insert into book_info values(4,  '9787544745239', '数学', '', '高尔斯（Gowers，T.）', '从基本的概念，到哲学探究，再到与数学共同体相关的一般社会学问题，本书揭开了空间和数的神秘面纱之一角。', 1, '', 3, '', 1, '译林出版社', '201403', 'admin', sysdate(), '', null);
insert into book_info values(5,  '9787535795014', '比天空更宽广', '', 'Gerald M.Edelman', '雨果说：世界上最广阔的是大海，比大海更广阔的是天空，比天空更广阔的是人的心灵。', 1, 'Wider Than the Sky', 3, '唐璐', 1, '湖南科学技术出版社', '201801', 'admin', sysdate(), '', null);
insert into book_info values(6,  '9787513585675', '大家的日语：第二版. 初级1', '', '日本3A出版社', '本书正如书名《大家的日语》所示，是一本为了使每一个初学日语的人都能够愉快地学习，而且教师也可以兴致勃勃地教下去，花费了三年多的时间编写而成的正式教科书。', 0, '', 0, '', 1, '外语教学与研究出版社', '201705', 'admin', sysdate(), '', null);
insert into book_info values(7,  '9787532775446', '悲剧的诞生：尼采美学文选', '', '弗里德里希·尼采', '收入了尼采1881至1889年的著述，大致相当于其思想发展的后期。', 1, 'Die Geburt der Tragödie', 5, '周国平', 1, '上海译文出版社', '201708', 'admin', sysdate(), '', null);

-- 作者、译者信息表
drop table if exists auth_trans_info;
create table auth_trans_info (
  auth_trans_id         bigint(20)      not null auto_increment    comment '作者、译者id',
  auth_trans_name       varchar(30)     not null                   comment '作者、译者名字',
  auth_trans_home       varchar(20)     default ''                 comment '作者、译者国籍',
  auth_trans_desc       varchar(300)    default ''                 comment '作者、译者介绍',
  create_by             varchar(64)     default ''                 comment '创建者',
  create_time           datetime                                   comment '创建时间',
  update_by             varchar(64)     default ''                 comment '更新者',
  update_time           datetime                                   comment '更新时间',
  primary key (auth_trans_id)
) engine=innodb auto_increment=100 comment = '作者、译者信息表';

-- 用户信息表
drop table if exists user_info;
create table user_info (
   user_id           bigint(20)      not null auto_increment    comment '用户id',
   user_name         varchar(20)     not null                   comment '用户名',
   `password`        varchar(20)     not null                   comment '密码',
   bio               varchar(30)     null                       comment '简介',
   user_role         int             default 0                  comment '用户角色(0买家, 1卖家)',
   avatar_img        varchar(50)     default ''                 comment '头像',

   create_by         varchar(64)     default ''                 comment '创建者',
   create_time 	     datetime                                   comment '创建时间',
   update_by         varchar(64)     default ''                 comment '更新者',
   update_time       datetime                                   comment '更新时间',
   primary key (user_id)
) engine=innodb comment = '用户信息表';

-- 地址信息表
drop table if exists addr_info;
create table addr_info (
   addr_id          bigint(20)      not null auto_increment     comment '地址id',
   user_id          bigint(20)      not null                    comment '用户id',
   addr_uname       varchar(50)     default ''                  comment '姓名',
   addr_phone       char(11)        default ''                  comment '手机号',
   addr_prov        varchar(50)     default ''                  comment '地址省',
   addr_city        varchar(50)     default ''                  comment '地址市',
   addr_region      varchar(50)     default ''                  comment '地址区',
   addr_full        varchar(50)     default ''                  comment '详细地址',
   addr_user        bigint          default null                comment '所属用户',
   is_default       bigint          default '0'                 comment '是否默认 0非默认，1默认',

   create_by         varchar(64)     default ''                 comment '创建者',
   create_time 	     datetime                                   comment '创建时间',
   update_by         varchar(64)     default ''                 comment '更新者',
   update_time       datetime                                   comment '更新时间',
   primary key (addr_id),
   constraint `ad_fk` foreign key (`user_id`) references `user_info` (`user_id`) on delete cascade
) engine=innodb comment = '地址信息表';

-- 订单信息表
drop table if exists `order_info`;
create table `order_info`
(
    order_id            bigint(20)      not null auto_increment     comment '订单id',
    order_code          varchar(30)     not null                    comment '订单号码',
    order_buyer_id      bigint(20)      not null                    comment '买家id',
    order_seller_id     bigint(20)      not null                    comment '卖家id',
    order_status        int             default 0 not null          comment '订单状态',
    total_count         int             not null                    comment '总数量',
    total_price         double          default 0 not null          comment '总价',
    receiver_addr       varchar(50)     not null                    comment '收货地址',
    receiver_info       varchar(50)     not null                    comment '收货人信息',

    create_by           varchar(64)     default ''                  comment '创建者',
    create_time 	    datetime                                    comment '创建时间',
    update_by           varchar(64)     default ''                  comment '更新者',
    update_time         datetime                                    comment '更新时间',
    primary key (order_id)
) engine=innodb comment '订单信息表';
create unique index `order-info_order_code_uindex`
    on `order_info` (order_code);

-- 订单商品信息表
drop table if exists order_item_info;
create table order_item_info (
    item_id             bigint(20)      not null auto_increment    comment '小项id',
    order_id            bigint(20)      not null                   comment '订单id',
    book_id             bigint(20)      not null                   comment '书籍id',
    item_num            int             not null                   comment '订单商品数量',
    item_price          double          not null                   comment '商品单价',

    create_by           varchar(64)     default ''                 comment '创建者',
    create_time 	    datetime                                   comment '创建时间',
    update_by           varchar(64)     default ''                 comment '更新者',
    update_time         datetime                                   comment '更新时间',
    primary key (item_id),
    constraint `or_it_fk` foreign key (`order_id`) references `order_info` (`order_id`) on delete cascade
) engine=innodb comment = '订单商品信息表';

-- 店铺信息表
drop table if exists store_info;
create table store_info (
    store_id         bigint(20)      not null auto_increment    comment '用户id',
    store_name       varchar(20)     not null                   comment '书店名称',
    store_desc       varchar(200)    null                       comment '书店简介',
    owner_id         bigint(20)      not null                   comment '店主账号',

    create_by        varchar(64)     default ''                 comment '创建者',
    create_time 	 datetime                                   comment '创建时间',
    update_by        varchar(64)     default ''                 comment '更新者',
    update_time      datetime                                   comment '更新时间',
    primary key (store_id),
    constraint `st_fk` foreign key (`owner_id`) references `user_info` (`user_id`) on delete cascade
) engine=innodb comment = '店铺信息表';

-- 商品信息表
drop table if exists pd_info;
create table pd_info (
    pd_id               bigint(20)      not null auto_increment     comment '用户id',
    owner_id            bigint(20)      not null                    comment '物主id',
    store_id            bigint(20)      not null                    comment '店铺id',
    book_id             bigint(20)      not null                    comment '书籍id',
    pd_num              int(5)          not null                    comment '商品数量',
    pd_price            double          not null                    comment '价格',

    create_by           varchar(64)     default ''                  comment '创建者',
    create_time 	    datetime                                    comment '创建时间',
    update_by           varchar(64)     default ''                  comment '更新者',
    update_time         datetime                                    comment '更新时间',
    primary key (pd_id),
    constraint `pd_us_fk` foreign key (`owner_id`) references `user_info` (`user_id`) on delete cascade
) engine=innodb comment = '商品信息表';

-- 语言字典表
drop table if exists dict_lang;
create table dict_lang (
    lang_id             int(3)          not null     comment '语言id',
    lang_name           varchar(20)     not null     comment '语言名'
) engine=innodb comment = '语言字典表';
-- 插入语言信息
insert into dict_lang values(1, '简体中文');
insert into dict_lang values(2, '繁体中文');
insert into dict_lang values(3, '英语');
insert into dict_lang values(4, '法语');
insert into dict_lang values(5, '德语');
insert into dict_lang values(6, '意大利语');
insert into dict_lang values(7, '日语');
insert into dict_lang values(8, '韩文');
insert into dict_lang values(9, '西班牙语');
insert into dict_lang values(10, '俄语');

-- 购物车信息表
drop table if exists cart_info;
create table cart_info (
    cart_id           bigint(20)      not null auto_increment    comment '购物车id',
    pd_id             bigint(20)      not null                   comment '商品id',
    user_id           bigint          not null                   comment '账号',
    pd_cart_num       int(5)          not null                   comment '购物车中商品数量',

    create_by         varchar(64)     default ''                 comment '创建者',
    create_time 	  datetime                                   comment '创建时间',
    update_by         varchar(64)     default ''                 comment '更新者',
    update_time       datetime                                   comment '更新时间',
    primary key (cart_id)
) engine=innodb comment = '购物车信息表';
