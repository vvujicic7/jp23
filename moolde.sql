# c:\xampp\mysql\bin\mysql -uedunova -pedunova < d:\jp23\moolde.sql
drop database if exists moolde;
create database moolde;

use moolde;

create table assignsubmission_file(
    id BIGINT (10),
    assignm_ent BIGINT (10),
    submission BIGINT (10),
    num_files BIGINT (10)
);

create table assign_submission(
    id BIGINT (10),
    assignm_ent BIGINT (10),
    userid BIGINT (10),
    timecreated BIGINT (10),
    status varchar (10),
    groupid BIGINT (10),
    attemptnumber BIGINT (10)
);

create table assignsubmission_onlinetext(
    id bigint (10),
    assignm_ent bigint (10),
    submission bigint (10),
    onlinetext longtext,
    onlineform_at smallint (4)
);

create table assign_user_flags(
    id bigint (10),
    userid bigint (10),
    assignm_ent bigint (10),
    locked bigint (10),
    mailed smallint (4),
    extensionduedate bigint (10),
    workflowstate varchar (20),
    allocatedmarker bigint (10)
);

create table assign_plugin_config(
    id bigint (10),
    assignm_ent bigint (10),
    plugin varchar (28),
    subtype varchar (28),
    name varchar (28),
    value longtext
);

create table assignfeedback_file(
    id bigint (10),
    assignm_ent bigint (10),
    grade bigint (10),
    num_files bigint (10)
);

create table assign(
    id bigint (10),
    course bigint(10),
    name varchar(255),
    intro longtext,
    introformat smallint(4),
    alwaysshowdescription tinyint(2),
    nosubmissions tinyint(2),
    submissiondrafts tinyint(2),
    sendnotifications tinyint(2),
    sendlatenotifications tinyint(2),
    duedate bigint(10),
    allowsubmissionsfromdate bigint(10),
    grade bigint(10),
    timemodified bigint(10),
    requiresubmissionstatem_ent tinyint(2),
    completionsubmit tinyint(2),
    cutoffdate bigint(10),
    teamsubmission tinyint(2),
    requireallteammemberssubmit tinyint(2),
    teamsubmissiongroupingid bigint(10),
    blindmaking tinyint(2),
    revealdentities tinyint(2),
    attemptreopenmethod varchar(10),
    maxattem_pts mediumint(6),
    markingworkflow tinyint(2),
    markingallocation tinyint(2),
    sendstudentnotifications tinyint(2)
);

create table assignfeedback_editpdf_quick(
    id bigint(10),
    userid bigint(10),
    rawtext longtext,
    width bigint(10),
    colour varchar(10)
);

create table assignfeedback_comments(
    id bigint(10),
    assignm_ent bigint(10),
    grade bigint(10),
    commenttext longtext,
    commentformat smallint(4)
);

create table assignfeedback_editpdf_annot(
    id bigint(10),
    gradeid bigint(10),
    pageno bigint(10),
    x bigint(10),
    y bigint(10),
    endx bigint(10),
    endy bigint(10),
    path longtext,
    type varchar(10),
    colour varchar(10),
    draft tinyint(2)
);

create table assign_user_mapping(
    id bigint(10),
    assignm_ent bigint(10),
    userid bigint(10)
);

create table assign_grades(
    id bigint(10),
    assignm_ent bigint(10),
    userid bigint(10),
    timecreated bigint(10),
    timemodified bigint(10),
    grader bigint(10),
    grade decimal(10,5),
    attemptnumber bigint(10)
);

create table assignfeedback_editpdf_cmnt(
    id bigint(10),
    gradeid bigint(10),
    x bigint(10),
    y bigint(10),
    width bigint(10),
    rawtext longtext,
    pageno bigint(10),
    colour varchar(10),
    draft tinyint(2)
);






