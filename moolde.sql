# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\moolde.sql
drop database if exists moolde;
create database moolde;

use moolde;

create table assignsubmission_file(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    submission BIGINT (10),
    num_files BIGINT (10)
);

create table assign_submission(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    userid BIGINT (10),
    timecreated BIGINT (10),
    status VARCHAR (10),
    groupid BIGINT (10),
    attemptnumber BIGINT (10)
);

create table assignsubmission_onlinetext(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    submission BIGINT (10),
    onlinetext longtext,
    onlineform_at SMALLINT (4)
);

create table assign_user_flags(
    id BIGINT (10) not null primary key auto_increment,
    userid BIGINT (10),
    assignment BIGINT (10),
    locked BIGINT (10),
    mailed SMALLINT (4),
    extensionduedate BIGINT (10),
    workflowstate VARCHAR (20),
    allocatedmarker BIGINT (10)
);

create table assign_plugin_config(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    plugin VARCHAR (28),
    subtype VARCHAR (28),
    name VARCHAR (28),
    value LONGTEXT
);

create table assignfeedback_file(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    grade BIGINT (10),
    num_files BIGINT (10)
);

create table assign(
    id BIGINT (10) not null primary key auto_increment,
    course BIGINT (10),
    name VARCHAR (255),
    intro LONGTEXT,
    introformat SMALLINT (4),
    alwaysshowdescription TINYINT(2),
    nosubmissions TINYINT(2),
    submissiondrafts TINYINT(2),
    sendnotifications TINYINT(2),
    sendlatenotifications TINYINT(2),
    duedate BIGINT (10),
    allowsubmissionsfromdate BIGINT (10),
    grade BIGINT (10),
    timemodified BIGINT (10),
    requiresubmissionstatement TINYINT(2),
    completionsubmit TINYINT(2),
    cutoffdate BIGINT (10),
    teamsubmission TINYINT(2),
    requireallteammemberssubmit TINYINT(2),
    teamsubmissiongroupingid BIGINT (10),
    blindmaking TINYINT(2),
    revealdentities TINYINT(2),
    attemptreopenmethod VARCHAR (10),
    maxattem_pts MEDIUMINT (6),
    markingworkflow TINYINT(2),
    markingallocation TINYINT(2),
    sendstudentnotifications TINYINT(2)
);

create table assignfeedback_editpdf_quick(
    id BIGINT (10) not null primary key auto_increment,
    userid BIGINT (10),
    rawtext LONGTEXT,
    width BIGINT (10),
    colour VARCHAR (10)
);

create table assignfeedback_comments(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    grade BIGINT (10),
    commenttext LONGTEXT,
    commentformat SMALLINT (4)
);

create table assignfeedback_editpdf_annot(
    id BIGINT (10) not null primary key auto_increment,
    gradeid BIGINT (10),
    pageno BIGINT (10),
    x BIGINT (10),
    y BIGINT (10),
    endx BIGINT (10),
    endy BIGINT (10),
    path LONGTEXT,
    type VARCHAR (10),
    colour VARCHAR (10),
    draft TINYINT(2)
);

create table assign_user_mapping(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    userid BIGINT (10)
);

create table assign_grades(
    id BIGINT (10) not null primary key auto_increment,
    assignment BIGINT (10),
    userid BIGINT (10),
    timecreated BIGINT (10),
    timemodified BIGINT (10),
    grader BIGINT (10),
    grade DECIMAL (10,5),
    attemptnumber BIGINT (10)
);

create table assignfeedback_editpdf_cmnt(
    id BIGINT (10) not null primary key auto_increment,
    gradeid BIGINT (10),
    x BIGINT (10),
    y BIGINT (10),
    width BIGINT (10),
    rawtext LONGTEXT,
    pageno BIGINT (10),
    colour VARCHAR (10),
    draft TINYINT(2)
);

alter table assignsubmission_file add foreign key (submission) references assign_submission (id);
alter table assignsubmission_file add foreign key (assignment) references assign (id);

alter table assignsubmission_onlinetext add foreign key (submission) references assign_submission (id);
alter table assignsubmission_onlinetext add foreign key (assignment) references assign (id);

alter table assign_submission add foreign key (assignment) references assign (id);

alter table assign_user_flags add foreign key (assignment) references assign (id);

alter table assign_plugin_config add foreign key (assignment) references assign (id);

alter table assignfeedback_comments add foreign key (assignment) references assign (id);
alter table assignfeedback_comments add foreign key (grade) references assign_grades (id);

alter table assignfeedback_editpdf_annot add foreign key (gradeid) references assign_grades (id);

alter table assign_user_mapping add foreign key (assignment) references assign (id);

alter table assign_grades add foreign key (assignment) references assign (id);

alter table assignfeedback_editpdf_cmnt add foreign key (gradeid) references assign_grades (id);

alter table assignfeedback_file add foreign key (grade) references assign_grades (id);

alter table assignfeedback_file add foreign key (assignment) references assignfeedback_editpdf_quick (id);

alter table assignfeedback_editpdf_quick add foreign key (userid) references assign (id);








