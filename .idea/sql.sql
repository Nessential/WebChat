create database `building`;
use `building`;
DROP TABLE IF EXISTS `user`;
create table `user`
(
    `uid`      int(10) AUTO_INCREMENT,
    `username` varchar(30),
    `password` varchar(30),
    `picture`  MEDIUMBLOB,
    KEY `uid` (`uid`)
);
insert into `user` (`uid`,`username`,`password`,`picture`)values
                                                              (1,"admin","123456","data:image/png;base64,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"),
                                                              (2,"friend","123456","data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABkAAAAZCAYAAADE6YVjAAAAAXNSR0IArs4c6QAAAZVJREFUSEvtlbFOwlAYhc/dbLtRwmJpGISSmABRB1tiGY0v4VvI5COw+hA+AxsN7SIRSEgETBCsg6a4tYzX9GIrtYDp4NY73rb/9//nnHtLGpdXFP+8SApJonAqVxK1QG7v7qlePMCib8KwBpi5WRxrKnStiCwhrBj1bPS6Foz+Au73nr8vyFXomopTiQ+hzsREx7TgiH4NFWWRgLTbbUqp9wtSRYF3MDKfgZKKRr0C8XPIPu4tvLBgTjnHhaYATxYMc4yPjQZych4CBd7nHshNs0UV7QiYWGySF2/dfbBoVmEd6aKDnu2BiCWUMWXAV66yE7JZg1w3W1TfA/G79SH51ZBBBKkagQSS7JN0LyQAKNxbzBNKeRRqayll/mf6wJORJ+NMVaHXDrEVQqkYmi+u4oBt0QpCcMLZTEpjvAxfi0FmrhB2uM3sXdnd9O5vCF9mHjRKmWgAlpOo8d0pVhkRAhyMHj0U6uvYY2qh050Ckhw+i0+SBCJVIufJtQdMqoc5Fzlr6d2V7O5K/4xJ9ErTlUQtfAEAIR3uzEmXVAAAAABJRU5ErkJggg==");

create unique index user_id_uindex
    on `user` (`uid`);

create unique index user_username_uindex
    on `user` (`username`);

create table `chat`
(
    `name`  varchar(30),
    `value` varchar(200),
    `time`  bigint
);
insert into `chat`(`name`,`value`,`time`)values
                                             ("admin","这是一条测试信息",1616547040000),
                                             ("friend","testtest",1616547048000);
create table `online`
(
    `username` varchar(30),
    `overdue` bigint

);

create unique index online_uid_uindex
    on `online` (`uid`);





